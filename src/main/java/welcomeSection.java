
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class welcomeSection extends javax.swing.JFrame {

   
    public welcomeSection() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel_icon.setIcon(new ImageIcon("src\\main\\java\\images\\dormitory.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jButton_logIn = new javax.swing.JButton();
        jButton_signUp = new javax.swing.JButton();
        jLabel_icon = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(110, 181, 243));
        kGradientPanel1.setkStartColor(new java.awt.Color(16, 81, 151));

        jButton_logIn.setBackground(new java.awt.Color(0, 102, 204));
        jButton_logIn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_logIn.setForeground(new java.awt.Color(255, 255, 255));
        jButton_logIn.setText("Log In");
        jButton_logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_logInMouseClicked(evt);
            }
        });
        jButton_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logInActionPerformed(evt);
            }
        });

        jButton_signUp.setBackground(new java.awt.Color(0, 102, 204));
        jButton_signUp.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_signUp.setForeground(new java.awt.Color(255, 255, 255));
        jButton_signUp.setText("Sign Up");
        jButton_signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_signUpMouseClicked(evt);
            }
        });
        jButton_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signUpActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 102, 204));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Student Expense Management");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("The deliciounes of mom's cooking was realized soon after entering into the dormitory life..");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Being in dormitory is responsibility so you will realize a little bit of your father's every moment");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logInActionPerformed
        Access_class ac = new Access_class();
        try {
            ac.createFiles();
        } catch (IOException ex) {
            Logger.getLogger(welcomeSection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_logInActionPerformed

    private void jButton_logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logInMouseClicked
        log_in_frame l = new log_in_frame();
        this.dispose();
        l.setVisible(true);
    }//GEN-LAST:event_jButton_logInMouseClicked

    private void jButton_signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_signUpMouseClicked
        Register r = new Register();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_jButton_signUpMouseClicked

    private void jButton_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signUpActionPerformed
         Access_class ac = new Access_class();
        try {
            ac.createFiles();
        } catch (IOException ex) {
            Logger.getLogger(welcomeSection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_signUpActionPerformed

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
            java.util.logging.Logger.getLogger(welcomeSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomeSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomeSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomeSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomeSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_logIn;
    private javax.swing.JButton jButton_signUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
