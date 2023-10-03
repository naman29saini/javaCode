import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class best_calculator implements ActionListener {
    JFrame jf;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b0;
    JButton result;
    JButton reset;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JButton del;
    JButton dec;
    JTextField t1;
    static double a = 0, b = 0, res = 0;
    static int operator = 0;

    best_calculator() {
        jf = new JFrame("Calculator");
        t1 = new JTextField(null, null, 0);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        dec = new JButton(".");
        del = new JButton("Delete");
        result = new JButton("=");
        reset = new JButton("RESET", null);
        jf.setBounds(30, 40, 500, 1000);
        t1.setBounds(30, 40, 280, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        div.setBounds(250, 100, 50, 40);
        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        mul.setBounds(250, 170, 50, 40);
        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        sub.setBounds(250, 240, 50, 40);
        dec.setBounds(40, 310, 50, 40);
        b0.setBounds(110, 310, 50, 40);
        result.setBounds(180, 310, 50, 40);
        add.setBounds(250, 310, 50, 40);
        del.setBounds(60, 380, 100, 40);
        reset.setBounds(180, 380, 100, 40);
        jf.add(b0);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.add(add);
        jf.add(sub);
        jf.add(div);
        jf.add(mul);
        jf.add(del);
        jf.add(result);
        jf.add(reset);
        jf.add(dec);
        jf.add(t1);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        sub.addActionListener(this);
        result.addActionListener(this);
        dec.addActionListener(this);
        reset.addActionListener(this);
        del.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t1.setText(t1.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            t1.setText(t1.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            t1.setText(t1.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            t1.setText(t1.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            t1.setText(t1.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            t1.setText(t1.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            t1.setText(t1.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            t1.setText(t1.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            t1.setText(t1.getText().concat("9"));
        }
        if (e.getSource() == b0) {
            t1.setText(t1.getText().concat("0"));
        }
        if (e.getSource() == dec) {
            t1.setText(t1.getText().concat("."));
        }
        if (e.getSource() == reset) {
            t1.setText(null);
        }
        if (e.getSource() == add) {
            a = Double.parseDouble(t1.getText());
            operator = 1;
            t1.setText("");
        }
        if (e.getSource() == sub) {
            a = Double.parseDouble(t1.getText());
            operator = 2;
            t1.setText("");
        }
        if (e.getSource() == mul) {
            a = Double.parseDouble(t1.getText());
            operator = 3;
            t1.setText("");
        }
        if (e.getSource() == div) {
            a = Double.parseDouble(t1.getText());
            operator = 4;
            t1.setText("");
        }
        if (e.getSource() == result) {
            b = Double.parseDouble(t1.getText());
            switch (operator) {
                case 1:
                    res = a + b;
                    break;
                case 2:
                    res = a - b;
                    break;
                case 3:
                    res = a * b;
                    break;
                case 4:
                    res = a / b;
                    break;
                default:
                    res = 0;
            }
            t1.setText("" + res);
        }
        if (e.getSource() == del) {
            String s = t1.getText();
            t1.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t1.setText(t1.getText() + s.charAt(i));
        
    }

    }

    public static void main(String[] args) {
        new best_calculator();
    }

}
