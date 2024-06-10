/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.modelo;

import com.bioquest.bioquest_pi.bd.ConnectionFactory;
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
public class Usuario {
    private int codigo;
    private String email;
    private String senha;
    private String idade;
    private String nome;
    private String cargo;
    private int pontuacao;
    
    public Usuario(String cargo, String email, String nome){
        this.cargo = cargo;
        this.email = email;
        this.nome = nome;
        //this.pontuacao = pontuacao;
    }
    //getter
    public int getCodigo(){
        return codigo;
    }
    //setter
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public List<Usuario> getAllUsers() {
    List<Usuario> users = new ArrayList<>();
    String sql = "SELECT * FROM cadastro_db WHERE cargo = 'ALUNO'";
    try (Connection conexao = new ConnectionFactory().obterConexao();
         PreparedStatement ps = conexao.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Usuario user = new Usuario(nome,email,cargo);
            user.setCodigo(rs.getInt("idCadastro"));
            user.setEmail(rs.getString("email")); // assuming there's an email column
            user.setNome(rs.getString("nome"));   // assuming there's a nome column
            user.setPontuacao(rs.getInt("pontuacao"));     // assuming there's a car column
            // Set other user properties from the result set as needed
            users.add(user);
        }
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception appropriately
    }
    return users;
    }
    
}
