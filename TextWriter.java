
/**
 * Write a description of class TextWriter here.
 *
 * @author (Hemanth Panditi)
 * @version (1-23-21)
 */
public class TextWriter {
    private String textToDisplay; 
    
    public TextWriter() {
        textToDisplay = "";
    }

    public TextWriter(String inputText) {
        textToDisplay = inputText;
    }

    public void setTextToDisplay(String inputText) {
        textToDisplay = inputText;
    }

    public String getTextToDisplay() {
        return textToDisplay;
    }

    public void clearTextToDisplay() {
        textToDisplay = "";
    }
    public void display() {
        System.out.println(textToDisplay);

    }
}
