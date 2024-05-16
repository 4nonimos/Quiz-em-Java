/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.bd;

import com.bioquest.bioquest_pi.modelo.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pedro
 */
public class SalaDAO {
    public boolean existe(Sala s) throws Exception{
        var sql = "SELECT * FROM sala WHERE idsala = ?";
        Connection conexao = new ConnectionFactory().obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, s.getIdsala());
        ResultSet rs = ps.executeQuery();
        boolean achou = rs.next();
        rs.close();
        ps.close();
        conexao.close();
        return achou;
                
    }
    public String salaQuiz(Sala s) throws Exception{
        var sql = "SELECT idquz FROM sala WHERE idsala = ?";
        Connection conexao = new ConnectionFactory().obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, s.getIdsala());
        ResultSet rs = ps.executeQuery();
        int idquiz = 0;
        if (rs.next()){
            idquiz = rs.getInt("idquiz");
        }
        rs.close();
        ps.close();
        conexao.close();
        return String.valueOf(idquiz);
    }
}
