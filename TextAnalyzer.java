import com.sun.xml.internal.ws.org.objectweb.asm.Label;

/**
 * Created by Mark on 23.05.2016.
 */
public interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}







