/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Aplikasi;
import tubespbo.ViewPackage.*;

/**
 *
 * @author user
 */
public class Controller implements ActionListener {

    Aplikasi apl = new Aplikasi();
    ViewHome v1;
    ViewData v6;
    PanelSubMenu v2;
    PanelSubMenu1 v21;
    PanelSubMenu2 v22;
    PanelSubMenu3 v23;
    insertMhs v3;
    insertDosen v31;
    insertKelompok v32;
    insertTugas v33;
    DeleteMhs v41;
    DeleteDosen v42;
    DeleteKlpk v43;
    DeleteTugas v44;
    inputMhs v51;
    inputDsn v52;
    inputKel v53;
    inputTugas v54;

    public Controller() {
        v1 = new ViewHome();
        v1.getBtnMhs().addActionListener(this);
        v1.getBtnDsn().addActionListener(this);
        v1.getBtnKlpk().addActionListener(this);
        v1.getBtnTgs().addActionListener(this);
        v1.getExit().addActionListener(this);

        v2 = new PanelSubMenu();
        v2.getBtnCreate().addActionListener(this);
        v2.getBtnDel().addActionListener(this);
        v2.getBtnIns().addActionListener(this);
        v2.getBtnView().addActionListener(this);
        v2.getHome().addActionListener(this);

        v21 = new PanelSubMenu1();
        v21.getBtnCreate().addActionListener(this);
        v21.getBtnDel().addActionListener(this);
        v21.getBtnIns().addActionListener(this);
        v21.getBtnView().addActionListener(this);
        v21.getHome().addActionListener(this);

        v22 = new PanelSubMenu2();
        v22.getBtnCreate().addActionListener(this);
        v22.getBtnDel().addActionListener(this);
        v22.getBtnIns().addActionListener(this);
        v22.getBtnView().addActionListener(this);
        v22.getHome().addActionListener(this);

        v23 = new PanelSubMenu3();
        v23.getBtnCreate().addActionListener(this);
        v23.getBtnDel().addActionListener(this);
        v23.getBtnIns().addActionListener(this);
        v23.getBtnView().addActionListener(this);
        v23.getHome().addActionListener(this);

        v3 = new insertMhs();
        v3.getjButton1().addActionListener(this);
        v3.getBtnBack().addActionListener(this);

        v31 = new insertDosen();
        v31.getjButton1().addActionListener(this);
        v31.getBtnBack().addActionListener(this);

        v32 = new insertKelompok();
        v32.getjButton1().addActionListener(this);
        v32.getBtnBack().addActionListener(this);

        v33 = new insertTugas();
        v33.getjButton1().addActionListener(this);
        v33.getBtnBack().addActionListener(this);

        v41 = new DeleteMhs();
        v41.getjButton1().addActionListener(this);
        v41.getBtnBack().addActionListener(this);

        v42 = new DeleteDosen();
        v42.getjButton1().addActionListener(this);
        v42.getBtnBack().addActionListener(this);

        v43 = new DeleteKlpk();
        v43.getjButton1().addActionListener(this);
        v43.getBtnBack().addActionListener(this);

        v44 = new DeleteTugas();
        v44.getjButton1().addActionListener(this);
        v44.getBtnBack().addActionListener(this);

        v51 = new inputMhs();
        v51.getjButton1().addActionListener(this);
        v51.getBtnBack().addActionListener(this);

        v52 = new inputDsn();
        v52.getjButton1().addActionListener(this);
        v52.getBtnBack().addActionListener(this);

        v53 = new inputKel();
        v53.getjButton1().addActionListener(this);
        v53.getBtnBack().addActionListener(this);

        v54 = new inputTugas();
        v54.getjButton1().addActionListener(this);
        v54.getBtnBack().addActionListener(this);

        v1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a.equals(v1.getBtnMhs())) {
            v2.setVisible(true);
            v1.setVisible(false);
        }
        if (a.equals(v1.getBtnDsn())) {
            v21.setVisible(true);
            v1.setVisible(false);
        }
        if (a.equals(v1.getBtnKlpk())) {
            v22.setVisible(true);
            v1.setVisible(false);
        }
        if (a.equals(v1.getBtnTgs())) {
            v23.setVisible(true);
            v1.setVisible(false);
        }
        //mhs
        if (a.equals(v2.getBtnCreate())) {
            v3.setVisible(true);
            v2.setVisible(false);
        }
        if (a.equals(v2.getBtnDel())) {
            v41.setVisible(true);
            v2.setVisible(false);
        }
        if (a.equals(v2.getBtnView())) {
            //v2.setVisible(false);
            try {

                apl.viewMhs(v6);
                v6.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v2.getBtnIns())) {
            v51.setVisible(true);
            v2.setVisible(false);
        }
        //back btn
        if (a.equals(v2.getHome())) {
            v1.setVisible(true);
            v2.setVisible(false);
        }
        //dosen
        if (a.equals(v21.getBtnCreate())) {
            v31.setVisible(true);
            v21.setVisible(false);
        }
        if (a.equals(v21.getBtnDel())) {
            v42.setVisible(true);
            v21.setVisible(false);
        }
        if (a.equals(v21.getBtnView())) {
            //v21.setVisible(false);
            try {

                apl.viewMhs(v6);
                v6.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v21.getBtnIns())) {
            v52.setVisible(true);
            v21.setVisible(false);
        }
        //back btn
        if (a.equals(v21.getHome())) {
            v1.setVisible(true);
            v21.setVisible(false);
        }
        //kelompok
        if (a.equals(v22.getBtnCreate())) {
            v32.setVisible(true);
            v22.setVisible(false);
        }
        if (a.equals(v22.getBtnDel())) {
            v43.setVisible(true);
            v22.setVisible(false);
        }
        if (a.equals(v22.getBtnView())) {
            //v22.setVisible(false);
            try {

                apl.viewMhs(v6);
                v6.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v22.getBtnIns())) {
            v53.setVisible(true);
            v22.setVisible(false);
        }
        //back btn
        if (a.equals(v22.getHome())) {
            v1.setVisible(true);
            v22.setVisible(false);
        }
        //tugas
        if (a.equals(v23.getBtnCreate())) {
            v33.setVisible(true);
            v22.setVisible(false);
        }
        if (a.equals(v23.getBtnDel())) {
            v44.setVisible(true);
            v22.setVisible(false);
        }
        if (a.equals(v23.getBtnView())) {
            //v22.setVisible(false);
            try {

                apl.viewMhs(v6);
                v6.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v23.getBtnIns())) {
            v54.setVisible(true);
            v22.setVisible(false);
        }
        //back btn
        if (a.equals(v23.getHome())) {
            v1.setVisible(true);
            v23.setVisible(false);
        }
        //create
        if (a.equals(v3.getjButton1())) {
            try {
                apl.menuMhsCreate(v3.getTextFieldNama(), v3.getjComboBox1().getSelectedItem().toString(), Long.parseLong(v3.getTextFieldNim()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v31.getjButton1())) {
            try {
                apl.menuDosenCreate(v31.getTfNama().getText(), Long.parseLong(v31.getTfNip().getText()), v31.getjComboBox1().getSelectedItem().toString(), v31.getTfKode().getText());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v32.getjButton1())) {
            try {
                apl.menuKelompokCreate(v32.getTfNama().getText(), v32.getTfTopik().getText(), Integer.parseInt(v32.getJumlah().getText()), Long.parseLong(v32.getTfNip().getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v33.getjButton1())) {
            try {
                apl.menuTugasCreate(v33.getTfJudul().getText(), v33.getTfTopik().getText(), Long.parseLong(v33.getTfNim().getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //delete
        if (a.equals(v41.getjButton1())) {
            try {
                apl.menuMhsDelete(Long.parseLong(v41.getTfNim().getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v42.getjButton1())) {
            try {
                apl.menuDosenDelete(Long.parseLong(v42.getTfNip().getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v43.getjButton1())) {
            try {
                apl.menuKelompokDelete(v43.getTfNama().getText());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v44.getjButton1())) {
            try {
                apl.menuTugasDelete(v44.getTfNim().getText());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //input
        if (a.equals(v51.getjButton1())) {
            try {
                apl.daftarMhsKelompok(v51.getTfNama().getText(), Long.parseLong(v51.getTfNim().getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v52.getjButton1())) {
            try {
                apl.daftarDosenTugas(v52.getTfJudul().getText(), Long.parseLong(v52.getTfNip().getText()), Integer.parseInt(v52.getjComboBox1().getSelectedItem().toString()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v53.getjButton1())) {
            try {
                apl.daftarKelompokDosen(v53.getTfNama().getText(), Long.parseLong(v53.getTfNip().getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v54.getjButton1())) {
            try {
                apl.daftarTugasMhs(Long.parseLong(v54.getTfNim().getText()), v54.getTfJudul().getText());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (a.equals(v1.getExit())) {
            System.out.println("asdasdasdasd");
            System.exit(1);
        }
        if (a.equals(v3.getBtnBack())) {
            v2.setVisible(true);
            v3.setVisible(false);
        }
        if (a.equals(v31.getBtnBack())) {
            v21.setVisible(true);
            v31.setVisible(false);
        }
        if (a.equals(v32.getBtnBack())) {
            v22.setVisible(true);
            v32.setVisible(false);
        }
        if (a.equals(v33.getBtnBack())) {
            v23.setVisible(true);
            v33.setVisible(false);
        }
        //-------------------
        if (a.equals(v41.getBtnBack())) {
            v2.setVisible(true);
            v41.setVisible(false);
        }
        if (a.equals(v42.getBtnBack())) {
            v21.setVisible(true);
            v42.setVisible(false);
        }
        if (a.equals(v43.getBtnBack())) {
            v22.setVisible(true);
            v43.setVisible(false);
        }
        if (a.equals(v44.getBtnBack())) {
            v23.setVisible(true);
            v44.setVisible(false);
        }
        //-----------------------
        if (a.equals(v51.getBtnBack())) {
            v2.setVisible(true);
            v51.setVisible(false);
        }
        if (a.equals(v52.getBtnBack())) {
            v21.setVisible(true);
            v52.setVisible(false);
        }
        if (a.equals(v53.getBtnBack())) {
            v22.setVisible(true);
            v53.setVisible(false);
        }
        if (a.equals(v54.getBtnBack())) {
            v23.setVisible(true);
            v54.setVisible(false);
        }
        //--------
        if (a.equals(v6.getBtnBack())) {
            v6.setVisible(false);
        }
    }

}
