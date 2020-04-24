
import java.awt.Font;


public class viewCheckout extends javax.swing.JFrame {
    public viewCheckout() {
        initComponents();
        setLocationRelativeTo(null);
        jTable_checkout.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 23));
        jTable_checkout.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTextField_totalMoney.setText("Total Money of the Month: " + Access_class.totalSum);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_checkout = new javax.swing.JTable();
        jButton_back = new javax.swing.JButton();
        jTextField_totalMoney = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_checkout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable_checkout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Total User Money", "Pay", "Recieve"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_checkout.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_checkout.setOpaque(false);
        jTable_checkout.setRowHeight(30);
        jTable_checkout.setSelectionBackground(new java.awt.Color(25, 134, 243));
        jTable_checkout.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_checkout);

        jButton_back.setBackground(new java.awt.Color(16, 81, 151));
        jButton_back.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back.setText("Back");
        jButton_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jTextField_totalMoney.setEditable(false);
        jTextField_totalMoney.setBackground(new java.awt.Color(16, 100, 190));
        jTextField_totalMoney.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTextField_totalMoney.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_totalMoney.setText("Total Money of the Month:");
        jTextField_totalMoney.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_totalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jTextField_totalMoney)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        this.dispose();
        User_choice uc = new User_choice();
        uc.setVisible(true);
    }//GEN-LAST:event_jButton_backActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCheckout().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_checkout;
    public javax.swing.JTextField jTextField_totalMoney;
    // End of variables declaration//GEN-END:variables
}
