/**
 * Created by Mark on 24.05.2016.
 */
public class NegativeTextAnalyzer extends KeyWordAnalyzer implements TextAnalyzer{

    @Override
    String getKeywords() {
        return ":(,=(,:|";
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
    @Override
    public Label processText(String text) {

        for (String smile : getKeywords().split(",")){
            if (text.contains(smile)) return getLabel();
            else return Label.OK;
        }

        return null;
    }
}