/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.bd;

import com.bioquest.bioquest_pi.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author pedro
 */
public class UsuarioCAD {
     public void inserir (Usuario u){
    //1: Definir o comando SQL
    String sql = "INSERT INTO cadastro_db(email, senha, idade, nome) VALUES (?, ?, ?, ?)";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obterConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setString(1, u.getEmail());
        ps.setString(2, u.getSenha());
        ps.setString(3, u.getIdade());
        ps.setString(4, u.getNome());
        //5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
        e.printStackTrace();
    }
    
  }
}
