/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noel.jogo_bioquest;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class principal {
 public static void main(String[] args) {
 String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
 int op;
 do{
 op = Integer.parseInt(JOptionPane.showInputDialog(menu));
 switch (op){
 case 1:
break;
 case 2:
 break;
 case 3:
 break;
 case 4:
 break;
 case 0:
 break;
 default:
    JOptionPane.showMessageDialog(null, "Opção inválida");
 }
 }while (op != 0);
 }
}