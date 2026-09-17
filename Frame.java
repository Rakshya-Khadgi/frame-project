//Java Frame
import javax.swing.JFrame;

public class Frame  {
    public static void main(String[] args){
System.out.println("This change is from feature branch");
        JFrame frame = new JFrame("My Frame");

        frame.setSize(500,400);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.setVisible(true);
    }
}