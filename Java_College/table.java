import javax.swing.*;

public class table {
    JFrame jf;
    JTable jt;
     Object  [][] obj11={{1,252102071,89},{1,252102071,89},{1,252102071,89}};
        String obj21[]={"S.No","Roll No.","Marks"};
    table()
    {
       
        jf=new JFrame("Table");
        jt=new JTable(obj11,obj21);
        jf.add(jt);
        jf.setBounds(10,20,700,700);
        jt.setBounds(10, 020, 400, 100);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new table();
    }
}
