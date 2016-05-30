/**
 * Created by Mark on 24.05.2016.
 */
public class NegativeTextAnalyzer extends KeyWordAnalyzer implements TextAnalyzer{

    @Override
    String[] getKeywords() {
        return new String[]{":(","=(",":|"};
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}