/**
 * Created by Mark on 24.05.2016.
 */
public class SpamAnalyzer extends KeyWordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.contains(getKeywords()[i])) return getLabel();
          }
        return Label.OK;
    }
}
