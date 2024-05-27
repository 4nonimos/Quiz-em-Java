/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import com.bioquest.bioquest_pi.bd.SalaDAO;
import com.bioquest.bioquest_pi.modelo.Sala;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Thamires
 */
public class EntrarQuizTela extends javax.swing.JFrame {

    /**
     * Creates new form EntrarQuizTela
     */
    public EntrarQuizTela() {
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

        idQuizTextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        entrarQuizButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idQuizTextField.setBackground(new java.awt.Color(39, 42, 50));
        idQuizTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Insira o Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(62, 67, 82))); // NOI18N
        idQuizTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idQuizTextFieldActionPerformed(evt);
            }
        });

        voltarButton.setBackground(new java.awt.Color(255, 49, 49));
        voltarButton.setText("voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        entrarQuizButton.setBackground(new java.awt.Color(255, 223, 53));
        entrarQuizButton.setText("entrar");
        entrarQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarQuizButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addGap(192, 192, 192)
                .addComponent(entrarQuizButton)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idQuizTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(idQuizTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarQuizButton)
                    .addComponent(voltarButton))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idQuizTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idQuizTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idQuizTextFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaInicialAluno telaAluno = new TelaInicialAluno();
        this.dispose();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void entrarQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarQuizButtonActionPerformed
        try{
            var idsala = idQuizTextField.getText();
            Sala s = new Sala();
            int idsalaint = Integer.parseInt(idsala);
            s.setIdsala(idsalaint);
            SalaDAO dao = new SalaDAO();
            if(dao.existe(s)){
                JogandoTela jogaTela = new JogandoTela();
                this.dispose();
                jogaTela.setVisible(true);
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde");
        }
            
    }//GEN-LAST:event_entrarQuizButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EntrarQuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrarQuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrarQuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrarQuizTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrarQuizTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarQuizButton;
    private javax.swing.JTextField idQuizTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
