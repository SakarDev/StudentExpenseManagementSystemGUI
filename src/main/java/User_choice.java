
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class User_choice extends javax.swing.JFrame {

    public static String USERNAME = "";
    public User_choice() {
        initComponents();
        this.setLocationRelativeTo(null);
        Access_class ac = new Access_class();
        jTextField_welcome.setText("Welcome " + ac.first_name);
    }
    public void setName(String username){
        Access_class ac = new Access_class();
        try {
            String user_firstName = ac.find_user_firstName(username);
            jTextField_welcome.setText("Welcome " + user_firstName);
            USERNAME = username;
                    } catch (IOException ex) {
            Logger.getLogger(User_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jButton_allBills = new javax.swing.JButton();
        jButton_myBills = new javax.swing.JButton();
        jButton_logOut = new javax.swing.JButton();
        jButton_vewMyBills = new javax.swing.JButton();
        jButton_viewCheckout = new javax.swing.JButton();
        jTextField_welcome = new javax.swing.JTextField();
        jButton_deleteItem = new javax.swing.JButton();
        jButton_checkout1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 255));

        jButton_allBills.setBackground(new java.awt.Color(12, 114, 80));
        jButton_allBills.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_allBills.setForeground(new java.awt.Color(255, 255, 255));
        jButton_allBills.setText("View All Bills");
        jButton_allBills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_allBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_allBillsMouseClicked(evt);
            }
        });
        jButton_allBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_allBillsActionPerformed(evt);
            }
        });

        jButton_myBills.setBackground(new java.awt.Color(12, 114, 80));
        jButton_myBills.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_myBills.setForeground(new java.awt.Color(255, 255, 255));
        jButton_myBills.setText("Add New Item");
        jButton_myBills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_myBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_myBillsActionPerformed(evt);
            }
        });

        jButton_logOut.setBackground(new java.awt.Color(12, 114, 80));
        jButton_logOut.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_logOut.setForeground(new java.awt.Color(255, 255, 255));
        jButton_logOut.setText("Log Out");
        jButton_logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_logOutMouseClicked(evt);
            }
        });
        jButton_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logOutActionPerformed(evt);
            }
        });

        jButton_vewMyBills.setBackground(new java.awt.Color(12, 114, 80));
        jButton_vewMyBills.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_vewMyBills.setForeground(new java.awt.Color(255, 255, 255));
        jButton_vewMyBills.setText("View My Bills");
        jButton_vewMyBills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_vewMyBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vewMyBillsActionPerformed(evt);
            }
        });

        jButton_viewCheckout.setBackground(new java.awt.Color(12, 114, 80));
        jButton_viewCheckout.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_viewCheckout.setForeground(new java.awt.Color(255, 255, 255));
        jButton_viewCheckout.setText("View Checkout");
        jButton_viewCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_viewCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewCheckoutActionPerformed(evt);
            }
        });

        jTextField_welcome.setEditable(false);
        jTextField_welcome.setBackground(new java.awt.Color(12, 114, 80));
        jTextField_welcome.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jTextField_welcome.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_welcome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_welcome.setText("Welcome");
        jTextField_welcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton_deleteItem.setBackground(new java.awt.Color(12, 114, 80));
        jButton_deleteItem.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_deleteItem.setForeground(new java.awt.Color(255, 255, 255));
        jButton_deleteItem.setText("Delete Item");
        jButton_deleteItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteItemActionPerformed(evt);
            }
        });

        jButton_checkout1.setBackground(new java.awt.Color(12, 114, 80));
        jButton_checkout1.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jButton_checkout1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_checkout1.setText("Checkout");
        jButton_checkout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_checkout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_checkout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addComponent(jTextField_welcome)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_allBills, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_vewMyBills, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_viewCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_checkout1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_myBills, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_deleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jTextField_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_allBills, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_myBills, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_vewMyBills, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_deleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_viewCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_checkout1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_allBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_allBillsActionPerformed
        this.dispose();
        Access_class ac = new Access_class();
        try {
            ac.importData_fromGenaralFile_toTable();
        } catch (IOException ex) {
            Logger.getLogger(User_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_allBillsActionPerformed

    private void jButton_myBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_myBillsActionPerformed
        Add_item ai = new Add_item();
        this.dispose();
        ai.setVisible(true);
    }//GEN-LAST:event_jButton_myBillsActionPerformed

    private void jButton_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_logOutActionPerformed

    private void jButton_viewCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewCheckoutActionPerformed
        this.dispose();
        viewCheckout vc = new viewCheckout();
        Access_class ac = new Access_class();
        try {
            ac.viewAll_checkout();
        } catch (IOException ex) {
            Logger.getLogger(User_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_viewCheckoutActionPerformed

    private void jButton_allBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_allBillsMouseClicked
        
    }//GEN-LAST:event_jButton_allBillsMouseClicked

    private void jButton_vewMyBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vewMyBillsActionPerformed
        Access_class ac = new Access_class();
        try {
            this.dispose();
            ac.importData_fromPersonalFile_toTable();
        } catch (IOException ex) {
            Logger.getLogger(User_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_vewMyBillsActionPerformed

    private void jButton_logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton_logOutMouseClicked

    private void jButton_deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteItemActionPerformed
       this.dispose();
       Access_class ac = new Access_class();
        try {
            ac.importData_fromPersonalFile_toTable_ForDELETE();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User_choice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User_choice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_deleteItemActionPerformed

    private void jButton_checkout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_checkout1ActionPerformed
        this.dispose();
        Checkout c = new Checkout();
        c.setVisible(true);
    }//GEN-LAST:event_jButton_checkout1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(User_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_choice().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_allBills;
    private javax.swing.JButton jButton_checkout1;
    private javax.swing.JButton jButton_deleteItem;
    private javax.swing.JButton jButton_logOut;
    private javax.swing.JButton jButton_myBills;
    private javax.swing.JButton jButton_vewMyBills;
    private javax.swing.JButton jButton_viewCheckout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField_welcome;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
