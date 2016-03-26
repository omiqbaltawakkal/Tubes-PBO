/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Aplikasi {

    private ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    private ArrayList<KelompokTA> daftarKelompok = new ArrayList<KelompokTA>();
    private ArrayList<TugasAkhir> daftarTugasAkhir = new ArrayList<TugasAkhir>();

    public void addMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void addDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public Mahasiswa getMahasiswa(long nim){
        Mahasiswa satu = null;
        for (int i=0;i<50;i++){
            if (daftarMahasiswa.get(i).getNim() == nim){
                satu = daftarMahasiswa.get(i);
            }
        }
        return satu;
    }
    public void deleteMahasiswa(long nim) {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNim() == nim) {
                daftarMahasiswa.remove(i);
            }
        }
    }
    public Dosen getDaftarDosen(long nip) {
        Dosen dua = null;
        for (int i=0;i<50;i++){
            if (daftarDosen.get(i).getNip() == nip){
                dua = daftarDosen.get(i);
            }
        }
        return dua;
    }
    public void deleteDosen(long nip) {
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getNip() == nip) {
                daftarDosen.remove(i);
            }
        }
    }

    public KelompokTA getKelompok(String topik) {
        KelompokTA tiga = null;
        for (int i=0; i<20;i++){
            if(daftarKelompok.get(i).getTopik() == topik)
                tiga = daftarKelompok.get(i);
        }
        return tiga;
    }
    public void deleteKelompok(String nama) {
        for (int i = 0; i < daftarKelompok.size(); i++) {
            if (daftarKelompok.get(i).getNamaKelompok().equals(nama)) {
                daftarKelompok.remove(i);
            }
        }
    }

    public void setKelompok(KelompokTA kelompok) {
        daftarKelompok.add(kelompok);
    }

    public TugasAkhir getTugas(String judul) {
        TugasAkhir empat = null;
        for (int i=0;i<10;i++){
            if(daftarTugasAkhir.get(i).getJudul().equals(judul)){   
                empat = daftarTugasAkhir.get(i);
            }
        }
        return empat;
    }
    public void setTugas(TugasAkhir tugas) {
        daftarTugasAkhir.add(tugas);
    }

    public void deleteTugasAkhir(String judul) {
        for (int i = 0; i < daftarTugasAkhir.size(); i++) {
            if (daftarTugasAkhir.get(i).getJudul().equals(judul)) {
                daftarTugasAkhir.remove(i);
            }
        }
    }

    public void menuMhsCreate(String nama, String jenis, long nim) {
        Mahasiswa m = new Mahasiswa("s", "a", 1);
        addMahasiswa(m);
    }

    public void menuMhsDelete(long nim) {
        deleteMahasiswa(nim);
    }

    public void menuDosenCreate(String nama, String jenis, long nip, String kode) {
        Dosen d = new Dosen("a", "d", 123,"s");
        addDosen(d);
    }

    public void menuDosenDelete(long nip) {
        deleteDosen(nip);
    }

    public void menuKelompokCreate(String nama, String topik, int num) {
        KelompokTA kl = new KelompokTA("nama", "topik", 3);
    }

    public void menuKelompokDelete(String nama) {
        deleteTugasAkhir(nama);
    }

    public void menuTugasCreate(String judul, String kk) {
        TugasAkhir ta = new TugasAkhir("asd", "wew");
        setTugas(ta);
    }

    public void menuTugasDelete(String judul) {
        deleteTugasAkhir(judul);
    }

    public void mainMenu() throws IOException {
        Scanner inputan = new Scanner(System.in);
        int pilihan = inputan.nextInt();
        do {
            System.out.println("Main Menu Sisfo TA");
            System.out.println("1. Daftar Data Mahasiswa");
            System.out.println("2. Daftar Data Dosen");
            System.out.println("3. Daftar Data Kelompok TA");
            System.out.println("4. Daftar Data Tugas Akhir");
            System.out.println();
            System.out.println("5. Delete Data Mahasiswa");
            System.out.println("6. Delete Data Dosen");
            System.out.println("7. Delete Data Kelompok TA");
            System.out.println("8. Delete Data Tugas AKhir");
            System.out.print("Masukkan Pilihan Menu: ");
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nm = inputan.next();
                    System.out.print("Jenis Kelamin : ");
                    String jk = inputan.next();
                    System.out.print("NIM : ");
                    long nim = inputan.nextLong();
                    menuMhsCreate(nm,jk,nim);
                case 2:
                    System.out.print("Nama Dosen : ");
                    String nm1 = inputan.next();
                    System.out.print("Jenis Kelamin : ");
                    String jk1 = inputan.next();
                    System.out.print("NIP : ");
                    long nip = inputan.nextLong();
                    System.out.print("Kode Dosen : ");
                    String kd = inputan.next();
                    menuDosenCreate(nm1,jk1,nip,kd);
                case 3:
                    System.out.print("Nama Kelompok : ");
                    String nk = inputan.next();
                    System.out.print("Topik Tugas Akhir : ");
                    String tp = inputan.next();
                    System.out.print("Jumlah Max Anggota : ");
                    int jml = inputan.nextInt();
                    menuKelompokCreate(nk,tp,jml);
                case 4:
                    System.out.print("Judul Tugas Akhir : ");
                    String jdl = inputan.next();
                    System.out.print("Jenis Kelompok Keahlian(KK) : ");
                    String kk = inputan.next();
                    menuTugasCreate(jdl,kk);
                case 5:
                    System.out.print("NIM Mahasiswa : ");
                    long nim2 = inputan.nextLong();
                    menuMhsDelete(nim2);
                case 6:
                    System.out.print("NIP Dosen : ");
                    long nip2 = inputan.nextLong();
                    menuDosenDelete(nip2);
                case 7:
                    System.out.print("Nama Kelompok : ");
                    String kel = inputan.next();
                    menuKelompokDelete(kel);
                case 8:
                    System.out.print("Judul Tugas Akhir : ");
                    String jdl2 = inputan.next();
                    menuTugasDelete(jdl2);
                default: 
                    System.out.println("Pilih 1-8 untuk Pilihan Menu atau 0 untuk Keluar");
                    Runtime.getRuntime().exec("cls");
            }
        } while (pilihan != 0);
    }
}
