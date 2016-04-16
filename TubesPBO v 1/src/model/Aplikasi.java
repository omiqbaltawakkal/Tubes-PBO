/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
import database.Database;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tubespbo.ViewPackage.ViewData;

public class Aplikasi {

    private ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    private Database data;

    public Aplikasi() throws SQLException {
        data = new Database();
        data.connect();
    }

    public void addMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void addDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void menuMhsCreate(String nama, String jenis, long nim) throws FileNotFoundException, IOException, SQLException {
        Mahasiswa m = new Mahasiswa(nama, jenis, nim);
        addMahasiswa(m);
        String query = "insert into Mahasiswa values ('" + nama + "','" + nim + "','" + jenis + "')";
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data berhasil di Input");
    }

    public void menuMhsDelete(long nim) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        deleteMahasiswa(nim);
        String query = "delete from Mahasiswa where nim = " + nim;
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data telah di hapus");
    }

    public Mahasiswa getMahasiswa(long nim) throws FileNotFoundException, IOException, ClassNotFoundException {
        Mahasiswa satu = null;
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarMahasiswa.get(i).getNim() == nim) {
                satu = daftarMahasiswa.get(i);
            }
        }
        return satu;
    }

    public void deleteMahasiswa(long nim) throws FileNotFoundException, IOException, ClassNotFoundException {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNim() == nim) {
                daftarMahasiswa.remove(i);
            }
        }
    }

    public void menuDosenCreate(String nama, long nip, String jenis, String kode) throws FileNotFoundException, IOException, SQLException {
        Dosen d = new Dosen(nama, jenis, nip, kode);
        addDosen(d);
        String query = "insert into Dosen values ('" + nama + "','" + jenis + "'," + nip + ",'" + kode + "')";
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data berhasil di Input");
    }

    public void menuDosenDelete(long nip) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        deleteDosen(nip);
        String query = "delete from Dosen where nip=" + nip;
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data telah di hapus");
    }

    public Dosen getDaftarDosen(long nip) throws FileNotFoundException, IOException, ClassNotFoundException {
        Dosen dua = null;
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getNip() == nip) {
                dua = daftarDosen.get(i);
            }
        }
        return dua;
    }

    public void deleteDosen(long nip) throws FileNotFoundException, IOException, ClassNotFoundException {
        for (int j = 0; j < daftarDosen.size(); j++) {
            if (daftarDosen.get(j).getNip() == nip) {
                daftarDosen.remove(j);
            }
        }
    }

    public void menuKelompokCreate(String nama, String topik, int num, long nip) throws FileNotFoundException, IOException, ClassNotFoundException {
        KelompokTA kl = new KelompokTA(nama, topik, num);
        getDaftarDosen(nip);
        String query = "insert into Kelompok values ('" + nama + "'," + topik + ",'" + num + "')";
        JOptionPane.showMessageDialog(null, "Data berhasil di Input");
    }

    public void menuKelompokDelete(String nama) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        deleteTugasAkhir(nama);
        String query = "delete from Kelompok where nama=" + nama;
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
    }

    public KelompokTA getKelompok(String nama) throws FileNotFoundException, IOException, ClassNotFoundException {
        KelompokTA tiga = null;
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getKelompokByIndeks(i).getNamaKelompok().equals(nama)) {
                tiga = daftarDosen.get(i).getKelompokByIndeks(i);
            }
        }
        return tiga;
    }

    public void deleteKelompok(String nama) throws FileNotFoundException, IOException, ClassNotFoundException {
        for (int i = 0; i < daftarDosen.size(); i++) {
            for (int j = 0; j < daftarDosen.get(i).getJumlah(); j++) {
                if (daftarDosen.get(i).getKelompokByIndeks(i).getNamaKelompok().equals(nama)) {
                    daftarDosen.get(i).deleteKelompokTA(i);
                }
            }
        }
    }

    public void menuTugasCreate(String judul, String kk, long nim) throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
        TugasAkhir ta = new TugasAkhir(judul, kk);
        getMahasiswa(nim).setTugasakhir(ta);
        String query = "insert into TugasAkhir values ('" + judul + "','" + kk + "')";
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data berhasil di Input");
    }

    public void menuTugasDelete(String judul) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        deleteTugasAkhir(judul);
        String query = "delete from Tugas where judul= " + judul;
        data.query(query);
        JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
    }

    public TugasAkhir getTugas(String judul) throws FileNotFoundException, IOException, ClassNotFoundException {
        TugasAkhir empat = null;
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getTugasAkhir().getJudul().equals(judul)) {
                empat = daftarMahasiswa.get(i).getTugasAkhir();
            }
        }
        return empat;
    }

    public void deleteTugasAkhir(String judul) throws FileNotFoundException, IOException, ClassNotFoundException {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getTugasAkhir().getJudul().equals(judul)) {
                daftarMahasiswa.get(i).removeTugas();
            }
        }
    }

    public void daftarKelompokDosen(String nama, long nip) throws IOException, FileNotFoundException, ClassNotFoundException {
        getDaftarDosen(nip).addKelompokTA(getDaftarDosen(nip).getKelompokByTopik(nama));
    }

    public void daftarMhsKelompok(String nama, long nim) throws IOException, FileNotFoundException, ClassNotFoundException {
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getKelompokByIndeks(i).getNamaKelompok().equals(nama)) {
                daftarDosen.get(i).getKelompokByIndeks(i).addAnggota(getMahasiswa(nim));
            }
        }
    }

    public void daftarDosenTugas(String judul, long nip, int posisi) throws IOException, FileNotFoundException, ClassNotFoundException {
        getTugas(judul).setPembimbing(getDaftarDosen(nip), posisi);
    }

    public void daftarTugasMhs(long nim, String judul) throws IOException, FileNotFoundException, ClassNotFoundException {
        getMahasiswa(nim).setTugasakhir(getTugas(judul));
    }

    public void viewMhs(ViewData v) {
        try {
            String[] datamhs = {"NIM", "Nama", "Jenis Kelamin", "Judul"};
            DefaultTableModel tblMahasiswa = new DefaultTableModel(datamhs, 0);
            v.getjTable1().setModel(tblMahasiswa);
            ResultSet rs = data.getData("select * from Mahasiswa");
            DefaultTableModel tb = (DefaultTableModel) v.getjTable1().getModel();

            while (rs.next()) {
                tb.addRow(new String[]{rs.getString("NIM"), rs.getString("Nama"), rs.getString("Jenis"), "kosong"});
            }
            v.getjTable1().setModel(tb);
        } catch (SQLException ex) {
            System.out.println("gggggggggggggggggggg");
        }
    }

    public void viewDosen(ViewData v) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        String[] datadosen = {"NIP", "Nama", "Jenis Kelamin", "Kode Dosen"};
        DefaultTableModel tblDosen = new DefaultTableModel(datadosen, 0);
        v.getjTable1().setModel(tblDosen);
        ResultSet rs = data.getData("select * from Dosen");
        DefaultTableModel tb = (DefaultTableModel) v.getjTable1().getModel();
        v.getjTable1().removeAll();

        while (rs.next()) {
            tb.addRow(new String[]{rs.getString("NIP"), rs.getString("Nama"), rs.getString("Jenis Kelamin"), rs.getString("Kode Dosen")});
        }
        v.getjTable1().setModel(tb);
    }

    public void viewKelompok(ViewData v) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        String[] datakelompok = {"Nama Kelompok", "Nama Anggota", "Jenis Kelamin"};
        DefaultTableModel tblKelompok = new DefaultTableModel(datakelompok, 0);
        v.getjTable1().setModel(tblKelompok);
        ResultSet rs = data.getData("select * from KelompokTA");
        DefaultTableModel tb = (DefaultTableModel) v.getjTable1().getModel();
        v.getjTable1().removeAll();

        while (rs.next()) {
            tb.addRow(new String[]{rs.getString("Nama Kelompok"), rs.getString("Nama Anggota"), rs.getString("Jenis Kelamin")});
        }
        v.getjTable1().setModel(tb);
    }

    public void viewTugasAkhir(ViewData v) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        String[] datatugas = {"Judul", "Topik", "Nama Mahasiswa"};
        DefaultTableModel tblTugas = new DefaultTableModel(datatugas, 0);
        v.getjTable1().setModel(tblTugas);
        ResultSet rs = data.getData("select * from TugasAkhir");
        DefaultTableModel tb = (DefaultTableModel) v.getjTable1().getModel();
        v.getjTable1().removeAll();

        while (rs.next()) {
            tb.addRow(new String[]{rs.getString("Judul"), rs.getString("Topik"), rs.getString("Nama Mahasiswa")});
        }
        v.getjTable1().setModel(tb);
    }

