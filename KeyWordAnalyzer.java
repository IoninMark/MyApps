/**
 * Created by Mark on 24.05.2016.
 */
public abstract class KeyWordAnalyzer implements TextAnalyzer {

    abstract String[] getKeywords();
    abstract Label getLabel();

    @Override
    public Label processText(String text) {

        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) return getLabel();
        }
        return Label.OK;

    }
}
