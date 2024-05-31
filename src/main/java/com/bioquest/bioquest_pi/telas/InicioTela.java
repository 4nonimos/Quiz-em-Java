/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import java.awt.Color;

/**
 *
 * @author Thamires
 */
public class InicioTela extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public InicioTela() {
        initComponents();
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

        nomeUsuarioLabel = new javax.swing.JLabel();
        pontosLabel = new javax.swing.JLabel();
        configuracaoButton = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        playFase1Button = new javax.swing.JButton();
        playFase2Button = new javax.swing.JButton();
        playFase3Button = new javax.swing.JButton();
        playFase4Button = new javax.swing.JButton();
        fotoUsuarioLabel = new javax.swing.JLabel();
        trocarFotoUsuarioButton = new javax.swing.JButton();
        criarFaseButton = new javax.swing.JButton();
        deslogarContaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeUsuarioLabel.setText("*NOME DE USUARIO AQUI");

        pontosLabel.setText("PONTOS AQUI");

        configuracaoButton.setBackground(new java.awt.Color(50, 103, 238));
        configuracaoButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        configuracaoButton.setForeground(new java.awt.Color(255, 255, 255));
        configuracaoButton.setText("Configurações");
        configuracaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracaoButtonActionPerformed(evt);
            }
        });

        rankingButton.setBackground(new java.awt.Color(255, 98, 49));
        rankingButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        rankingButton.setForeground(new java.awt.Color(255, 255, 255));
        rankingButton.setText("Ranking");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        playFase1Button.setBackground(new java.awt.Color(255, 223, 53));
        playFase1Button.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        playFase1Button.setForeground(new java.awt.Color(255, 255, 255));
        playFase1Button.setText("JOGAR");
        playFase1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playFase1ButtonActionPerformed(evt);
            }
        });

        playFase2Button.setBackground(new java.awt.Color(255, 223, 53));
        playFase2Button.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        playFase2Button.setForeground(new java.awt.Color(255, 255, 255));
        playFase2Button.setText("JOGAR");

        playFase3Button.setBackground(new java.awt.Color(255, 223, 53));
        playFase3Button.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        playFase3Button.setForeground(new java.awt.Color(255, 255, 255));
        playFase3Button.setText("JOGAR");
        playFase3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playFase3ButtonActionPerformed(evt);
            }
        });

        playFase4Button.setBackground(new java.awt.Color(255, 223, 53));
        playFase4Button.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        playFase4Button.setForeground(new java.awt.Color(255, 255, 255));
        playFase4Button.setText("JOGAR");

        fotoUsuarioLabel.setText("FOTO AQUI");

        trocarFotoUsuarioButton.setText("TROCAR FOTO ");

        criarFaseButton.setBackground(new java.awt.Color(21, 255, 0));
        criarFaseButton.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        criarFaseButton.setForeground(new java.awt.Color(255, 255, 255));
        criarFaseButton.setText("+");

        deslogarContaButton.setText("SAIR USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(playFase1Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(fotoUsuarioLabel)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deslogarContaButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pontosLabel)
                                .addComponent(nomeUsuarioLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rankingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(configuracaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playFase2Button)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 208, Short.MAX_VALUE)
                                .addComponent(criarFaseButton)
                                .addGap(114, 114, 114))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playFase3Button)
                                .addGap(67, 67, 67)
                                .addComponent(playFase4Button))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(trocarFotoUsuarioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trocarFotoUsuarioButton)
                            .addComponent(deslogarContaButton))
                        .addGap(2, 2, 2)
                        .addComponent(nomeUsuarioLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pontosLabel)
                            .addComponent(fotoUsuarioLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(rankingButton)
                        .addGap(18, 18, 18)
                        .addComponent(configuracaoButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(criarFaseButton)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playFase1Button)
                    .addComponent(playFase2Button)
                    .addComponent(playFase3Button)
                    .addComponent(playFase4Button))
                .addGap(158, 158, 158))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playFase1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playFase1ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playFase1ButtonActionPerformed

    private void playFase3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playFase3ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playFase3ButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void configuracaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracaoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configuracaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configuracaoButton;
    private javax.swing.JButton criarFaseButton;
    private javax.swing.JButton deslogarContaButton;
    private javax.swing.JLabel fotoUsuarioLabel;
    private javax.swing.JLabel nomeUsuarioLabel;
    private javax.swing.JButton playFase1Button;
    private javax.swing.JButton playFase2Button;
    private javax.swing.JButton playFase3Button;
    private javax.swing.JButton playFase4Button;
    private javax.swing.JLabel pontosLabel;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton trocarFotoUsuarioButton;
    // End of variables declaration//GEN-END:variables
}
