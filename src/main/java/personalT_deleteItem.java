
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class personalT_deleteItem extends javax.swing.JFrame {
    public static List<String> deleteList = new ArrayList<String>();
    public static String deleteArray[] = new String[4];
    public personalT_deleteItem() {
        initComponents();
        setLocationRelativeTo(null);
        jTable_personalDeleteItem.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 23));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_personalDeleteItem = new javax.swing.JTable();
        jButton_delete = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_personalDeleteItem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable_personalDeleteItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_personalDeleteItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_personalDeleteItem.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_personalDeleteItem.setOpaque(false);
        jTable_personalDeleteItem.setRowHeight(30);
        jTable_personalDeleteItem.setSelectionBackground(new java.awt.Color(25, 134, 243));
        jTable_personalDeleteItem.setShowGrid(true);
        jScrollPane2.setViewportView(jTable_personalDeleteItem);

        jButton_delete.setBackground(new java.awt.Color(0, 102, 204));
        jButton_delete.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setText("Delete Row");
        jButton_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_back.setBackground(new java.awt.Color(0, 102, 204));
        jButton_back.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back.setText("Back");
        jButton_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_delete)
                    .addComponent(jButton_back))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        User_choice uc = new User_choice();
        this.dispose();
        uc.setVisible(true);
    }//GEN-LAST:event_jButton_backActionPerformed
    
    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
          DefaultTableModel model = (DefaultTableModel) jTable_personalDeleteItem.getModel();
          int rowIndex = jTable_personalDeleteItem.getSelectedRow();
          
          deleteList.clear();
          deleteList.add(String.valueOf(model.getValueAt(rowIndex, 0)));
          deleteList.add(model.getValueAt(rowIndex, 1).toString());
          deleteList.add(model.getValueAt(rowIndex, 2).toString());
          deleteList.add(model.getValueAt(rowIndex, 3).toString());
          deleteArray[0] = String.valueOf(model.getValueAt(rowIndex, 0));
          deleteArray[1] = String.valueOf(model.getValueAt(rowIndex, 1));
          deleteArray[2] = String.valueOf(model.getValueAt(rowIndex, 2));
          deleteArray[3] = String.valueOf(model.getValueAt(rowIndex, 3));
          model.removeRow(rowIndex);
          this.dispose();
        try {
            deleteRow_inFile();
        } catch (IOException ex) {
            Logger.getLogger(personalT_deleteItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed
    public void deleteRow_inFile() throws FileNotFoundException, IOException{
        User_choice uc = new User_choice();
        String username = uc.USERNAME;
        File f = new File("src\\main\\java\\Files\\" + username + ".txt");
        File tempFile = new File ("src\\main\\java\\Files\\tempFile.txt");
        tempFile.createNewFile();
        BufferedReader reader = new BufferedReader(new FileReader(f));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        writer.write("");
        String s = "";
        while((s = reader.readLine()) != null){
            if (s.split(",")[0].equals(deleteList.get(0)) && s.split(",")[1].equals(deleteList.get(1)) &&
                s.split(",")[2].equals(deleteList.get(2)) && s.split(",")[3].equals(deleteList.get(3))){
                continue;
            }
            writer.write(s + "\n");
        }
        reader.close();
        writer.close();
        Files.deleteIfExists(Paths.get("src\\main\\java\\Files\\" + username + ".txt"));
        boolean success = tempFile.renameTo(new File("src\\main\\java\\Files\\" + username + ".txt"));
        uc.setVisible(true);
        
        Access_class ac = new Access_class();
        File temporaryFile = new File ("src\\main\\java\\Files\\temoporaryFile.txt");
        temporaryFile.createNewFile();
        File ff = new File("src\\main\\java\\Files\\Bills.txt");
        BufferedWriter bafarW = new BufferedWriter(new FileWriter(temporaryFile));
        BufferedReader bafarR = new BufferedReader(new FileReader(ff));
        String str = "";
        bafarW.write("");
        while((str = bafarR.readLine()) != null){
            if (str.split(",")[0].equals(ac.first_name) && str.split(",")[1].equals(deleteList.get(0)) && 
                str.split(",")[2].equals(deleteList.get(1)) && str.split(",")[3].equals(deleteList.get(2)) && 
                str.split(",")[4].equals(deleteList.get(3))){
                continue;
            }
            bafarW.write(str+ "\n");
        }
        bafarW.close();
        bafarR.close();
        ff.delete();
        boolean successful = temporaryFile.renameTo(new File("src\\main\\java\\Files\\Bills.txt"));
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
            java.util.logging.Logger.getLogger(personalT_deleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personalT_deleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personalT_deleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personalT_deleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personalT_deleteItem().setVisible(false);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_personalDeleteItem;
    // End of variables declaration//GEN-END:variables
}