//    public void mainMenu() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
//        Scanner inputan = new Scanner(System.in);
//        int pilihan;
//        do {
//            System.out.println("Main Menu Sisfo TA");
//            System.out.println();
//            System.out.println("1. Daftar Data Mahasiswa");
//            System.out.println("2. Daftar Data Dosen");
//            System.out.println("3. Daftar Data Kelompok TA");
//            System.out.println("4. Daftar Data Tugas Akhir");
//            System.out.println();
//            System.out.println("5. Delete Data Mahasiswa");
//            System.out.println("6. Delete Data Dosen");
//            System.out.println("7. Delete Data Kelompok TA");
//            System.out.println("8. Delete Data Tugas AKhir");
//            System.out.println();
//            System.out.println("9. Daftar Mahasiswa ke Kelompok TA");
//            System.out.println("10. Daftar Kelompok TA ke Dosen");
//            System.out.println("11. Set Dosen Pembimbing Tugas Akhir");
//            System.out.println("12. Daftar Tugas Akhir untuk Mahasiswa");
//            System.out.println();
//            System.out.println("13. View Data Mahasiswa");
//            System.out.println("14. View Data Dosen");
//            System.out.println("15. View Data Kelompok TA");
//            System.out.println("16. View Data Tugas Akhir");
//            System.out.println();
//            System.out.print("Masukkan Pilihan Menu: ");
//            pilihan = inputan.nextInt();
//            switch (pilihan) {
//                case 1:
//                    String nm = null;
//                    String jk = null;
//                    long nim = 0;
//                    try {
//                        System.out.print("Nama Mahasiswa: ");
//                        nm = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input Nama Anda, ini Kolom Nama !");
//                    }
//                    try {
//                        System.out.print("NIM : ");
//                        nim = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Masukkan NIM Anda !");
//                    }
//                    try {
//                        System.out.print("Jenis Kelamin : ");
//                        jk = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Hanya Pria atau Wanita, tidak boleh yg lain!");
//                    }
//                    menuMhsCreate(nm, jk, nim);
//                    break;
//                case 2:
//                    String nm1 = null;
//                    String jk1 = null;
//                    long nip = 0;
//                    String kd = null;
//                    try {
//                        System.out.print("Nama Dosen : ");
//                        nm1 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input Nama Anda, ini Kolom Nama !");
//                    }
//                    try {
//                        System.out.print("NIP : ");
//                        nip = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input NIP Anda !");
//                    }
//                    try {
//                        System.out.print("Jenis Kelamin : ");
//                        jk1 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Hanya Pria atau Wanita, tidak boleh yg lain!");
//                    }
//                    try {
//                        while (kd == null || kd.length() > 3) {
//                            System.out.print("Kode Dosen (3 Huruf): ");
//                            kd = inputan.next();
//                        }
//                    } catch (InputMismatchException e) {
//                        System.out.println("Hanya 3 Huruf !");
//                    }
//                    menuDosenCreate(nm1, jk1, nip, kd);
//                    break;
//                case 3:
//                    String nk = null;
//                    String tp = null;
//                    int jml = 0;
//                    try {
//                        System.out.print("Nama Kelompok : ");
//                        nk = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input Nama Kelompok Anda !");
//                    }
//                    try {
//                        System.out.println("Topik Tugas Akhir");
//                        System.out.print("(topik berbeda dengan judul) : ");
//                        tp = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Topik Tugas Akhir Anda !");
//                    }
//                    try {
//                        System.out.print("Jumlah Max Anggota : ");
//                        jml = inputan.nextInt();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Angka yang membatasi Jumlah Anggota Kelompok Anda");
//                    }
//                    menuKelompokCreate(nk, tp, jml);
//                    break;
//                case 4:
//                    String jdl = null;
//                    String kk = null;
//                    try {
//                        System.out.print("Judul Tugas Akhir : ");
//                        jdl = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Judul Tugas Anda !");
//                    }
//                    try {
//                        while (kk == null) {
//                            System.out.print("Jenis Kelompok Keahlian(KK) : ");
//                            kk = inputan.next();
//                        }
//                    } catch (InputMismatchException e) {
//                        System.out.println("Hanya 'ICM', 'SIDE', 'TELE' !");
//                    }
//                    menuTugasCreate(jdl, kk);
//                    break;
//                case 5:
//                    long nim2 = 0;
//                    try {
//                        System.out.print("NIM Mahasiswa : ");
//                        nim2 = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input NIM yang ingin di hapus !");
//                    }
//                    menuMhsDelete(nim2);
//                    for (int i = 0; i < daftarDosen.size(); i++) {
//                        if (daftarDosen.get(i).getKelompokByIndeks(i).getAnggotaByIndeks(i).getNim() == nim2) {
//                            daftarDosen.get(i).getKelompokByIndeks(i).removeAnggota(i);
//                        }
//                    }
//                    break;
//                case 6:
//                    long nip2 = 0;
//                    try {
//                        System.out.print("NIP Dosen : ");
//                        nip2 = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input NIP yang ingin di hapus !");
//                    }
//                    menuDosenDelete(nip2);
//                    break;
//                case 7:
//                    String kel = null;
//                    try {
//                        System.out.print("Nama Kelompok : ");
//                        kel = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Nama Kelompok yang ingin di hapus !");
//                    }
//                    menuKelompokDelete(kel);
//                    for (int i = 0; i < daftarDosen.size(); i++) {
//                        if (daftarDosen.get(i).getKelompokByIndeks(i).getNamaKelompok().equals(kel)) {
//                            daftarDosen.get(i).deleteKelompokTA(i);
//                        }
//                    }
//                    break;
//                case 8:
//                    String jdl2 = null;
//                    try {
//                        System.out.print("Judul Tugas Akhir : ");
//                        jdl2 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Input judul yang ingin di hapus !");
//                    }
//                    menuTugasDelete(jdl2);
//                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
//                        if (daftarMahasiswa.get(i).getTugasAkhir().getJudul().equals(jdl2)) {
//                            daftarMahasiswa.get(i).removeTugas();
//                        }
//                    }
//                    break;
//                case 9:
//                    long nim3 = 0;
//                    String nama2 = null;
//                    try {
//                        System.out.print("Masukkan NIM Anda : ");
//                        nim3 = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.println("NIM Anda, berupa angka !");
//                    }
//                    try {
//                        System.out.print("Masukkan Nama Kelompok : ");
//                        nama2 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Nama Kelompok!");
//                    }
//                    daftarMhsKelompok(getKelompok(nama2), nim3);
//                    break;
//                case 10:
//                    long nip3 = 0;
//                    String nama3 = null;
//                    try {
//                        System.out.print("Masukkan NIP Anda : ");
//                        nip3 = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.print("NIP Anda, berupa angka !");
//                    }
//                    try {
//                        System.out.print("Masukkan Nama Kelompok : ");
//                        nama3 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.print("Nama Kelompok!");
//                    }
//                    daftarKelompokDosen(nama3, nip3);
//                    break;
//                case 11:
//                    long nip4 = 0;
//                    String judul2 = null;
//                    int posisi = 0;
//                    try {
//                        System.out.print("Masukkan NIP Anda : ");
//                        nip4 = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.print("NIP Anda, berupa angka !");
//                    }
//                    try {
//                        System.out.print("Masukkan Judul Tugas Akhir : ");
//                        judul2 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Judul Tugas Akhir Mahasiswa bimbingan Anda!");
//                    }
//                    try {
//                        System.out.println("Urutan Dosen Pembimbing");
//                        System.out.print("(1 atau 2) : ");
//                        posisi = inputan.nextInt();
//                    } catch (InputMismatchException e) {
//                        System.out.println("1 atau 2");
//                    }
//                    daftarDosenTugas(judul2, nip4, posisi);
//                    break;
//                case 12:
//                    long nim5 = 0;
//                    String judul3 = null;
//                    try {
//                        System.out.print("Masukkan NIM Anda : ");
//                        nim5 = inputan.nextLong();
//                    } catch (InputMismatchException e) {
//                        System.out.println("NIM Anda, berupa angka !");
//                    }
//                    try {
//                        System.out.print("Masukkan Judul Tugas Akhir : ");
//                        judul3 = inputan.next();
//                    } catch (InputMismatchException e) {
//                        System.out.println("Judul Tugas Akhir Anda!");
//                    }
//                    daftarTugasMhs(nim5, judul3);
//                    break;
//                case 13:
////                    viewMhs();
//                    break;
//                case 14:
//                    viewDosen();
//                    break;
//                case 15:
//                    viewKelompok();
//                    break;
//                case 16:
//                    viewTugasAkhir();
//                    break;
//                default:
//                    System.out.println("Pilih 1-20 untuk Pilihan Menu atau 0 untuk Keluar");
//                    break;
//            }
//        } while (pilihan != 0);
//    }
}
