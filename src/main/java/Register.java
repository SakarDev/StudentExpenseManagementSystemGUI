
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Register extends javax.swing.JFrame {
    public static  ButtonGroup btn_group = new ButtonGroup();
    public void register_icons(){
         jLabel_register.setIcon(new ImageIcon("src\\main\\java\\images\\register.png"));
    }
    public void button_group(){
        btn_group.add(jRadioButton_male);
        btn_group.add(jRadioButton_female);
        jRadioButton_male.setSelected(true);
        setLocationRelativeTo(null);
    }
    public Register() {
        initComponents();
        register_icons();
        button_group();
        passwords();
    }
   public void passwords(){
        if(jPasswordField_confirm.getText().equals("Confirm") && jCheckBox_show_hide_password.isSelected() ){
             jPasswordField_confirm.setEchoChar((char)0);
         }
        if(jPasswordField_new.getText().equals("Password") && jCheckBox_show_hide_password.isSelected() ){
            //Sets the echo character for this JPasswordField. Setting a value of 0 indicates that you wish to see the text as it is typed, similar to the behavior of a standard JTextField.
            jPasswordField_new.setEchoChar((char)0);
        }
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel_register = new javax.swing.JLabel();
        jTextField_last_name = new javax.swing.JTextField();
        jTextField_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jPasswordField_new = new javax.swing.JPasswordField();
        jPasswordField_confirm = new javax.swing.JPasswordField();
        jLabel_gender = new javax.swing.JLabel();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jDateChooser_ = new com.toedter.calendar.JDateChooser();
        jTextField_1st_name = new javax.swing.JTextField();
        jLabel_birthDate = new javax.swing.JLabel();
        jComboBox_city = new javax.swing.JComboBox<>();
        jLabel_password_validation = new javax.swing.JLabel();
        jLabel_phone_validaity = new javax.swing.JLabel();
        jButton_sign_up = new javax.swing.JButton();
        jLabel_sign_in = new javax.swing.JLabel();
        jLabel_have_account = new javax.swing.JLabel();
        jCheckBox_show_hide_password = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(132, 214, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(16, 81, 151));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setFocusable(true);

        jLabel_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField_last_name.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_last_name.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_last_name.setText("Last Name");
        jTextField_last_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_last_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_last_nameFocusLost(evt);
            }
        });
        jTextField_last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_last_nameActionPerformed(evt);
            }
        });
        jTextField_last_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_last_nameKeyTyped(evt);
            }
        });

        jTextField_username.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.setText("Username");
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create a new account");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField_phone.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_phone.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_phone.setText("Phone");
        jTextField_phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_phoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_phoneFocusLost(evt);
            }
        });
        jTextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phoneActionPerformed(evt);
            }
        });
        jTextField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_phoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_phoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_phoneKeyTyped(evt);
            }
        });

        jPasswordField_new.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPasswordField_new.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_new.setText("Password");
        jPasswordField_new.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_newFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_newFocusLost(evt);
            }
        });
        jPasswordField_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_newActionPerformed(evt);
            }
        });
        jPasswordField_new.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_newKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_newKeyReleased(evt);
            }
        });

        jPasswordField_confirm.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPasswordField_confirm.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_confirm.setText("Confirm");
        jPasswordField_confirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_confirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_confirmFocusLost(evt);
            }
        });
        jPasswordField_confirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_confirmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_confirmKeyReleased(evt);
            }
        });

        jLabel_gender.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel_gender.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_gender.setText("Gender:");
        jLabel_gender.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jRadioButton_male.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_male.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jRadioButton_male.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton_male.setText("Male");
        jRadioButton_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_maleActionPerformed(evt);
            }
        });

        jRadioButton_female.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_female.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jRadioButton_female.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton_female.setText("Female");

        jDateChooser_.setToolTipText("");
        jDateChooser_.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jDateChooser_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooser_FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser_FocusLost(evt);
            }
        });

        jTextField_1st_name.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTextField_1st_name.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_1st_name.setText("First Name");
        jTextField_1st_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_1st_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_1st_nameFocusLost(evt);
            }
        });
        jTextField_1st_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_1st_nameActionPerformed(evt);
            }
        });
        jTextField_1st_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_1st_nameKeyTyped(evt);
            }
        });

        jLabel_birthDate.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel_birthDate.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_birthDate.setText("Birth Date:");
        jLabel_birthDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jComboBox_city.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jComboBox_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City", "Slemani", "Hawler", "Dhok", "Halabja", "Karkuk" }));
        jComboBox_city.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox_cityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox_cityFocusLost(evt);
            }
        });

        jLabel_password_validation.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel_password_validation.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_password_validation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_phone_validaity.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel_phone_validaity.setForeground(new java.awt.Color(255, 51, 0));
        jLabel_phone_validaity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton_sign_up.setBackground(new java.awt.Color(0, 102, 204));
        jButton_sign_up.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton_sign_up.setForeground(new java.awt.Color(255, 255, 255));
        jButton_sign_up.setText("Sign Up");
        jButton_sign_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_sign_upMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_sign_upMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_sign_upMouseExited(evt);
            }
        });
        jButton_sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sign_upActionPerformed(evt);
            }
        });

        jLabel_sign_in.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel_sign_in.setForeground(new java.awt.Color(0, 102, 255));
        jLabel_sign_in.setText("Sign In");
        jLabel_sign_in.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_sign_inMouseClicked(evt);
            }
        });

        jLabel_have_account.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel_have_account.setText(" Already have account?  ");
        jLabel_have_account.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jCheckBox_show_hide_password.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jCheckBox_show_hide_password.setSelected(true);
        jCheckBox_show_hide_password.setText("Show Password");
        jCheckBox_show_hide_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox_show_hide_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_show_hide_passwordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_phone_validaity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_username, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField_1st_name, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                            .addComponent(jPasswordField_new, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel_gender)
                                                .addComponent(jLabel_birthDate))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPasswordField_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton_male, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton_female))
                                            .addComponent(jDateChooser_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jCheckBox_show_hide_password, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboBox_city, 0, 190, Short.MAX_VALUE)
                                                .addComponent(jLabel_password_validation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jButton_sign_up, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel_have_account)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_sign_in, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel_register, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_register, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_show_hide_password)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_1st_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField_new, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel_password_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_city, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_phone_validaity, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_female)
                    .addComponent(jRadioButton_male, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_sign_in, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_have_account, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void jTextField_last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_last_nameActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jPasswordField_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_newActionPerformed
       
    }//GEN-LAST:event_jPasswordField_newActionPerformed

    private void jPasswordField_newFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_newFocusGained
        Border brd = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 153, 255));
        jPasswordField_new.setBorder(brd);
        if (jPasswordField_new.getText().trim().toLowerCase().equals("password")){
            jPasswordField_new.setText("");
            jPasswordField_new.setForeground(Color.black);
        }
        if (jPasswordField_new.getText().equals("")){
            jLabel_password_validation.setText("");
        }
        
    }//GEN-LAST:event_jPasswordField_newFocusGained

    private void jPasswordField_newFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_newFocusLost
        String npass = jPasswordField_new.getText();
        String cpass = jPasswordField_confirm.getText();
        jPasswordField_new.setBorder(null);
        if(npass.trim().equals("") || 
           npass.trim().toLowerCase().equals("password")){//agar user New Password le bat focus labat w disanawa focus gain be awa setText abe bo""
           jPasswordField_new.setText("Password");
           jPasswordField_new.setForeground(new Color(153,153,153));
        }
        if (npass.equals(cpass)){
               jLabel_password_validation.setText("");
           }
        else if(npass.equals("Password")){
            jLabel_password_validation.setText("");
        }
        else if (!cpass.equals("Confirm")&& !npass.equals(cpass)){
               jLabel_password_validation.setText("Password doesn't match");
           }
       if (npass.length() < 8 && !npass.equals("")){
            jLabel_password_validation.setText("Use 8 characters or more");if (jPasswordField_confirm.getText().length() < 8 && !jPasswordField_confirm.equals("Confirm")){
             jLabel_password_validation.setText("Use 8 characters or more");
         }
        }

    }//GEN-LAST:event_jPasswordField_newFocusLost

    private void jPasswordField_confirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_confirmFocusGained
        Border brd = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 153, 255));
        jPasswordField_confirm.setBorder(brd);
        if(jPasswordField_confirm.getText().trim().toLowerCase().equals("confirm")){
            jPasswordField_confirm.setText("");
            jPasswordField_confirm.setForeground(Color.black);
        }
        if (jPasswordField_confirm.getText().equals("")){
            jLabel_password_validation.setText("");
        }
    }//GEN-LAST:event_jPasswordField_confirmFocusGained

    private void jPasswordField_confirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_confirmFocusLost
        jPasswordField_confirm.setBorder(null);
        String npass = jPasswordField_new.getText();
        String cpass = jPasswordField_confirm.getText();
        if(cpass.trim().equals("") || 
          cpass.trim().toLowerCase().equals("confirm")){
            jPasswordField_confirm.setText("Confirm");
            jPasswordField_confirm.setForeground(new Color(153,153,153));
        }
        if (npass.equals(cpass)){
               jLabel_password_validation.setText("");
           }
        else if (cpass.equals("Confirm")){
                     jLabel_password_validation.setText("");
        }
        else if (!npass.equals("Password")&& !npass.equals(cpass)){
               jLabel_password_validation.setText("Password doesn't match");
           }
       if (cpass.length() < 8 && !cpass.equals("")){
            jLabel_password_validation.setText("Use 8 characters or more");
        }
    }//GEN-LAST:event_jPasswordField_confirmFocusLost

    private void jTextField_1st_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_1st_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_1st_nameActionPerformed

    private void jComboBox_cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_cityFocusLost
          
    }//GEN-LAST:event_jComboBox_cityFocusLost

    private void jComboBox_cityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox_cityFocusGained
        jComboBox_city.removeItem("City");
    }//GEN-LAST:event_jComboBox_cityFocusGained

    private void jTextField_1st_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_1st_nameFocusGained
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 153, 255));
        jTextField_1st_name.setBorder(border);
        if (jTextField_1st_name.getText().trim().toLowerCase().equals("first name")){
            jTextField_1st_name.setText("");
            jTextField_1st_name.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_1st_nameFocusGained

    private void jTextField_1st_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_1st_nameFocusLost
        jTextField_1st_name.setBorder(null);
        if (jTextField_1st_name.getText().trim().toLowerCase().equals("first name") ||
            jTextField_1st_name.getText().trim().toLowerCase().equals("")){
            jTextField_1st_name.setText("First Name");
            jTextField_1st_name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_1st_nameFocusLost

    private void jTextField_last_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_last_nameFocusGained
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 153, 255));
        jTextField_last_name.setBorder(border);
        if(jTextField_last_name.getText().trim().toLowerCase().equals("last name")){
            jTextField_last_name.setText("");
            jTextField_last_name.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_last_nameFocusGained

    private void jTextField_last_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_last_nameFocusLost
        jTextField_last_name.setBorder(null);
        if (jTextField_last_name.getText().trim().toLowerCase().equals("last name") ||
            jTextField_last_name.getText().trim().equals("")){
            jTextField_last_name.setText("Last Name");
            jTextField_last_name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_last_nameFocusLost

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 153, 255));
        jTextField_username.setBorder(border);
        if (jTextField_username.getText().trim().toLowerCase().equals("username")){
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        jTextField_username.setBorder(null);
        if (jTextField_username.getText().trim().toLowerCase().equals("username") || 
            jTextField_username.getText().trim().equals("")){
            jTextField_username.setText("Username");
            jTextField_username.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jTextField_phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_phoneFocusGained
        Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 153, 255));
        jTextField_phone.setBorder(border);
        if (jTextField_phone.getText().trim().toLowerCase().equals("phone")){
            jTextField_phone.setText("");
            jTextField_phone.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_phoneFocusGained

    private void jTextField_phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_phoneFocusLost
        jTextField_phone.setBorder(null);
        if(jTextField_phone.getText().trim().toLowerCase().equals("")){
            //waman le krdwa ka tanha zhmara re pe drawa kate sht anwse user so pewist ba conditiony equals("phone") naka
            jTextField_phone.setText("Phone");
            jTextField_phone.setForeground(new Color(153,153,153));
        }
        if (!jTextField_phone.getText().equals("Phone")){
            if(jTextField_phone.getText().length() == 10){
                jLabel_phone_validaity.setText("");
            }
            else if(jTextField_phone.getText().length() < 10 ){
                jLabel_phone_validaity.setText("Phone isn't valid");
            }
            
        }
    }//GEN-LAST:event_jTextField_phoneFocusLost

    private void jTextField_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyPressed
        
    }//GEN-LAST:event_jTextField_phoneKeyPressed

    private void jPasswordField_confirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_confirmKeyPressed
           /*am methodana la dway focus xstna sar esh akan wata sarata ka nwsiwmana Phone mwshkilai
            Method                      Purpose
            keyTyped(KeyEvent)          Called just after the user types a Unicode character into the listened-to component.
            keyPressed(KeyEvent)	Called just after the user presses a key while the listened-to component has the focus.
            keyReleased(KeyEvent)	Called just after the user releases a key while the listened-to component has the focus.*/
          
    }//GEN-LAST:event_jPasswordField_confirmKeyPressed

    private void jPasswordField_newKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_newKeyPressed

    }//GEN-LAST:event_jPasswordField_newKeyPressed

    private void jPasswordField_confirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_confirmKeyReleased
         if (jPasswordField_new.getText().equals(jPasswordField_confirm.getText())){
               jLabel_password_validation.setText("");
           }
    }//GEN-LAST:event_jPasswordField_confirmKeyReleased

    private void jPasswordField_newKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_newKeyReleased
         if (jPasswordField_new.getText().equals(jPasswordField_confirm.getText())){
               jLabel_password_validation.setText("");
           }
    }//GEN-LAST:event_jPasswordField_newKeyReleased

    private void jDateChooser_FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser_FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser_FocusGained

    private void jDateChooser_FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser_FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser_FocusLost

    private void jTextField_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyTyped
        // allow only numbers
        /*evt\       the parameter, evt, contains the code of the key that was pressed or released. The code can be obtained by calling the function evt. getKeyCode().
         isDigit()\   Determines if the specified character is a digit Parameters: ch - the character to be tested. Returns:true if the character is a digit; false otherwise.
          getKeyChar()\Returns the character associated with the key in this event. For example, the KEY_TYPED event for shift + "a" returns the value for "A".
        Returns: the Unicode character defined for this key event. If no valid Unicode character exists for this key event, CHAR_UNDEFINED is returned
        jiwazy getKeyChar lagal getKeyCode awaya ka charaka unicode y char agarenetawa balam codaka int agarenetawa 
        getKeyCode\Returns the integer keyCode associated with the key in this event
        consume\ consume xoi wata destroy completely,, Consumes this event so that it will not be processed in the default manner by the source which originated it.
        
 */
        if (!Character.isDigit(evt.getKeyChar())){
           evt.consume();
        }
    }//GEN-LAST:event_jTextField_phoneKeyTyped

    private void jTextField_1st_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_1st_nameKeyTyped
        char ch = evt.getKeyChar();
        //accept only letters, whitespace, and ISOcontrol for ex backspace bo srinawa 
        if (!Character.isLetter(ch) && !Character.isWhitespace(ch) && !Character.isISOControl(ch)){
           evt.consume();
        }
    }//GEN-LAST:event_jTextField_1st_nameKeyTyped

    private void jTextField_last_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_last_nameKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isLetter(ch) && !Character.isWhitespace(ch) && !Character.isISOControl(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_last_nameKeyTyped

    private void jTextField_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyReleased
        if (jTextField_phone.getText().length() == 10){
            jLabel_phone_validaity.setText("");
        }
        if (jTextField_phone.getText().length() > 10 ){
            jLabel_phone_validaity.setText("Phone isn't valid");
        }
    }//GEN-LAST:event_jTextField_phoneKeyReleased

    private void jButton_sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sign_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_sign_upActionPerformed

    private void jRadioButton_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_maleActionPerformed

    private void jButton_sign_upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_sign_upMouseEntered
        
    }//GEN-LAST:event_jButton_sign_upMouseEntered

    private void jButton_sign_upMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_sign_upMouseExited
        
    }//GEN-LAST:event_jButton_sign_upMouseExited

    private void jLabel_sign_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sign_inMouseClicked
        log_in_frame l = new log_in_frame();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel_sign_inMouseClicked

    private void jCheckBox_show_hide_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_show_hide_passwordMouseClicked
        if (jCheckBox_show_hide_password.isSelected()){
            jPasswordField_new.setEchoChar((char)0);
            jPasswordField_confirm.setEchoChar((char)0);
        }
        else if (!jCheckBox_show_hide_password.isSelected()) {
            jPasswordField_new.setEchoChar('*');
            jPasswordField_confirm.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_show_hide_passwordMouseClicked

    private void jButton_sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_sign_upMouseClicked
        MessageClass m = new MessageClass();
        String fname = jTextField_1st_name.getText();
        String lname = jTextField_last_name.getText();
        String uname = jTextField_username.getText();
        String npass = jPasswordField_new.getText();
        String phone = jTextField_phone.getText();
        String city =  String.valueOf(jComboBox_city.getSelectedItem());
        String birth = String.valueOf(jDateChooser_.getDate());
        jRadioButton_male.setActionCommand("Male");
        jRadioButton_female.setActionCommand("Female");
        String gender = btn_group.getSelection().getActionCommand();
        Access_class ac = new Access_class();
                try {
                    m.icons(unverify_fields());//la dway signUp icon bo frameakai tr dabne ba pey away register bwa ya na
                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                     if (unverify_fields().equals("verified")){
                try {
                    ac.add_username(uname, get_Md5(npass));
                    ac.registering_information(fname, lname, uname, get_Md5(npass), phone, city, birth, gender);
                    ac.create_new_file(uname);
                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            }
          } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }   
        m.setVisible(true);
    }//GEN-LAST:event_jButton_sign_upMouseClicked
    public static String get_Md5(String input) { 
		try {
			MessageDigest m_d = MessageDigest.getInstance("MD5"); 
			byte[] messageDigest = m_d.digest(input.getBytes()); 
			BigInteger sig = new BigInteger(1, messageDigest); 
			String hashtext = sig.toString(16); 
			while (hashtext.length() < 32) { 
				hashtext = "" + hashtext; 
			} 
			return hashtext; 
		}  
		catch (NoSuchAlgorithmException e) { 
			JOptionPane.showMessageDialog(null, "Problem on Encryption! Try Agin!");
		} 
		return "";
	}
    private void jComboBox_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_cityActionPerformed
    public String unverify_fields() throws IOException{
        String fname = jTextField_1st_name.getText();
        String lname = jTextField_last_name.getText();
        String npass = jPasswordField_new.getText();
        String cpass = jPasswordField_confirm.getText();
        String uname = jTextField_username.getText();
        String phone = jTextField_phone.getText();
        String city =  String.valueOf(jComboBox_city.getSelectedItem());
        String birth = String.valueOf(jDateChooser_.getDate());//to prevent nullPointerException instead (..).toStirng you can use String.valueOf(..)
        //gender by default hamana so pewist ba marj naka
        Access_class a = new Access_class();
        if (fname.isBlank() || lname.isBlank() || npass.isBlank() || cpass.isBlank() || uname.isBlank() || phone.isBlank() || 
            fname.toLowerCase().trim().equals("first name")|| lname.toLowerCase().trim().equals("last name")|| npass.toLowerCase().trim().equals("password") ||
            cpass.toLowerCase().trim().equals("confirm") || uname.toLowerCase().trim().equals("username") || phone.toLowerCase().trim().equals("phone")||
            city.toLowerCase().trim().equals("city")){
                //JOptionPane.showMessageDialog(null,"One or more fields are empty", "Empty Fields", 2);
                return "blank";
        }
        else if (uname.length() < 8){
           // JOptionPane.showMessageDialog(null, "Username at least must contain 8 characters", "Username Invalid", 2);
            return "unameLen";
        }
        else if (a.invalid_username(uname)){
            return "usernameTaken";
        }
        else if(!npass.equals(cpass)){
           // JOptionPane.showMessageDialog(null, "Password doesn't match", "Password Confirmation", 2);
            return "passNotMatch";
        }
        else if(npass.length() < 8 || cpass.length() < 8){
           // JOptionPane.showMessageDialog(null, "Make sure to use 8 characters or more for password", "Password Invalid", 2);
            return "passLen";
        }
         else if (phone.length() != 10){
            //JOptionPane.showMessageDialog(null, "Phone isn't valid", "Phone Invalid", 2);
            return "phoneLen";
        }
        else if (jDateChooser_.getDate() == null){//bshtkrdaia ba string == yan .equals na akra wa jDateChooser_.getDate().equals(null) eshy na akrd abw ela == bakar bheny
             return "chooseBirth";
        }
        else if(jDateChooser_.getDate().compareTo(new Date())> 0){
           // JOptionPane.showMessageDialog(null, "No student from future are allowed XD", "Future Students", 2);
            return "date";
        }
        //else if (username taken! username agar dwabara bw balam ama la dway if y usernaem.length daine bo away ama la pesha darkawe agar awani trish xalalian tia bw)
        return "verified";
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                welcomeSection ws = new welcomeSection();
                ws.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_sign_up;
    public javax.swing.JCheckBox jCheckBox_show_hide_password;
    public javax.swing.JComboBox<String> jComboBox_city;
    public com.toedter.calendar.JDateChooser jDateChooser_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_birthDate;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_have_account;
    public javax.swing.JLabel jLabel_password_validation;
    private javax.swing.JLabel jLabel_phone_validaity;
    private javax.swing.JLabel jLabel_register;
    private javax.swing.JLabel jLabel_sign_in;
    public javax.swing.JPasswordField jPasswordField_confirm;
    public javax.swing.JPasswordField jPasswordField_new;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    public javax.swing.JTextField jTextField_1st_name;
    public javax.swing.JTextField jTextField_last_name;
    public javax.swing.JTextField jTextField_phone;
    public javax.swing.JTextField jTextField_username;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
