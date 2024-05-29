/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bioquest.bioquest_pi.telas;

import com.bioquest.bioquest_pi.bd.UsuarioDAO;
import com.bioquest.bioquest_pi.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pedro
 */
public class novoModeloTableModel extends AbstractTableModel {
    private final List<Usuario> users;
    private final String[] columnNames = {"Nome", "Email", "Pontuacao"};

    public novoModeloTableModel(List<Usuario> users) {
        this.users = users;
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario user = users.get(rowIndex);
        switch (columnIndex) {
            case 0: return user.getNome();
            case 1: return user.getEmail();
            case 2: return user.getPontuacao();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

