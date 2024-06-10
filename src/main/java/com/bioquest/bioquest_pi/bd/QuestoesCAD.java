/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.bd;

import com.bioquest.bioquest_pi.modelo.Questoes;
//import com.bioquest.bioquest_pi.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author pedro
 */
public class QuestoesCAD {
    public void inserir (Questoes q){
    //1: Definir o comando SQL
    String sql = "INSERT INTO questoes_db(idquestoes, pergunta, alt_a, alt_b, alt_c, alt_d, alt_correta, idquiz) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obterConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setInt(1, q.getIdquestoes());
        ps.setString(2, q.getPergunta());
        ps.setString(3, q.getAlt_a());
        ps.setString(4, q.getAlt_b());
        ps.setString(5, q.getAlt_c());
        ps.setString(6, q.getAlt_d());
        ps.setString(7, q.getAlt_correta());
        ps.setInt(8, q.getIdquiz());
        //5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
        e.printStackTrace();
    }
    
  }
}
