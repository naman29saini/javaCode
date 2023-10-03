import java.awt.event.*;

import javax.swing.*;

class calculator implements ActionListener{
    JFrame jf;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JLabel text1;
    JLabel text2;
    JLabel text3;
    calculator()
    {
        jf=new JFrame("Calculator");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("/");
        b4=new JButton("*");
        b5=new JButton("RESET");
        text1=new JLabel("Enter first Number:");
        text2=new JLabel("Enter second Number:");
        text3=new JLabel("Result:");

        // System.out.println("Enter first number:");
        jf.setBounds(120, 70, 700, 1000);
        text1.setBounds(10, 10, 0420, 30);
        t1.setBounds(150,10,80,30);
        text2.setBounds(10, 40, 0420, 30);
        t2.setBounds(150,40,80,30);
        text3.setBounds(10, 70, 0420, 30);
        t3.setBounds(150,70,80,30);
        b1.setBounds(10,110,100,40);
        b2.setBounds(115,110,100,40);
        b3.setBounds(220,110,100,40);
        b4.setBounds(325,110,100,40);
        b5.setBounds(158,170,100,40);
        jf.add(t1);
        jf.add(t2);
        jf.add(t3);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(text1);
        jf.add(text2);
        jf.add(text3);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int num3=num1+num2;
            t3.setText(String.valueOf((num3)));
        }
         if(e.getSource()==b2)
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int num3=num1-num2;
            t3.setText(String.valueOf((num3)));
        }
         if(e.getSource()==b3)
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int num3=num1/num2;
            t3.setText(String.valueOf((num3)));
        }
         if(e.getSource()==b4)
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int num3=num1*num2;
            t3.setText(String.valueOf((num3)));
        }
         if(e.getSource()==b5)
        {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
    }
    public static void main(String[] args) {
        new calculator();
    }
}
