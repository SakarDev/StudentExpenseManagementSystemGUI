
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Add_item extends javax.swing.JFrame {
    public Add_item() {
        System.getProperty("java.classpath");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField_item = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_quantity = new javax.swing.JTextField();
        jButton_back = new javax.swing.JButton();
        jButton_addItem = new javax.swing.JButton();
        jDateChooser_addItem = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setDoubleBuffered(false);
        kGradientPanel1.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(16, 81, 151));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 102, 204));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Add your Item here");
        jTextField1.setToolTipText("");

        jTextField_item.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_item.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_item.setText("New Item");
        jTextField_item.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_itemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_itemFocusLost(evt);
            }
        });

        jTextField_price.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_price.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_price.setText("Price");
        jTextField_price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_priceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_priceFocusLost(evt);
            }
        });
        jTextField_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_priceKeyTyped(evt);
            }
        });

        jTextField_quantity.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_quantity.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_quantity.setText("Quantity");
        jTextField_quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_quantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_quantityFocusLost(evt);
            }
        });

        jButton_back.setBackground(new java.awt.Color(0, 102, 204));
        jButton_back.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back.setText("Back");
        jButton_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_back.setMaximumSize(new java.awt.Dimension(175, 37));
        jButton_back.setMinimumSize(new java.awt.Dimension(175, 37));
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_addItem.setBackground(new java.awt.Color(0, 102, 204));
        jButton_addItem.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_addItem.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addItem.setText("Add New Item");
        jButton_addItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton_addItem)
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jTextField1)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField_price)
                    .addComponent(jTextField_quantity)
                    .addComponent(jDateChooser_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_item, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_item, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_addItem)
                    .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_itemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_itemFocusGained
        String text = jTextField_item.getText();
        if(text.toLowerCase().trim().equals("new item") ){
            jTextField_item.setText("");
            jTextField_item.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_itemFocusGained

    private void jTextField_itemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_itemFocusLost
        String text = jTextField_item.getText();
        if(text.toLowerCase().trim().equals("new item") || text.isBlank()){
            jTextField_item.setText("New Item");
            jTextField_item.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_itemFocusLost

    private void jTextField_priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_priceFocusGained
        String text = jTextField_price.getText();
        if(text.toLowerCase().trim().equals("price") ){
            jTextField_price.setText("");
            jTextField_price.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_priceFocusGained

    private void jTextField_priceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_priceFocusLost
        String text = jTextField_price.getText();
        if(text.toLowerCase().trim().equals("price") || text.isBlank()){
            jTextField_price.setText("Price");
            jTextField_price.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_priceFocusLost

    private void jTextField_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_priceKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_priceKeyTyped

    private void jTextField_quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_quantityFocusGained
        String text = jTextField_quantity.getText();
        if(text.toLowerCase().trim().equals("quantity") ){
            jTextField_quantity.setText("");
            jTextField_quantity.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_quantityFocusGained

    private void jTextField_quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_quantityFocusLost
        String text = jTextField_quantity.getText();
        if(text.toLowerCase().trim().equals("quantity") || text.isBlank()){
            jTextField_quantity.setText("Quantity");
            jTextField_quantity.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_quantityFocusLost

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        User_choice uc = new User_choice() ;
        this.dispose();
        uc.setVisible(true);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addItemActionPerformed
        Access_class ac = new Access_class();
        MessageClass m = new MessageClass();
        String s = unverify_item_fields();
        try {
            if(s.equals("itemAdded")){
                log_in_frame l = new log_in_frame();
                writeTo_userFile();
                jTextField_item.setText("New Item");
                jTextField_item.setForeground(new Color(153, 153, 153));
                jTextField_price.setText("Price");
                jTextField_price.setForeground(new Color(153, 153, 153));
                jTextField_quantity.setText("Quantity");
                jTextField_quantity.setForeground(new Color(153, 153, 153));
                jDateChooser_addItem.setDate(null);
            }
            m.icons(s);
        } catch (IOException ex) {
            Logger.getLogger(Add_item.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
    }//GEN-LAST:event_jButton_addItemActionPerformed
    public String unverify_item_fields(){
        Add_item ai = new Add_item();
        String item = jTextField_item.getText().toLowerCase().trim();
        String price = jTextField_price.getText();
        String quantity = jTextField_quantity.getText().toLowerCase().trim();
        if(item.isBlank() || price.isBlank() || quantity.isBlank() || jDateChooser_addItem.getDate() == null ||
           item.equals("new item") || price.equals("Price") || quantity.equals("quantity")){
            return "blank";
        }
        else if (jDateChooser_addItem.getDate().compareTo(new Date()) > 0 ){
            return "futureItem";
        }
        return "itemAdded";
    }
    public void writeTo_userFile() throws IOException{
        User_choice uc = new User_choice();
        Access_class ac = new Access_class();
        String username = uc.USERNAME;
        String file_unamePath = "src\\main\\java\\Files\\"+ username + ".txt";
        File f = new File (file_unamePath);
        FileWriter fw = new FileWriter(ac.Bills, true);
        FileWriter writer = new FileWriter(f , true);
        String item = jTextField_item.getText();
        String price = jTextField_price.getText();
        String quantity = jTextField_quantity.getText();
        String date = String.valueOf(jDateChooser_addItem.getDate());
        //writer.write(ac.first_name + ",");
        writer.write(item + ",");
        writer.write(price + ",");
        writer.write(quantity + ",");
        writer.write(date + "\n");
        writer.close();
        fw.write(ac.first_name + ",");
        fw.write(item + ",");
        fw.write(price + ",");
        fw.write(quantity + ",");
        fw.write(date + "\n");
        fw.close();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_item().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addItem;
    private javax.swing.JButton jButton_back;
    private com.toedter.calendar.JDateChooser jDateChooser_addItem;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField_item;
    public javax.swing.JTextField jTextField_price;
    public javax.swing.JTextField jTextField_quantity;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
