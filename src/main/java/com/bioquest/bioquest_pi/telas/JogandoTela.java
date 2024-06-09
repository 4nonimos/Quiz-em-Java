/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;


import com.bioquest.bioquest_pi.bd.ConnectionFactory;
import com.bioquest.bioquest_pi.bd.RelatorioDAO;
import com.bioquest.bioquest_pi.modelo.Relatorio;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author mmgd0
 */
public class JogandoTela extends javax.swing.JFrame {
    private String resposta;
    private int pontuacao = 0;
    private int pont_total = 0;
    private int num_questao = 1;
    private int idquiz;
    private List<Integer> quest_resp;
    private String[] resp_sel;
    private String respo_selec;
    private long startTime = System.nanoTime();
    private int totalQuest;
    private String alt_selecionada;

    /**
     * Creates new form JogandoTela
     * @param idquiz
     */
    public JogandoTela(int idquiz) {
        this.idquiz = idquiz;
        getContentPane().setBackground(Color.BLACK);
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        quest_resp = new ArrayList();
        
        fetch();
        
    }
    public void atualizarBotao(boolean a){        
        respostaAButton.setEnabled(a);
        respostaBButton.setEnabled(a);
        respostaCButton.setEnabled(a);
        respostaDButton.setEnabled(a);
       
    }
    private void fetch(){
         // Database query to fetch the name
        String sql = String.format("SELECT * FROM questoes_db WHERE idquestoes = %d AND idquiz = %d", num_questao, idquiz); // Example query
        String totalsql = String.format("SELECT num_quest FROM quiz_db WHERE idquiz = %d", idquiz);
        //String insertsql = String.format("INSERT INTO ranking_db(idCadastro, alt_selecionada) VALUES(?,?)");

        try (Connection connection = new ConnectionFactory().obterConexao();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
             

            if (rs.next()) {
                resposta = rs.getString("alt_correta");
                String pergunta = rs.getString("pergunta");
                nameLabel.setText(pergunta); // Set the fetched name to the JLabel
                String respostaA = rs.getString("alt_a");
                respostaAButton.setText(respostaA);
                String respostab = rs.getString("alt_b");
                respostaBButton.setText(respostab);
                String respostac = rs.getString("alt_c");
                respostaCButton.setText(respostac);
                String respostad = rs.getString("alt_d");
                respostaDButton.setText(respostad);
            } else {
                nameLabel.setText("No name found");
            }
             try(PreparedStatement psTotal = connection.prepareStatement(totalsql);
                    ResultSet rsTotal = psTotal.executeQuery()){
                
                if(rsTotal.next()){
                    int totalQuest = rsTotal.getInt("num_quest");
                    pont_total = totalQuest * 10;
                    //Relatorio relat = new Relatorio(totalQuest);
                }
             /*try(PreparedStatement psQuest = connection.prepareStatement(insertsql);
                     ResultSet rsQuest = psQuest.executeQuery()){
                 if(rsQuest.next()){
                     int id = rsQuest.getInt("idCadastro");
                     String alt = rsQuest.getString("alt_selecionada");
                     
                 }
             }*/
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        if(quest_resp.contains(num_questao)){
            atualizarBotao(false);
            //System.out.println(resp_sel[num_questao]);
            //System.out.println(num_questao);
            /*switch(resp_sel[num_questao]){               
                    case("A") -> {
                    respostaAButton.setBackground(Color.RED);
                    respostaAButton.setOpaque(true);
                    break;
                    }
                    case("B") -> {
                    respostaBButton.setBackground(Color.RED);
                    respostaBButton.setOpaque(true);
                    break;
                    }
                    case("C") -> {
                    respostaCButton.setBackground(Color.RED);
                    respostaCButton.setOpaque(true);
                    break;
                    }
                    case("D") -> {
                    respostaDButton.setBackground(Color.RED);
                    respostaDButton.setOpaque(true);
                    break;
                    }

            
        }
            */
        }
        else{
            atualizarBotao(true);
            
        }
        //if(resp_sel.contains(1)){
        //    respostaAButton.setBackground(Color.RED);
            
        
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respostaDButton = new javax.swing.JButton();
        respostaAButton = new javax.swing.JButton();
        respostaCButton = new javax.swing.JButton();
        respostaBButton = new javax.swing.JButton();
        anteriorButton = new javax.swing.JButton();
        proximaButton = new javax.swing.JButton();
        finalizarButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        respostaDButton.setBackground(new java.awt.Color(34, 34, 47));
        respostaDButton.setForeground(new java.awt.Color(255, 255, 255));
        respostaDButton.setText("Resposta D");
        respostaDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaDButtonActionPerformed(evt);
            }
        });

