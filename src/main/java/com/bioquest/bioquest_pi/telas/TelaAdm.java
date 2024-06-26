/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Matheus aa 
 */
public class TelaAdm extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdm
     */
    public TelaAdm() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairButton = new javax.swing.JButton();
        entrarQuizButton = new javax.swing.JButton();
        admButton = new javax.swing.JButton();
        gerenciarButton = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        play1Button = new javax.swing.JButton();
        play2Button = new javax.swing.JButton();
        play3Button = new javax.swing.JButton();
        play4Button = new javax.swing.JButton();
        bioquestLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sairButton.setBackground(new java.awt.Color(255, 49, 49));
        sairButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
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

        admButton.setBackground(new java.awt.Color(255, 98, 49));
        admButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        admButton.setForeground(new java.awt.Color(255, 255, 255));
        admButton.setText("Painel ADM");

        gerenciarButton.setBackground(new java.awt.Color(115, 56, 240));
        gerenciarButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        gerenciarButton.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarButton.setText("Gerenciar Quiz");
        gerenciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarButtonActionPerformed(evt);
            }
        });

        rankingButton.setBackground(new java.awt.Color(255, 98, 49));
        rankingButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        rankingButton.setForeground(new java.awt.Color(255, 255, 255));
        rankingButton.setText("Ver Ranking");

        play1Button.setBackground(new java.awt.Color(255, 223, 53));
        play1Button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        play1Button.setForeground(new java.awt.Color(255, 255, 255));
        play1Button.setText("JOGAR");

        play2Button.setBackground(new java.awt.Color(255, 223, 53));
        play2Button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        play2Button.setForeground(new java.awt.Color(255, 255, 255));
        play2Button.setText("JOGAR");

        play3Button.setBackground(new java.awt.Color(255, 223, 53));
        play3Button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        play3Button.setForeground(new java.awt.Color(255, 255, 255));
        play3Button.setText("JOGAR");

        play4Button.setBackground(new java.awt.Color(255, 223, 53));
        play4Button.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        play4Button.setForeground(new java.awt.Color(255, 255, 255));
        play4Button.setText("JOGAR");

        bioquestLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo menor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(entrarQuizButton)
                    .addComponent(admButton)
                    .addComponent(rankingButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sairButton)
                            .addGap(18, 18, 18)
                            .addComponent(bioquestLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(play1Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(play2Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(play3Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(play4Button)))
                    .addComponent(gerenciarButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sairButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bioquestLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addComponent(entrarQuizButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerenciarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rankingButton)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play1Button)
                    .addComponent(play2Button)
                    .addComponent(play3Button)
                    .addComponent(play4Button))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        LoginTela loginTela = new LoginTela();
        this.dispose();
        loginTela.setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void entrarQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarQuizButtonActionPerformed
        old_EntrarQuizTela entrarQuiz = new old_EntrarQuizTela();
        this.dispose();
        entrarQuiz.setVisible(true);
    }//GEN-LAST:event_entrarQuizButtonActionPerformed

    private void gerenciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarButtonActionPerformed
        CriarQuizTela quizTela = new CriarQuizTela();
        this.dispose();
        quizTela.setVisible(true);
    }//GEN-LAST:event_gerenciarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admButton;
    private javax.swing.JLabel bioquestLabel;
    private javax.swing.JButton entrarQuizButton;
    private javax.swing.JButton gerenciarButton;
    private javax.swing.JButton play1Button;
    private javax.swing.JButton play2Button;
    private javax.swing.JButton play3Button;
    private javax.swing.JButton play4Button;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
