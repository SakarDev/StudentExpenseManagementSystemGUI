
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MessageClass extends javax.swing.JFrame {

    public MessageClass() {
        ///System.getProperty("java.classpath");
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//nabe EXIT_ON_CLOSE bakarbheny chwnka windowy registerish da axatawa balam am dispose a bas aw windoway exitt krdwaCloseAbe
        this.setLocationRelativeTo(null);
    }
    
    public void icons(String s) throws IOException{                    
        ImageIcon general = new ImageIcon("src\\main\\java\\emoji\\general.png");
        ImageIcon date = new ImageIcon("src\\main\\java\\emoji\\date.png");
        ImageIcon verified = new ImageIcon("src\\main\\java\\emoji\\verified.png");
        ImageIcon itemAdded = new ImageIcon("src\\main\\java\\emoji\\itemAdded.png");
        
        
        if (s.equals("blank")){
            jLabel_emoji.setIcon(general);
            jLabel_message.setText("One or more fields are empty");
        }
         else if (s.equals("unameLen")){
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Username at least must be 8 characters");
         }
         else if (s.equals("usernameTaken")){     
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Username taken");
         }
         else if(s.equals("passNotMatch")){
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Password doesn't match");
         }
         else if (s.equals("passLen")){
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Use 8 characters or more for password");
         }
         else if(s.equals("phoneLen")){
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Phone isn't valid, it must be 10 digits");
         }
         else if (s.equals("chooseBirth")){
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Select your BirthDate");
         }
         else if(s.equals("date")){
             jLabel_emoji.setIcon(date);
             jLabel_message.setText("No student from future are allowed XD");
         }
         else if (s.equals("verified")){
             jLabel_emoji.setIcon(verified);
             jLabel_message.setText("Account successfully created!");
             jButton_ok.setText("Log In Now");
         }
         else if (s.equals("unameORpassFALSE")){
             jLabel_emoji.setIcon(general);
             jLabel_message.setText("Check your username or password!");
         }
         else if (s.equals("futureItem")){
             jLabel_emoji.setIcon(date);
             jLabel_message.setText("Check the date, it's future lol");
         }
         else if(s.equals("itemAdded")){
             jLabel_emoji.setIcon(itemAdded);
             jLabel_message.setText("Item successfully added");
         }//agar blank be yakam if bakar aheninawa
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel_emoji = new javax.swing.JLabel();
        jLabel_message = new javax.swing.JLabel();
        jButton_ok = new javax.swing.JButton();

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(16, 81, 151));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 153, 255));

        jLabel_message.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel_message.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton_ok.setBackground(new java.awt.Color(0, 0, 0));
        jButton_ok.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_ok.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ok.setText("Ok");
        jButton_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_okMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton_okMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_emoji, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_emoji, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void jButton_okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_okMouseClicked
        this.dispose();
        if (jButton_ok.getText().equals("Log In Now")){
            log_in_frame l = new log_in_frame() ;
            l.setVisible(true);
        }
        if (jButton_ok.getText().equals("OK")){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton_okMouseClicked

    private void jButton_okMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_okMouseReleased
        
    }//GEN-LAST:event_jButton_okMouseReleased

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
            java.util.logging.Logger.getLogger(MessageClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageClass().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_ok;
    private javax.swing.JLabel jLabel_emoji;
    private javax.swing.JLabel jLabel_message;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
