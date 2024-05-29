/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.bd;

import com.bioquest.bioquest_pi.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class UsuarioDAO {
    //jdbc: java database connectivity
    public boolean existe(Usuario u) throws Exception{
        //1. especificar o comando sql (SELECT)
        var sql = "SELECT * FROM cadastro_db WHERE email = ? AND senha = ?";
        //2. estabelecer uma conexão com o banco
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. substituir eventuais placeholders
        ps.setString(1, u.getEmail());
        ps.setString(2, u.getSenha());
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
    public String recebeCargo(Usuario u) throws Exception{
        var sql = "SELECT cargo FROM cadastro_db WHERE email = ?";
        Connection conexao = new ConnectionFactory().obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getEmail());
        ResultSet rs = ps.executeQuery();
        String cargo = null;        
        if (rs.next()){
            cargo = rs.getString("cargo");
        }              
        rs.close();
        ps.close();
        conexao.close();
        return cargo;
        
    }
    

}
