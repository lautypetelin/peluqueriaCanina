package com.lautaropetelin.peluqueriacanina;

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;
import com.lautaropetelin.peluqueriacanina.igu.Principal;

public class PeluqueriaCanina {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "El Look And Feel no ha sido instalado o no es compatible con la versión de java que estás utilizando.", "Error con Look And Feel", JOptionPane.ERROR_MESSAGE);
        }
        
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        princ.setResizable(false);
    }
}