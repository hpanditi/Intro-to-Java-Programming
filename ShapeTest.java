import javax.swing.*;
import java.awt.*;

public class ShapeTest extends JFrame{
    public ShapeTest(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String a[]){
        new ShapeTest();
    }

    public void paint(Graphics g){
        g.drawOval(50, 50, 50, 50); //FOR CIRCLE
        g.drawRect(50, 50, 200, 200); // FOR SQUARE
        g.drawRect(200, 100, 100, 200); // FOR RECT
    }
}