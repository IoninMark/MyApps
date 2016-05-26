/**
 * Created by Mark on 24.05.2016.
 */
public class SpamAnalyzer extends KeyWordAnalyzer implements TextAnalyzer {

    private String keywords = "sex,drugs,rock'n'roll";

    public SpamAnalyzer(String keywords) {
        this.keywords = keywords;
    }

    @Override
    String getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {

        for (String keyword : getKeywords().split(",")){
            if (text.contains(keyword)) return getLabel();
            else return Label.OK;
        }
        return null;
    }
}
