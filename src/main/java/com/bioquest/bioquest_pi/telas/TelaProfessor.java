/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import com.bioquest.bioquest_pi.modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class TelaProfessor extends javax.swing.JFrame {

    /**
     * Creates new form TelaProfessor
     */
    public TelaProfessor() {
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

        SairLoginButton = new javax.swing.JButton();
        entrarQuizButton = new javax.swing.JButton();
        VerRankingButton = new javax.swing.JButton();
        GerenciarQuizButton = new javax.swing.JButton();
        IrParaConfigsButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        imagemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SairLoginButton.setBackground(new java.awt.Color(255, 49, 49));
        SairLoginButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        SairLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        SairLoginButton.setText("Sair");
        SairLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairLoginButtonActionPerformed(evt);
            }
        });

        entrarQuizButton.setBackground(new java.awt.Color(131, 177, 0));
        entrarQuizButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        entrarQuizButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarQuizButton.setText("Entrar Quiz");
        entrarQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarQuizButtonActionPerformed(evt);
            }
        });

        VerRankingButton.setBackground(new java.awt.Color(255, 98, 49));
        VerRankingButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        VerRankingButton.setForeground(new java.awt.Color(255, 255, 255));
        VerRankingButton.setText("Ver Ranking");
        VerRankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerRankingButtonActionPerformed(evt);
            }
        });

        GerenciarQuizButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        GerenciarQuizButton.setText("Gerenciar Quiz");
        GerenciarQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarQuizButtonActionPerformed(evt);
            }
        });

        IrParaConfigsButton.setBackground(new java.awt.Color(50, 103, 238));
        IrParaConfigsButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        IrParaConfigsButton.setForeground(new java.awt.Color(255, 255, 255));
        IrParaConfigsButton.setText("Configurações");
        IrParaConfigsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrParaConfigsButtonActionPerformed(evt);
            }
        });

        jButton2.setText("jogar 1");

        jButton3.setText("jogar 2");

        jButton4.setText("jogar 3");

        jButton5.setText("jogar 4");

        imagemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo menor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagemLabel)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SairLoginButton)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(entrarQuizButton)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(VerRankingButton)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GerenciarQuizButton)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(IrParaConfigsButton)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(SairLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(entrarQuizButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerRankingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GerenciarQuizButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IrParaConfigsButton)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairLoginButtonActionPerformed
        // TODO add your handling code here:
        LoginTela loginTela = new LoginTela();
        this.dispose();
        loginTela.setVisible(true);
    }//GEN-LAST:event_SairLoginButtonActionPerformed

    private void IrParaConfigsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrParaConfigsButtonActionPerformed
        // TODO add your handling code here:
        Configuracao config = new Configuracao();
        this.dispose();
        config.setVisible(true);
    }//GEN-LAST:event_IrParaConfigsButtonActionPerformed

    private void GerenciarQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarQuizButtonActionPerformed
        CriarQuizTela quizTela = new CriarQuizTela();
        this.dispose();
        quizTela.setVisible(true);
    }//GEN-LAST:event_GerenciarQuizButtonActionPerformed

    private void entrarQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarQuizButtonActionPerformed
        EntrarQuizTela entrarTela = new EntrarQuizTela();
        this.dispose();
        entrarTela.setVisible(true);
    }//GEN-LAST:event_entrarQuizButtonActionPerformed

    private void VerRankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRankingButtonActionPerformed
        String idQuiz;
        int number;
        idQuiz = JOptionPane.showInputDialog("Insira o Id do Quiz");
        number = Integer.parseInt(idQuiz);
        Usuario Usuario = null;
        InfoRanking ranking = new InfoRanking();
        this.dispose();
        ranking.setVisible(true);
    }//GEN-LAST:event_VerRankingButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GerenciarQuizButton;
    private javax.swing.JButton IrParaConfigsButton;
    private javax.swing.JButton SairLoginButton;
    private javax.swing.JButton VerRankingButton;
    private javax.swing.JButton entrarQuizButton;
    private javax.swing.JLabel imagemLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
