

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class log_in_frame extends javax.swing.JFrame {

    public void login_icons(){
        jLabel_big_login_icon.setIcon(new ImageIcon("src\\main\\java\\images\\general_login_icon_img.png"));
        jLabel_username_icon.setIcon(new ImageIcon("src\\main\\java\\images\\user_icon.png"));
        jLabel_password_icon.setIcon(new ImageIcon("src\\main\\java\\images\\password.png"));
       //abe am methoda la xwar inticomponents() bang kaitawa
       
    }
    public log_in_frame() {
        initComponents();
        login_icons();
        this.setLocationRelativeTo(null);
        pass();
    }
    public void pass(){
        if (jPasswordField.getText().equals("Password") && jCheckBox_show_hide_password.isSelected()){
            jPasswordField.setEchoChar((char)0);
        }
    }
   
    class JPanelegradient extends JPanel{
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            Color color1 = new Color(16, 81, 151);
            Color color2 = new Color(132,214,240);
            GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_general = new JPanelegradient();
        jLabel_password_icon = new javax.swing.JLabel();
        jLabel_big_login_icon = new javax.swing.JLabel();
        jLabel_username_icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_open_register = new javax.swing.JLabel();
        jButton_logIn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox_show_hide_password = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_general.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_general.setFocusable(true);
        jPanel_general.setToolTipText("");

        jLabel_password_icon.setBackground(new java.awt.Color(255, 51, 153));
        jLabel_password_icon.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_big_login_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_big_login_icon.setToolTipText("");

        jLabel_username_icon.setBackground(new java.awt.Color(255, 51, 153));
        jLabel_username_icon.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Expense Management");

        jPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("Password");
        jPasswordField.setToolTipText("");
        jPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jTextField_username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.setText("Username");
        jTextField_username.setToolTipText("");
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Don't have an account? ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel_open_register.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel_open_register.setForeground(new java.awt.Color(0, 102, 255));
        jLabel_open_register.setText("Sign Up");
        jLabel_open_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_open_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_open_registerMouseClicked(evt);
            }
        });

        jButton_logIn.setBackground(new java.awt.Color(0, 102, 204));
        jButton_logIn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_logIn.setForeground(new java.awt.Color(255, 255, 255));
        jButton_logIn.setText("Log In");
        jButton_logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_logInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_logInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_logInMouseExited(evt);
            }
        });
        jButton_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logInActionPerformed(evt);
            }
        });

        jCheckBox_show_hide_password.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jCheckBox_show_hide_password.setSelected(true);
        jCheckBox_show_hide_password.setText("Show Password");
        jCheckBox_show_hide_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox_show_hide_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_show_hide_passwordMouseClicked(evt);
            }
        });
        jCheckBox_show_hide_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_show_hide_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_generalLayout = new javax.swing.GroupLayout(jPanel_general);
        jPanel_general.setLayout(jPanel_generalLayout);
        jPanel_generalLayout.setHorizontalGroup(
            jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_generalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_big_login_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(jPanel_generalLayout.createSequentialGroup()
                .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_generalLayout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_generalLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel_open_register, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_generalLayout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(jLabel_password_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox_show_hide_password)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_generalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel_username_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_generalLayout.setVerticalGroup(
            jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generalLayout.createSequentialGroup()
                .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_generalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel_generalLayout.createSequentialGroup()
                        .addComponent(jLabel_big_login_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_username_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_show_hide_password)
                .addGap(18, 18, 18)
                .addComponent(jButton_logIn)
                .addGap(6, 6, 6)
                .addGroup(jPanel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_open_register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_general, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_general, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        if (jTextField_username.getText().trim().toLowerCase().equals("username")){
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        if (jTextField_username.getText().trim().toLowerCase().equals("username") ||
            jTextField_username.getText().trim().equals("")){
            jTextField_username.setText("Username");
            jTextField_username.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        String password_string = String.valueOf(jPasswordField.getPassword());
        if (password_string.trim().toLowerCase().equals("password")){
            jPasswordField.setText("");
        }
        jPasswordField.setForeground(Color.black);
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        String password = String.valueOf(jPasswordField.getPassword());
        if (password.trim().toLowerCase().equals("password") ||
             password.trim().equals("")){
            jPasswordField.setText("Password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jLabel_open_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_open_registerMouseClicked
       //opetn a new form
       Register r = new Register();
       r.setVisible(true);
       r.pack();  //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents. 
       r.setLocationRelativeTo(null); //shweny window lasar sc ka dar akawe agar nullman dana awa la center dar akawe
       //close the current form(log_in_frame)
       this.dispose();
    }//GEN-LAST:event_jLabel_open_registerMouseClicked

    private void jButton_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_logInActionPerformed

    private void jButton_logInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logInMouseExited

    }//GEN-LAST:event_jButton_logInMouseExited

    private void jButton_logInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logInMouseEntered

    }//GEN-LAST:event_jButton_logInMouseEntered

    private void jButton_logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logInMouseClicked
        Access_class ac = new Access_class();
        Register r = new Register();
        String u = jTextField_username.getText();
        String p = jPasswordField.getText();
        try {
           if (ac.login_validaity(u, r.get_Md5(p))){
                User_choice uc = new User_choice();
                uc.USERNAME = u;
                uc.setName(u);
                ac.popUp_checkoutMsgToUsers();
                this.dispose();
            }
           else{
               MessageClass mc = new MessageClass();
               mc.icons("unameORpassFALSE");
               mc.setVisible(true);
           }
        } catch (IOException ex) {
            Logger.getLogger(log_in_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_logInMouseClicked
 
    private void jCheckBox_show_hide_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_show_hide_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_show_hide_passwordActionPerformed

    private void jCheckBox_show_hide_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_show_hide_passwordMouseClicked
        if (jCheckBox_show_hide_password.isSelected()){
            jPasswordField.setEchoChar((char)0);
        }
        else{
            jPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_show_hide_passwordMouseClicked
    
   
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
            java.util.logging.Logger.getLogger(log_in_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in_frame().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_logIn;
    private javax.swing.JCheckBox jCheckBox_show_hide_password;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_big_login_icon;
    private javax.swing.JLabel jLabel_open_register;
    private javax.swing.JLabel jLabel_password_icon;
    private javax.swing.JLabel jLabel_username_icon;
    private javax.swing.JPanel jPanel_general;
    private javax.swing.JPasswordField jPasswordField;
    public javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
