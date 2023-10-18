import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode; 

public class Tree_Stru {
    JFrame jf;
    JTree jt;
    // JDefaultMutableTreeNode a;
    DefaultMutableTreeNode a,b,c,d,e,f,g,h;
    Tree_Stru()
    {
        jf=new JFrame("Tree Structure");
        b=new DefaultMutableTreeNode("B");
        c=new DefaultMutableTreeNode("C");
        d=new DefaultMutableTreeNode("D");
        e=new DefaultMutableTreeNode("E");
        f=new DefaultMutableTreeNode("F");
        g=new DefaultMutableTreeNode("G");
        h=new DefaultMutableTreeNode("H");
        a=new DefaultMutableTreeNode("A");
        a.add(b);
        a.add(c);
        b.add(d);
        b.add(e);
        b.add(f);
        c.add(g);
        c.add(h);
        jt=new JTree(a);
        jf.add(jt);
        jf.setBounds(10,20,600,900);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
    public static void main(String[] args) {
        new Tree_Stru();
    }
}
