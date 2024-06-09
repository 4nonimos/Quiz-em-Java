/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bioquest.bioquest_pi;

import com.bioquest.bioquest_pi.telas.LoginTela;

public class BioQuest_PI {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }
}