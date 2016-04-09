/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;
import tubespbo.ViewPackage.PanelSubMenu;
import tubespbo.ViewPackage.PanelSubMenu1;
import tubespbo.ViewPackage.PanelSubMenu2;
import tubespbo.ViewPackage.PanelSubMenu3;
import tubespbo.ViewPackage.ViewHome;

/**
 *
 * @author user
 */
public class Controller implements ActionListener{
    Aplikasi apl = new Aplikasi();
    ViewHome v1;
    PanelSubMenu v2;
    PanelSubMenu1 v21;
    PanelSubMenu2 v22;
    PanelSubMenu3 v23;

    public Controller() {
        v1 = new ViewHome();
        v1.getBtnMhs().addActionListener(this);
        v1.getBtnDsn().addActionListener(this);
        v1.getBtnKlpk().addActionListener(this);
        v1.getBtnTgs().addActionListener(this);
        
        v2 = new PanelSubMenu();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a.equals(v1.getBtnMhs())){
            v2.setVisible(true);
        }
        if (a.equals(v1.getBtnDsn())){
            v21.setVisible(true);
        }
        if (a.equals(v1.getBtnKlpk())){
            v22.setVisible(true);
        }
        if (a.equals(v1.getBtnTgs())){
            v23.setVisible(true);
        }
    }
    
}
