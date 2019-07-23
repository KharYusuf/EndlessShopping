
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cart.java
 *
 * Created on Jan 10, 2016, 6:24:29 PM
 */

/**
 *
 * @author Welcome
 */
public class cart extends javax.swing.JFrame {

    /** Creates new form cart */
    public cart() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 640));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ));
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(62, 160, 900, 360);

        jButton1.setBackground(new java.awt.Color(217, 66, 85));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buy");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 550, 160, 40);

        jButton4.setBackground(new java.awt.Color(217, 66, 85));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Remove from cart");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(540, 550, 160, 40);

        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(933, 0, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 530, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Total :");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 530, 80, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(500, 110, 140, 40);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setText("Welcome");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(390, 110, 120, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connectivity/images/ippro/childrens/cart.png"))); // NOI18N
        jLabel4.setAutoscrolls(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1030, 640);
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        

 jButton2.setOpaque(false);
jButton2.setContentAreaFilled(false);
jButton2.setBorderPainted(false);

 jTextField1.setOpaque(true);
        jTextField3.setOpaque(true);

        try{
Class.forName("java.sql.Driver");
Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","123");
Statement st=conn.createStatement();

ResultSet rs=st.executeQuery("Select username from carthistory order by username_id desc limit 1;");
        
       
        while(rs.next()){
       String username=rs.getString("username");
            jTextField1.setText(username);}
        }
        
        
        
        catch(Exception e){
        
        }
        
DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
try{
Class.forName("java.sql.Driver");
Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","123");
Statement st1=conn.createStatement();
ResultSet rs= st1.executeQuery("Select*from hhh;");
while(rs.next()){
    String name=rs.getString("a");
    int price=rs.getInt("b");
 dtm.addRow(new Object [] {name,price});
}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,e);
}
     
        
try{
Class.forName("java.sql.Driver");
Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","123");
Statement st1=conn.createStatement();
st1.executeUpdate("delete from hhh;");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,e);
}


int total=0;
for(int i = 0; i < jTable2.getRowCount(); i++)
{
        int Amount = Integer.parseInt(jTable2.getValueAt(i, 1)+"");
        total = Amount+total;
}
jLabel2.setText(total+"");    


 
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 JOptionPane.showMessageDialog(null,"Thank you for shopping! Your products will be delivered within 4 business days");       
        
        try{
Class.forName("java.sql.Driver");
Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","123");
Statement st1=conn.createStatement();
st1.executeUpdate("Insert into signhistory(username) Values(' "+jTextField1.getText()+"');");
for(int i = 0; i < jTable2.getRowCount(); i++)
{
        String a=(String) jTable2.getValueAt(i,0);
        int amt = Integer.parseInt(jTable2.getValueAt(i, 1)+"");
         Date date = new Date();
        st1.executeUpdate("insert into "+jTextField1.getText()+" values('"+a+"',"+amt+",'"+date+"');");
}


}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,e);
}
     this.setVisible(false);
     new MF1().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
       
        
        try{
Class.forName("java.sql.Driver");
Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","123");
Statement st=conn.createStatement();
st.executeUpdate("Insert into signhistory(username) Values(' "+jTextField1.getText()+"');");
        }
        catch(Exception e){
        
        }
       this.setVisible(false);
     new MF1().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
