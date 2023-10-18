import javax.swing.*;

public class TabbedPane{
    JFrame jf;
    JPanel p1,p2,p3;
    JTextArea t1,t2,t3;
    JTabbedPane jp;
    TabbedPane(){
        jf=new JFrame("Tabbed Pane");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        t1=new JTextArea(30,30);
        t2=new JTextArea(30,30);
        t3=new JTextArea(30,30);
        jp=new JTabbedPane();

        //adding textarea to panel
        p1.add(t1);
        p2.add(t2);
        p3.add(t3);
        //adding panel to tabbed pane
        jp.add("Open",p1);
        jp.add("Save",p2);
        jp.add("Help",p3);
        //adding tabbedpane to frame
        jf.add(jp);
        jf.setBounds(10, 20, 500, 800);
        jp.setBounds(10,20,400,300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }


    public static void main(String[] args) {
        new TabbedPane();
    }
}