        respostaAButton.setBackground(new java.awt.Color(34, 34, 47));
        respostaAButton.setForeground(new java.awt.Color(255, 255, 255));
        respostaAButton.setText("Resposta A");
        respostaAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        respostaAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respostaAButtonMouseClicked(evt);
            }
        });
        respostaAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaAButtonActionPerformed(evt);
            }
        });

        respostaCButton.setBackground(new java.awt.Color(34, 34, 47));
        respostaCButton.setForeground(new java.awt.Color(255, 255, 255));
        respostaCButton.setText("Resposta C");
        respostaCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaCButtonActionPerformed(evt);
            }
        });

        respostaBButton.setBackground(new java.awt.Color(34, 34, 47));
        respostaBButton.setForeground(new java.awt.Color(255, 255, 255));
        respostaBButton.setText("Resposta B");
        respostaBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaBButtonActionPerformed(evt);
            }
        });

        anteriorButton.setBackground(new java.awt.Color(50, 103, 238));
        anteriorButton.setForeground(new java.awt.Color(255, 255, 255));
        anteriorButton.setText("Anterior");
        anteriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorButtonActionPerformed(evt);
            }
        });

        proximaButton.setBackground(new java.awt.Color(131, 177, 0));
        proximaButton.setForeground(new java.awt.Color(255, 255, 255));
        proximaButton.setText("Próxima");
        proximaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaButtonActionPerformed(evt);
            }
        });

        finalizarButton.setBackground(new java.awt.Color(255, 49, 49));
        finalizarButton.setForeground(new java.awt.Color(255, 255, 255));
        finalizarButton.setText("Finalizar");
        finalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarButtonActionPerformed(evt);
            }
        });

        nameLabel.setBackground(new java.awt.Color(34,34,47));
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name Here");
        nameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameLabel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respostaCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(respostaAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(respostaBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(anteriorButton)
                .addGap(7, 7, 7)
                .addComponent(proximaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(respostaDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizarButton))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respostaAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respostaBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 189, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respostaCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respostaDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anteriorButton)
                    .addComponent(proximaButton)
                    .addComponent(finalizarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarButtonActionPerformed
        TelaRelatorio relat = new TelaRelatorio(pontuacao, pont_total,System.nanoTime() - startTime,respo_selec,num_questao);
        relat.setVisible(true);
        
    }//GEN-LAST:event_finalizarButtonActionPerformed

    private void proximaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaButtonActionPerformed
        ++num_questao;
        //respostaAButton.setBackground(Color.white);
        atualizarBotao(true);
        fetch();
                
    }//GEN-LAST:event_proximaButtonActionPerformed

    private void respostaAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaAButtonActionPerformed
        quest_resp.add(num_questao);
        respo_selec = "A";
        alt_selecionada = "A";
        atualizarBotao(false);
        Relatorio r = new Relatorio(); 
        RelatorioDAO cad = new RelatorioDAO();
        try{       
        if (cad.existe(r)){        
        r.setIdCadastro(r.getIdCadastro());
        r.setAlt_selecionada(alt_selecionada);       
        cad.inserir(r);
        }
        }
        catch (Exception e){
        e.printStackTrace();
    }
        if (resposta.equalsIgnoreCase("A")) {            
            pontuacao += 10;
        }
        
    }//GEN-LAST:event_respostaAButtonActionPerformed

    private void respostaBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaBButtonActionPerformed
        quest_resp.add(num_questao);
        respo_selec = "B";
        atualizarBotao(false);
        if (resposta.equalsIgnoreCase("B")) {
            pontuacao += 10;
        }
    }//GEN-LAST:event_respostaBButtonActionPerformed

    private void respostaCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaCButtonActionPerformed
        quest_resp.add(num_questao);
        respo_selec = "D";
        atualizarBotao(false);
        if (resposta.equalsIgnoreCase("C")) {
            pontuacao += 10;
        }
    }//GEN-LAST:event_respostaCButtonActionPerformed

    private void respostaDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaDButtonActionPerformed
        quest_resp.add(num_questao);
        respo_selec = "D";
        atualizarBotao(false);
        if (resposta.equalsIgnoreCase("D")) {
            pontuacao += 10;
        }
    }//GEN-LAST:event_respostaDButtonActionPerformed

    private void anteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorButtonActionPerformed
        --num_questao;
        atualizarBotao(false);
        fetch();
    }//GEN-LAST:event_anteriorButtonActionPerformed

    private void respostaAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_respostaAButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_respostaAButtonMouseClicked

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
            java.util.logging.Logger.getLogger(JogandoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogandoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogandoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogandoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogandoTela(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorButton;
    private javax.swing.JButton finalizarButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton proximaButton;
    private javax.swing.JButton respostaAButton;
    private javax.swing.JButton respostaBButton;
    private javax.swing.JButton respostaCButton;
    private javax.swing.JButton respostaDButton;
    // End of variables declaration//GEN-END:variables
}
