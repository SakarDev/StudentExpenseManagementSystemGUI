
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TheMsg extends javax.swing.JFrame {
    
    public TheMsg() {
        initComponents();
        try {
            SetJlabel_to_checkoutNames();
        } catch (IOException ex) {
            Logger.getLogger(TheMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        setLocationRelativeTo(null);
    }
     public void SetJlabel_to_checkoutNames() throws FileNotFoundException, IOException{
        Access_class ac = new Access_class();
        BufferedReader bafar = new BufferedReader((new FileReader(ac.checkout_confirm)));
        String s = "";
        String temp = "";
        while((s = bafar.readLine()) != null){
            jLabel_names.setText(temp + s.split(",")[1] + ", ");
            temp = jLabel_names.getText();
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel_names = new javax.swing.JLabel();
        jButton_no = new javax.swing.JButton();
        jButton_yes = new javax.swing.JButton();
        jLabel_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(16, 81, 151));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        jLabel_names.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel_names.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_names.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton_no.setBackground(new java.awt.Color(16, 81, 151));
        jButton_no.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_no.setForeground(new java.awt.Color(255, 255, 255));
        jButton_no.setText("No");
        jButton_no.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_noActionPerformed(evt);
            }
        });

        jButton_yes.setBackground(new java.awt.Color(16, 81, 151));
        jButton_yes.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_yes.setForeground(new java.awt.Color(255, 255, 255));
        jButton_yes.setText("Yes");
        jButton_yes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_yesActionPerformed(evt);
            }
        });

        jLabel_text.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel_text.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_text.setText("accepted checkout, do you also want to do it?");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jLabel_names, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton_no, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel_names, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_text, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_no)
                    .addComponent(jButton_yes))
                .addGap(22, 22, 22))
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
        Checkout c = new Checkout();
        User_choice uc = new User_choice();
        try {
            c.addUsernaemTo_file_confirmCheckout();
        } catch (IOException ex) {
            Logger.getLogger(TheMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        uc.setVisible(true);
    }//GEN-LAST:event_jButton_yesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheMsg().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_no;
    private javax.swing.JButton jButton_yes;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel_names;
    private javax.swing.JLabel jLabel_text;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
