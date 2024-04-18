/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noel.jogo_bioquest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class inserir{
public void inserir (){
 //1: Definir o comando SQL
    String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
 //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao()){
 //3: Pré compila o comando
    PreparedStatement ps = c.prepareStatement(sql);
 //4: Preenche os dados faltantes
    ps.setString(1, nome);
    ps.setString(2, fone);
    ps.setString(3, email);
 //5: Executa o comando
     ps.execute();
 }
 catch (Exception e){
 e.printStackTrace();
 }
 }
    case 1:{
 String nome = JOptionPane.showInputDialog("Nome?");
 String fone = JOptionPane.showInputDialog("Fone?");
 String email = JOptionPane.showInputDialog("Email?");
 pessoa p = new pessoa ();
 p.setNome(nome);
 p.setFone(fone);
 p.setEmail(email);
 p.inserir();
   break;
}