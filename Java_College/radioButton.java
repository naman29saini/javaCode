import javax.swing.*;

public class radioButton {
    JFrame jf;
    JRadioButton b1,b2,b3;
    JCheckBox c1,c2,c3;
    ButtonGroup bg;
    JComboBox cb1;
    JLabel l1,l2,l3;
    radioButton()
    {
        jf=new JFrame("Radio Buttons");
        b1=new JRadioButton("RadioButton 1");
        b2=new JRadioButton("RadioButton 2");
        b3=new JRadioButton("RadioButton 3");
        c1=new JCheckBox("CheckBox 1");
        c2=new JCheckBox("CheckBox 2");
        c3=new JCheckBox("CheckBox 3");
        l1=new JLabel("CheckBox:");
        l2=new JLabel("RadioButton:");
        l3=new JLabel("ComboBox:");
        bg=new ButtonGroup();
        String str[]={"Delhi","Rohtak","Karnal","Ambala"};
        cb1=new JComboBox(str);
        jf.setBounds(10, 20, 500, 800);
        l1.setBounds(10,10,170,40);
        c1.setBounds(10, 50, 170, 40);
        c2.setBounds(10, 90, 170, 40);
        c3.setBounds(10, 130, 170, 40);
        l2.setBounds(10,180,170,40);
        b1.setBounds(10, 230, 170, 40);
        b2.setBounds(10, 270, 170, 40);
        b3.setBounds(10, 310, 170, 40);
        l3.setBounds(10,370,170,40);
        cb1.setBounds(10, 410, 170, 40);
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(cb1);
        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new radioButton();
    }
}
