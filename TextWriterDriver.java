/**
 * Write a description of class TextWriterDriver here.
 *
 * @author (Hemanth)
 * @version (1-23-21)
 */
public class TextWriterDriver {
    public static void main(String[] args) {
        TextWriter tw1;
        tw1=new TextWriter();
        tw1.setTextToDisplay("This line is from my first Java object!");
        tw1.display();
        TextWriter tw2=new TextWriter("And this line is from my second object.");
        System.out.println(tw2.getTextToDisplay());
        TextWriter tw3=new TextWriter("And this line is from my third object.");
        System.out.println(tw3.getTextToDisplay());
        tw3.display();
        tw3.clearTextToDisplay();
        System.out.println("The next line is the display after calling clearTextToDisplay:");
        tw3.display();
        System.out.println("The previous line was the display after calling clearTextToDisplay:");
        TextWriter tw4=new TextWriter("And this line is from my fourth object.");
        System.out.println(tw3.getTextToDisplay());
    }
}
