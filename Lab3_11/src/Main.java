
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // String input  = JOptionPane.showInputDialog("ใส่ตัวเลข 2 ตัว" ,"0");
        //  JOptionPane.showMessageDialog(null,"message","title",JOptionPane.INFORMATION_MESSAGE);
        int ans=  JOptionPane.showConfirmDialog(null,"รักหรือป่าว",
                "ถามเธอ",JOptionPane.YES_NO_OPTION);

        if (ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักจะ จุ๊ปๆ");
        }  else {

            JOptionPane.showMessageDialog(null,"จำไว้เลย");



        }
    }


}