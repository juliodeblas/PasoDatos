/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasodatos;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario DAM 2
 */
public class Ventana extends JFrame implements ActionListener {

    private PanelUno panelUno;
    private PanelDos panelDos;
    private JMenuBar barra;
    private JMenu menu;
    private JMenuItem itemUno, itemDos;
    private Container container;
    private CardLayout cardLayout;
    private ArrayList listaDatos;

    public void initGUI() {
        instancias();
        configurarMenu();
        configurarContainer();
        acciones();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void instancias() {
        cardLayout = new CardLayout();
        panelUno = new PanelUno(panelDos);
        panelDos = new PanelDos();
        barra = new JMenuBar();
        menu = new JMenu();
        itemUno = new JMenuItem("Agregar");
        itemDos = new JMenuItem("Listar");
        container = this.getContentPane();
        listaDatos = new ArrayList();
    }

    private void configurarMenu() {
        barra.add(menu);
        menu.add(itemUno);
        menu.add(itemDos);
        this.setJMenuBar(barra);
    }

    private void configurarContainer() {
        container.setLayout(cardLayout);
        container.add(panelUno, "panel1");
        container.add(panelDos, "panel2");
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == itemUno) {
            cardLayout.show(container, "panel1");
        } else if (arg0.getSource() == itemDos) {
            cardLayout.show(container, "panel2");
        }
    }

    private void acciones() {
        itemUno.addActionListener(this);
        itemDos.addActionListener(this);
    }

    public ArrayList getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(ArrayList listaDatos) {
        this.listaDatos = listaDatos;
    }

    

}
