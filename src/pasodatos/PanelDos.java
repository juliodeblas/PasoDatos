/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasodatos;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Usuario DAM 2
 */
public class PanelDos extends JPanel {

    DefaultListModel modelo;
    JList list;
    Ventana v;

    public PanelDos() {
        this.v = v;
        initGUI();
        configurarPanel();
    }

    private void initGUI() {
        instancias();
    }

    private void instancias() {
        modelo = new DefaultListModel();
        list = new JList(modelo);
    }

    private void configurarPanel() {
        this.setLayout(new BorderLayout());
        this.add(list);
    }

    public DefaultListModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultListModel modelo) {
        this.modelo = modelo;
    }

}
