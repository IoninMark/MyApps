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
    @Override
    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.contains(getKeywords()[i])) return getLabel();
        }

        return Label.OK;
    }
}