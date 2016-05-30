/**
 * Created by Mark on 27.05.2016.
 */
public class Main {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        analyzers = new TextAnalyzer[]{
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(new String[]{"amazon", "avito"}),
                new TooLongTextAnalyzer(20),
        };

        return Label.OK;
    }
}
