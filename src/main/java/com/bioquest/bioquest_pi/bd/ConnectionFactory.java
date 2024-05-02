/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pedro
 */
public class ConnectionFactory {
    private String host = "mysql-b24a116-teste-noel.b.aivencloud.com";
    private String port = "13177";
    private String db = "defaultdb";
    private String user = "avnadmin";
    private String password = "AVNS_ah3iydHKSuJgkR3E5zB";
    
    
    public Connection obterConexao() throws Exception{
        //https://www.google.com:80/search
        //jdbc:mysql://host:port/db
        var stringConexao = String.format(
                "jdbc:mysql://%s:%s/%s", host, port, db);
        // clausula catch or declare (imposta pelo compilador)
        Connection conexao = DriverManager.getConnection(stringConexao, user, password);
        return conexao;
            
    }
}
