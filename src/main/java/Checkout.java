
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Checkout extends javax.swing.JFrame {

    public Checkout() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton_no = new javax.swing.JButton();
        jButton_yes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(16, 81, 151));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 153, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(16, 81, 151));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CheckOut");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are you sure you want to Check out every thing?");

        jButton_no.setBackground(new java.awt.Color(16, 81, 151));
        jButton_no.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton_no.setForeground(new java.awt.Color(255, 255, 255));
        jButton_no.setText("No");
        jButton_no.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_noActionPerformed(evt);
            }
        });

        jButton_yes.setBackground(new java.awt.Color(16, 81, 151));
        jButton_yes.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton_yes.setForeground(new java.awt.Color(255, 255, 255));
        jButton_yes.setText("Yes");
        jButton_yes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_yesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton_no, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_noActionPerformed
        this.dispose();
        User_choice uc = new User_choice();
        uc.setVisible(true);
    }//GEN-LAST:event_jButton_noActionPerformed

    private void jButton_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_yesActionPerformed
        this.dispose();
        send_msg sm = new send_msg();
        sm.setVisible(true);
        try {
            addUsernaemTo_file_confirmCheckout();
        } catch (IOException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_yesActionPerformed

    public void addUsernaemTo_file_confirmCheckout() throws FileNotFoundException, IOException{
        Access_class ac = new Access_class();
        User_choice uc = new User_choice();
        String username = uc.USERNAME;
        String s = "";
        FileWriter writer = null;
        try {
            boolean is = Is_username_exist();
             if (is == false){
                 writer = new FileWriter(ac.checkout_confirm, true);
                 writer.write(username + "," + ac.first_name + "\n");
                 writer.close();
             }
        } catch (IOException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
        checkout_clearEveryThing();
    }
    public boolean Is_username_exist() throws FileNotFoundException, IOException{
        Access_class ac = new Access_class();
        User_choice uc = new User_choice();
        String username = uc.USERNAME;
        BufferedReader bafarR = new BufferedReader(new FileReader(ac.checkout_confirm));
        String s = "";
        while((s = bafarR.readLine()) != null){
            if (s.split(",")[0].equals(username)){
                bafarR.close();
                return true;
            }
        }
        return false;
    }
    public void checkout_clearEveryThing() throws FileNotFoundException, IOException{
        Access_class ac = new Access_class();
        BufferedReader bfr = new BufferedReader(new FileReader(ac.file));
        BufferedReader bafar = new BufferedReader(new FileReader(ac.checkout_confirm));
        int registerLines = 0;
        int checkLines = 0;
        while(bfr.readLine() != null){
            registerLines++;
        }
        while(bafar.readLine() != null){
            checkLines++;
        }
        ac.clearCheckoutFile();
        if (registerLines == checkLines){
            ac.clearUserFile();
            FileWriter w = new FileWriter("src\\main\\java\\Files\\Bills.txt");
            w.write("");
            w.close();
            FileWriter wri = new FileWriter("src\\main\\java\\Files\\checkout_confirm.txt");
            wri.write("");
            wri.close();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_no;
    private javax.swing.JButton jButton_no1;
    private javax.swing.JButton jButton_yes;
    private javax.swing.JButton jButton_yes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
