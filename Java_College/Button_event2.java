import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;

 class Button_event2 implements ActionListener{
    JFrame jf;
    JButton b1;
    JTextField t1;
    JTextField t2;
    Button_event2()
    {
        jf=new JFrame("Copy of Items ");
        b1=new JButton("SET");
        t1=new JTextField();
        t2=new JTextField();
        jf.setBounds(120,170,700,1000);
        t1.setBounds(10,10,100,30);
        t2.setBounds(10,40,100,30);
        b1.setBounds(10,70,100,40);
        jf.add(t1);
        jf.add(t2);
        jf.add(b1);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int num1=Integer.parseInt(t1.getText());
            t2.setText(String.valueOf(num1));
        }
    }
    public static void main(String[] args) {
        new Button_event2();
    }
    
}
