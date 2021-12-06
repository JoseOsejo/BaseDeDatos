
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jcoq2
 */
public class AplicacionBaseDeDatos extends javax.swing.JFrame {

    /**
     * Creates new form BaseDeDatos
     */
    public AplicacionBaseDeDatos() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logInDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logInButton2 = new javax.swing.JToggleButton();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        goBackLabel = new javax.swing.JLabel();
        RegistrarseDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gestionUsuarios_Cb = new javax.swing.JCheckBox();
        create_Cb = new javax.swing.JCheckBox();
        select_Cb = new javax.swing.JCheckBox();
        insert_Cb = new javax.swing.JCheckBox();
        delete_Cb = new javax.swing.JCheckBox();
        drop_Cb = new javax.swing.JCheckBox();
        registrarseButton2 = new javax.swing.JButton();
        pruebaBoton = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        sistemasUsuariosLabel = new javax.swing.JLabel();
        baseDeDatosLabel = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        registrarseButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Log In");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        logInButton2.setText("Log In");

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        goBackLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\jcoq2\\Videos\\atras.png")); // NOI18N
        goBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goBackLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logInButton2)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(goBackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(logInButton2)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout logInDialogLayout = new javax.swing.GroupLayout(logInDialog.getContentPane());
        logInDialog.getContentPane().setLayout(logInDialogLayout);
        logInDialogLayout.setHorizontalGroup(
            logInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logInDialogLayout.setVerticalGroup(
            logInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Registrarse");

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Permisos");

        gestionUsuarios_Cb.setText("Gestion de Nuevos Usuarios");

        create_Cb.setText("Create");

        select_Cb.setText("Select");

        insert_Cb.setText("Insert");

        delete_Cb.setText("Delete");

        drop_Cb.setText("Drop");

        registrarseButton2.setBackground(new java.awt.Color(0, 255, 0));
        registrarseButton2.setForeground(new java.awt.Color(255, 255, 255));
        registrarseButton2.setText("Registrarse");
        registrarseButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseButton2ActionPerformed(evt);
            }
        });

        pruebaBoton.setText("jButton1");
        pruebaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert_Cb)
                            .addComponent(gestionUsuarios_Cb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(select_Cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drop_Cb)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(create_Cb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_Cb)
                                .addGap(17, 17, 17))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(registrarseButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pruebaBoton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(pruebaBoton)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_Cb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gestionUsuarios_Cb)
                        .addComponent(drop_Cb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_Cb)
                    .addComponent(insert_Cb)
                    .addComponent(delete_Cb))
                .addGap(18, 18, 18)
                .addComponent(registrarseButton2)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout RegistrarseDialogLayout = new javax.swing.GroupLayout(RegistrarseDialog.getContentPane());
        RegistrarseDialog.getContentPane().setLayout(RegistrarseDialogLayout);
        RegistrarseDialogLayout.setHorizontalGroup(
            RegistrarseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegistrarseDialogLayout.setVerticalGroup(
            RegistrarseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sistemasUsuariosLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sistemasUsuariosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sistemasUsuariosLabel.setText("Sistema de Usuarios");

        baseDeDatosLabel.setForeground(new java.awt.Color(153, 0, 0));
        baseDeDatosLabel.setText("Base De Datos");

        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        registrarseButton.setText("Registrarse");
        registrarseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(baseDeDatosLabel)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sistemasUsuariosLabel)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(sistemasUsuariosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(baseDeDatosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(logInButton)
                .addGap(38, 38, 38)
                .addComponent(registrarseButton)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        this.setVisible(false);
        logInDialog.setVisible(true);
        logInDialog.setLocationRelativeTo(null);
        logInDialog.setResizable(false);
        logInDialog.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_logInButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void goBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackLabelMouseClicked
        logInDialog.setVisible(false);
        this.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_goBackLabelMouseClicked

    private void registrarseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseButtonActionPerformed
        RegistrarseDialog.setVisible(true);
        RegistrarseDialog.pack();
        RegistrarseDialog.setLocationRelativeTo(null);
        RegistrarseDialog.setResizable(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseButtonActionPerformed

    private void registrarseButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseButton2ActionPerformed
        UserManagement validacion = new UserManagement();
        boolean gestionDeNuevosUsuarios = false;
        boolean create = false;
        boolean select = false;
        boolean insert = false;
        boolean delete = false;
        boolean drop = false;
        
            String username = userTextField.getText();
            String password = passTextField.getText();
            if (gestionUsuarios_Cb.isSelected()) {
                gestionDeNuevosUsuarios = true;
            }
             if (create_Cb.isSelected()) {
                create = true;
            }
             if (select_Cb.isSelected()) {
                select = true;
            }
             if (insert_Cb.isSelected()) {
                insert = true;
            }
            if (delete_Cb.isSelected()) {
                delete = true;
            }
            if (drop_Cb.isSelected()) {
                drop = true;
            }
            boolean usuarioExiste = validacion.checkUser(usuarios, username);
            boolean userVacio = userTextField.getText().isEmpty();
            boolean passVacio = passTextField.getText().isEmpty();
            if(usuarioExiste == true && userVacio == false && passVacio == false){
            usuarios.add(new Usuario(username, password, 
                    gestionDeNuevosUsuarios, create, select,
                    insert, delete, drop));
            }else{
                JOptionPane.showMessageDialog(this, "Hubo un error al registrar los datos");
            }
            
            userTextField.setText("");
            passTextField.setText("");
            gestionUsuarios_Cb.setSelected(false);
            create_Cb.setSelected(false);
            select_Cb.setSelected(false);
            insert_Cb.setSelected(false);
            delete_Cb.setSelected(false);
            drop_Cb.setSelected(false);

       

        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseButton2ActionPerformed

    private void pruebaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaBotonActionPerformed
        UserManagement listar = new UserManagement();
        listar.listarUsuarios(usuarios);
        // TODO add your handling code here:
    }//GEN-LAST:event_pruebaBotonActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicacionBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionBaseDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionBaseDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog RegistrarseDialog;
    private javax.swing.JLabel baseDeDatosLabel;
    private javax.swing.JCheckBox create_Cb;
    private javax.swing.JCheckBox delete_Cb;
    private javax.swing.JCheckBox drop_Cb;
    private javax.swing.JCheckBox gestionUsuarios_Cb;
    private javax.swing.JLabel goBackLabel;
    private javax.swing.JCheckBox insert_Cb;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logInButton;
    private javax.swing.JToggleButton logInButton2;
    private javax.swing.JDialog logInDialog;
    private javax.swing.JTextField passTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton pruebaBoton;
    private javax.swing.JButton registrarseButton;
    private javax.swing.JButton registrarseButton2;
    private javax.swing.JCheckBox select_Cb;
    private javax.swing.JLabel sistemasUsuariosLabel;
    private javax.swing.JTextField userTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuario> usuarios = new ArrayList();
    

}
