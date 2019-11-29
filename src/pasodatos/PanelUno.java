/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package pasodatos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Usuario DAM 2
 */
public class PanelUno extends JPanel implements ActionListener{

    JButton boton1;
    PanelDos p2;
    
    public PanelUno(PanelDos p) {
        this.p2 = p;
        initGUI();
        configurarPanel();
        acciones();
    }

    private void initGUI() {
        instancias();
    }

    private void instancias() {
        boton1 = new JButton("Agregar");
    }

    private void configurarPanel() {
        this.add(boton1);
    }

    private void acciones() {
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        p2.getModelo().addElement("dcvfvfv");
             
    }

    
}
