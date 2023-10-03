import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;
class button_event implements ActionListener {
    JFrame jf;
    JButton b1;
    JTextField t1;
    JTextField t2;

button_event(){
jf=new JFrame("Testing");
b1=new JButton("SET");
t2=new JTextField();
t1=new JTextField();
jf.setBounds(75,150,400,500);
b1.setBounds(15,100,100,30);
t1.setBounds(15,20,100,40);
t2.setBounds(15,60,100,40);
jf.setLayout(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
jf.add(b1);
jf.add(t1);
jf.add(t2); 
b1.setVisible(true);
t2.setVisible(true);
t1.setVisible(true);
b1.addActionListener(this);

}
public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1)
    {
        int num1=Integer.parseInt(t1.getText());
        t2.setText(String.valueOf(num1));
    }
}
public static void main(String[] args) {
    new button_event();
}


}


