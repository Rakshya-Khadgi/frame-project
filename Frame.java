//Java Frame
import javax.swing.JFrame;

public class Frame  {
    public static void main(String[] args){

        JFrame frame = new JFrame("My Frame");

        frame.setSize(500,400);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.setVisible(true);
    }
}