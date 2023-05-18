/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.senac.e169.complexidade;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author igor
 */
public class Complexidade {

    public static void main(String[] args) {
        FlatMacLightLaf.setup();

        Interface tela = new Interface();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
