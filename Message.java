
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Message extends javax.swing.JFrame {

    /**
     * Creates new form Message
     */
    String hand = "";
    Profile ob;
    public Message() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Message(String hand,Profile ob) {
        this.ob=ob;
        this.hand = hand;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 4, true));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Write your Message here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 11))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jButton1.setText("Send");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("TO:");

        jTable1.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe Script", 3, 12)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel5.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Ichat");

        jLabel3.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        jLabel3.setText("     Members");

        jButton3.setBackground(new java.awt.Color(102, 102, 0));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setText("Delete Account !");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 284, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String msg = jTextArea1.getText();
        msg=msg.trim();
        String dest = jTextField1.getText();
        dest=dest.trim();
        int tmp = 0;
        if (!dest.equals("")) {
            try {
                tmp = verify(dest);
            } catch (Exception e) {
            }
        }
        if (msg.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter some message");
        } else if (dest.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter handle");
        } else if (tmp == 1) {
            try {
                insert_msg(msg, dest);
            } catch (Exception e) {
            }
            jTextField1.setText("");
            jTextArea1.setText("");
        }
        try {
            jTextArea2.setText("");
           function();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
        try {
            function_tab();
        } catch (Exception e) {
        }
        try {
            jTextArea2.setText("");
           function();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
      new DeleteAccount(this,ob).setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked
    private void insert_msg(String msg, String dest) throws Exception {
        String driver = "com.mysql.jdbc.Driver";

        Class.forName(driver);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yidea", "root", "toor");
        System.out.println(con.toString());

        int id = getId();
        id--;
        msg = "\"" + msg + "\"";
        dest = "\"" + dest + "\"";
        String src = "\"" + hand + "\"";
        String query = "INSERT into message VALUES(" + src + "," + msg + ","+id+"," + dest + ",now());";

        System.out.println("Query :" + query);
        Statement st = con.createStatement();
        int val = st.executeUpdate(query);

        System.out.println("1 row affected");
        con.close();
        JOptionPane.showMessageDialog(rootPane, "Your Message has been send.");
    }

    private int verify(String dest) throws Exception {
        String driver = "com.mysql.jdbc.Driver";

        Statement stmt = null;
        ResultSet rs = null;
        Class.forName(driver);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yidea", "root", "toor");
        System.out.println(conn.toString());
        dest = "\"" + dest + "\"";
        String query = "select Password from yidea where Handle=" + dest + ";";
        int tmp = 0;
        try {
            // create a statement
            stmt = conn.createStatement();

            // execute query and return result as a ResultSet
            rs = stmt.executeQuery(query);

            // extract data from the ResultSet
            while (rs.next()) {
                String passOrg = rs.getString(1);
                tmp++;
            }

        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            // release database resources
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                //e.printStackTrace();
            }
        }
        if (tmp == 0) {
            JOptionPane.showMessageDialog(rootPane, "User Doesn't Exit !");
            return 5;
        }
        return 1;
    }

    private int getId() throws Exception {
        String driver = "com.mysql.jdbc.Driver";

        Statement stmt = null;
        ResultSet rs = null;
        Class.forName(driver);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yidea", "root", "toor");
        System.out.println(conn.toString());
        String query = "select id from message order by id limit 1;";
        int value = 0;
        try {
            // create a statement
            stmt = conn.createStatement();

            // execute query and return result as a ResultSet
            rs = stmt.executeQuery(query);

            // extract data from the ResultSet
            while (rs.next()) {
                String id = rs.getString(1);
                value = Integer.parseInt(id);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            // release database resources
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                //e.printStackTrace();
            }
        }
        return value;
    }
public void function() throws Exception {

        String driver = "com.mysql.jdbc.Driver";

        Class.forName(driver);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yidea", "root", "toor");
        System.out.println(con.toString());
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String temp="\""+hand+"\"";
        String query = "select handle,message,id from message where dest="+temp+" order by id ;";

        try {
            // create a statement
            stmt = con.createStatement();

            // execute query and return result as a ResultSet
            rs = stmt.executeQuery(query);

            // extract data from the ResultSet
            Object[] row = new Object[3];
            String []msg=new String[3];
            //model.setRowCount(0);
            while (rs.next()) {
                msg[0] = rs.getString(1);
                msg[1] = rs.getString(2);
                msg[2] = rs.getString(3);
                
                jTextArea2.append("@"+msg[0]+" : "+msg[1]+"\n");
                //jTextArea1.append("----------------------------\n");
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            // release database resources
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
               // e.printStackTrace();
            }
        }

    }
public void function_tab() throws Exception {

        String driver = "com.mysql.jdbc.Driver";

        Class.forName(driver);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yidea", "root", "toor");
        System.out.println(con.toString());
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "select handle from yidea;";

        try {
            // create a statement
            stmt = con.createStatement();

            // execute query and return result as a ResultSet
            rs = stmt.executeQuery(query);

            // extract data from the ResultSet
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = new Object[1];
            model.setRowCount(0);
            while (rs.next()) {
                String name = rs.getString(1);
                row[0] = name;  
                model.addRow(row);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            // release database resources
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Message().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}