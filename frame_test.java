import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;;
public class frame_test
 {
    public static void main(String args[]) {
        JFrame frame=new JFrame();;
        JLabel label=new JLabel();
        label.setText("Hello");

    
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        
        
        
    }
    
}
