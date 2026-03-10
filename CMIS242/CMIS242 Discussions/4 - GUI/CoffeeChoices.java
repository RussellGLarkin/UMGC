import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

class CoffeeChoices extends JFrame{
  public static void main(String args[]){
	  CoffeeChoices frame = new CoffeeChoices("Which coffee do you like");
    frame.setVisible(true);
  }

  CoffeeChoices(String title){
    setTitle(title);
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JCheckBox check1 = new JCheckBox("American Coffee");
    JCheckBox check2 = new JCheckBox();
    check2.setText("Cappuccino");

    JPanel p = new JPanel();
    p.add(check1);
    p.add(check2);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}