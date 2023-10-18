import javax.swing.*;

public class ScrollPane {
    JFrame jf;
    JTextArea t1;
    JScrollPane sp;
    ScrollPane(){
        jf=new JFrame("Scroll Pane");
        t1=new JTextArea(30,20);
        sp=new JScrollPane(t1);
        // sp.addVerticalScrollBarPolicy(JFrame.VERTICAL_SCROLLBAR_ALWAYS);
        // sp.addHorizontalScrollBarPolicy(JFrame.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(sp);
        jf.setBounds(10,20,400,700);
        // jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }


    public static void main(String[] args) {
        new ScrollPane();
    }
}
