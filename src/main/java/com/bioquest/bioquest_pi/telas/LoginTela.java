/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import com.bioquest.bioquest_pi.bd.UsuarioDAO;
import com.bioquest.bioquest_pi.modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Thamires
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
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
        senhaPasswordField = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        cadastroButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        convidadoButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        facaloginLabel = new javax.swing.JLabel();
        imagemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailTextField.setBackground(new java.awt.Color(24, 26, 31));
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite seu RA ou E-mail", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 14), new java.awt.Color(62, 67, 82))); // NOI18N
        emailTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        emailTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        senhaPasswordField.setBackground(new java.awt.Color(24, 26, 31));
        senhaPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        senhaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Digite sua senha", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 14), new java.awt.Color(62, 67, 82))); // NOI18N
        senhaPasswordField.setCaretColor(new java.awt.Color(255, 255, 255));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });

        entrarButton.setBackground(new java.awt.Color(255, 223, 53));
        entrarButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setText("Entrar na Conta");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        cadastroButton.setBackground(new java.awt.Color(115, 56, 240));
        cadastroButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        cadastroButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        sairButton.setBackground(new java.awt.Color(204, 0, 0));
        sairButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        convidadoButton.setBackground(new java.awt.Color(131, 177, 0));
        convidadoButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        convidadoButton.setForeground(new java.awt.Color(255, 255, 255));
        convidadoButton.setText("Entrar como convidado");
        convidadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convidadoButtonActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        loginLabel.setText("Login");

        senhaLabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        senhaLabel.setText("Senha");

        facaloginLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        facaloginLabel.setText("Faça seu Login");

        imagemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(sairButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(facaloginLabel)
                        .addGap(134, 134, 134)
                        .addComponent(imagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(loginLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(senhaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(convidadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sairButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(facaloginLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(imagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(loginLabel)
                .addGap(6, 6, 6)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(senhaLabel)
                .addGap(6, 6, 6)
                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(convidadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        //var email = emailTextField.getText();
        
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        //var senha = new String(senhaPasswordField.getPassword());
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        try{
            //1. Pegar o login digitado pelo usuário
            var email = emailTextField.getText();
            //2. Pegar a senha digitada pelo usuário
            var senha = new String(senhaPasswordField.getPassword());
            var car = new String();
            //3. Verificar se ambos são iguais a admin 
            //string pool
            Usuario u;
            u = new Usuario(email,senha,car);
            //var cargo = u.getCargo();
            u.setEmail(email);
            u.setSenha(senha);
            //u.setCargo(cargo);
            UsuarioDAO dao = new UsuarioDAO();           
            if(dao.existe(u)){
                String cargo = dao.recebeCargo(u);
                    switch(cargo){
                        case "ALUNO" ->{
                            TelaInicialAluno telaAluno = new TelaInicialAluno();
                            this.dispose();
                            telaAluno.setVisible(true);
                        }
                        case "PROFESSOR" ->{
                            TelaProfessor telaProf = new TelaProfessor();
                            this.dispose();
                            telaProf.setVisible(true);
                        }
                        }
                    }
                //JOptionPane.showMessageDialog(null, "Bem vindo");
            
            else{
                JOptionPane.showMessageDialog(null, "Par usuário/senha inválido");
            }
        }        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde");
        }        
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
        CadastroTela cadastro = new CadastroTela();
        this.dispose();
        cadastro.setVisible(true);
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void convidadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convidadoButtonActionPerformed
        TelaInicialAluno telaAluno = new TelaInicialAluno();
        this.dispose();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_convidadoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JButton convidadoButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel facaloginLabel;
    private javax.swing.JLabel imagemLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
