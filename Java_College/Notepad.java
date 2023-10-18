import javax.swing.*;
import java.awt.event.*;

 class Notepad implements ActionListener {
    JFrame jf;
    JTextArea ta;
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem m11,m12,m13,m14,m21,m22,m23,m24;
    JFileChooser fc;
    int r,e;
    String filename;
    Notepad()
    {
        jf=new JFrame("Notepad");
        ta=new JTextArea();
        mb=new JMenuBar();
        m2=new JMenu("File");
        m1=new JMenu("Edit");
        m11=new JMenuItem("Cut");
        m12=new JMenuItem("Copy");
        m13=new JMenuItem("Paste");
        m14=new JMenuItem("Select All");
        m21=new JMenuItem("Open");
        m22=new JMenuItem("Save");
        m23=new JMenuItem("Save As");
        m24=new JMenuItem("Print");
        fc=new JFileChooser();

        jf.setJMenuBar(mb);
        jf.add(fc);
        jf.add(ta);
        mb.add(m1);
        mb.add(m2);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);

        jf.setBounds(10,20,600,900);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);
        m24.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==m11)
        {
            ta.cut();
        }
         if(e.getSource()==m12)
        {
            ta.copy();
        }
         if(e.getSource()==m13)
        {
            ta.paste();
        }
         if(e.getSource()==m14)
        {
            ta.selectAll();
        }
        if(e.getSource()==m21)
        {
            r=fc.showOpenDialog(null);
        }
        if(e.getSource()==m22 || e.getSource()==m23)
        {
            r=fc.showSaveDialog(null);
             if(r==JFileChooser.APPROVE_OPTION)
         {
             filename=fc.getSelectedFile().getAbsolutePath();
         }
        }
        if(e.getSource()==m21)
        {
            // r=fc.showPrintDialog(null);
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
    
}
