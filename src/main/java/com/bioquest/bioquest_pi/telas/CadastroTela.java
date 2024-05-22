/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import com.bioquest.bioquest_pi.bd.UsuarioCAD;
import com.bioquest.bioquest_pi.modelo.Usuario;

/**
 *
 * @author Thamires
 */
public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTela
     */
    public CadastroTela() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailTextField = new javax.swing.JTextField();
        criaSenhaPasswordField = new javax.swing.JPasswordField();
        verSenhaToggleButton = new javax.swing.JToggleButton();
        nomeUsuarioTextField = new javax.swing.JTextField();
        voltarParaLoginButton = new javax.swing.JButton();
        EnviarParaBancoButton = new javax.swing.JButton();
        idadeTextField = new javax.swing.JTextField();
        cadastroLabel = new javax.swing.JLabel();
        dadosLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailTextField.setBackground(new java.awt.Color(39, 42, 50));
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite seu E-mail", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 12), new java.awt.Color(62, 67, 82))); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        criaSenhaPasswordField.setBackground(new java.awt.Color(39, 42, 50));
        criaSenhaPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        criaSenhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite uma Senha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 12), new java.awt.Color(62, 67, 82))); // NOI18N
        criaSenhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaSenhaPasswordFieldActionPerformed(evt);
            }
        });

        verSenhaToggleButton.setBackground(new java.awt.Color(39, 42, 50));
        verSenhaToggleButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        verSenhaToggleButton.setForeground(new java.awt.Color(62, 67, 82));
        verSenhaToggleButton.setText("ver senha");
        verSenhaToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSenhaToggleButtonActionPerformed(evt);
            }
        });

        nomeUsuarioTextField.setBackground(new java.awt.Color(39, 42, 50));
        nomeUsuarioTextField.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite seu Nome", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 12), new java.awt.Color(62, 67, 82))); // NOI18N
        nomeUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioTextFieldActionPerformed(evt);
            }
        });

        voltarParaLoginButton.setBackground(new java.awt.Color(115, 56, 240));
        voltarParaLoginButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        voltarParaLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarParaLoginButton.setText("Voltar ao login");
        voltarParaLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarParaLoginButtonActionPerformed(evt);
            }
        });

        EnviarParaBancoButton.setBackground(new java.awt.Color(80, 241, 65));
        EnviarParaBancoButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        EnviarParaBancoButton.setForeground(new java.awt.Color(255, 255, 255));
        EnviarParaBancoButton.setText("AVANÇAR");
        EnviarParaBancoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarParaBancoButtonActionPerformed(evt);
            }
        });

        idadeTextField.setBackground(new java.awt.Color(39, 42, 50));
        idadeTextField.setForeground(new java.awt.Color(255, 255, 255));
        idadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite sua Idade", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 12), new java.awt.Color(62, 67, 82))); // NOI18N
        idadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTextFieldActionPerformed(evt);
            }
        });

        cadastroLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cadastroLabel.setText("Cadastrar");

        dadosLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        dadosLabel.setText("Usaremos seus dados para poder salvar/gravar seu progresso!");

        loginLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        loginLabel.setText("Login");

        nomeLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        nomeLabel.setText("Nome");

        senhaLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        senhaLabel.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(senhaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(criaSenhaPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastroLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(voltarParaLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EnviarParaBancoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(85, 85, 85)
                                            .addComponent(dadosLabel)))
                                    .addGap(38, 38, 38)
                                    .addComponent(verSenhaToggleButton))))
                        .addContainerGap(221, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cadastroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaLabel)
                .addGap(5, 5, 5)
                .addComponent(criaSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verSenhaToggleButton)
                    .addComponent(dadosLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnviarParaBancoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(voltarParaLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        var email =  emailTextField.getText();
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void criaSenhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaSenhaPasswordFieldActionPerformed
        var senha = new String(criaSenhaPasswordField.getPassword());
        
    }//GEN-LAST:event_criaSenhaPasswordFieldActionPerformed

    private void voltarParaLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarParaLoginButtonActionPerformed
        // TODO add your handling code here:
        LoginTela loginTela = new LoginTela();
        this.dispose();
        loginTela.setVisible(true);
    }//GEN-LAST:event_voltarParaLoginButtonActionPerformed

    private void EnviarParaBancoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarParaBancoButtonActionPerformed
        Usuario u = new Usuario();
        u.setEmail(emailTextField.getText());
        u.setSenha(new String(criaSenhaPasswordField.getPassword()));
        u.setIdade(idadeTextField.getText());
        u.setNome(nomeUsuarioTextField.getText());
        UsuarioCAD cad = new UsuarioCAD();
        cad.inserir(u);
        LoginTela loginTela = new LoginTela();
        this.dispose();
        loginTela.setVisible(true);
    }//GEN-LAST:event_EnviarParaBancoButtonActionPerformed

    private void verSenhaToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSenhaToggleButtonActionPerformed
        // TODO add your handling code here:
        boolean visivel = criaSenhaPasswordField.getEchoChar() == 0;

        // Alterna a visibilidade da senha
        criaSenhaPasswordField.setEchoChar(visivel ? '\u25cf' : 0);
    }//GEN-LAST:event_verSenhaToggleButtonActionPerformed

    private void idadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTextFieldActionPerformed
        var idade = idadeTextField.getText();
    }//GEN-LAST:event_idadeTextFieldActionPerformed

    private void nomeUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuarioTextFieldActionPerformed
        var nome = nomeUsuarioTextField.getText();
    }//GEN-LAST:event_nomeUsuarioTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarParaBancoButton;
    private javax.swing.JLabel cadastroLabel;
    private javax.swing.JPasswordField criaSenhaPasswordField;
    private javax.swing.JLabel dadosLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeUsuarioTextField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JToggleButton verSenhaToggleButton;
    private javax.swing.JButton voltarParaLoginButton;
    // End of variables declaration//GEN-END:variables
}
