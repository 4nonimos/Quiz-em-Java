/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.bd;

import com.bioquest.bioquest_pi.modelo.Relatorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pedro
 */
public class RelatorioDAO {
    //jdbc: java database connectivity
    public boolean existe(Relatorio r) throws Exception{
        //1. especificar o comando sql (SELECT)
        var sql = "SELECT * FROM relatorio_db WHERE idCadastro = ?";
        //2. estabelecer uma conexão com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. substituir eventuais placeholders
        ps.setInt(1, r.getIdCadastro());
        //5. executar o comando
        ResultSet rs = ps.executeQuery();
        //6. lidar com o resultado
        boolean achou = rs.next();
        //7. fechar conexão
        rs.close();
        ps.close();
        conexao.close();
        //8. responser se achou ou não
        return achou;
    }
         public void inserir (Relatorio r){
    //1: Definir o comando SQL
    String sql = "INSERT INTO relatorio_db(idCadastro,alt_selecionada) VALUES (?, ?)";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obterConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setInt(1, r.getIdCadastro());
        ps.setString(2, r.getAlt_selecionada());
        //5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
        e.printStackTrace();
    }
         }
    
}
