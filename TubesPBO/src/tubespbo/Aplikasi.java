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

public class Aplikasi {
    private ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    private ArrayList<KelompokTA> daftarKelompok = new ArrayList<KelompokTA>();
    private ArrayList<TugasAkhir> daftarTugasAkhir = new ArrayList<TugasAkhir>();
    
    public void addMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
    }
    public void addDosen(Dosen d){
        daftarDosen.add(d);
    }
    /*public Mahasiswa getMahasiswa(long nim){
        for (int i=0;i<50;i++){
            if (daftarMahasiswa.get(i).getNim() == nim){
                return daftarMahasiswa.get(i);
            }
        }
    }*/
    public void deleteMahasiswa(long nim){
        for (int i=0;i<daftarMahasiswa.size();i++){
            if (daftarMahasiswa.get(i).getNim() == nim){
                daftarMahasiswa.remove(i);
            }
        }
    }/*
    public Dosen getDaftarDosen(long nip) {
        for (int i=0;i<50;i++){
            if (daftarDosen.get(i).getNip() == nip){
                return daftarDosen.get(i);
            }
        }
    }*/
     public void deleteDosen(long nip){
        for (int i=0;i<daftarDosen.size();i++){
            if (daftarDosen.get(i).getNip() == nip){
                daftarDosen.remove(i);
            }
        }
    }

    /*public KelompokTA getKelompok(String topik) {
        for (int i=0; i<20;i++){
            if(daftarKelompok.get(i).getTopik() == topik)
                return daftarKelompok.get(i);
        }
    }*/
    public void deleteKelompok(String nama){
        for (int i=0;i<daftarKelompok.size();i++){
            if (daftarKelompok.get(i).getNamaKelompok().equals(nama)){
                daftarKelompok.remove(i);
            }
        }
    }

    public void setKelompok(KelompokTA kelompok) {
        daftarKelompok.add(kelompok);
    }

    /*public TugasAkhir getTugas(String judul) {
        for (int i=0;i<10;i++){
            if(daftarTugasAkhir.get(i).getJudul().equals(judul)){   
                return daftarTugasAkhir.get(i);
            }
        }
    }*/

    public void setTugas(TugasAkhir tugas) {
        daftarTugasAkhir.add(tugas);
    }
    public void deleteTugasAkhir(String judul){
        for (int i=0;i<daftarTugasAkhir.size();i++){
            if (daftarTugasAkhir.get(i).getJudul().equals(judul)){
                daftarTugasAkhir.remove(i);
            }
        }
    }
    public void menuMhsCreate(String nama, String jenis, long nim){
        Mahasiswa m = new Mahasiswa("s","a",1);
        addMahasiswa(m);    
    }
    public void menuMhsDelete(long nim){
        deleteMahasiswa(nim);
    }
    public void menuDosenCreate(String nama, String jenis, long nip){
        Dosen d = new Dosen("a","d",123,"s");
        addDosen(d);
    }
    public void menuDosenDelete(long nip){
        deleteDosen(nip);
    }
    public void menuKelompokCreate(String nama, String topik, int num){
        KelompokTA kl = new KelompokTA("nama","topik",3);
    }
    public void menuKelompokDelete(String nama){
        deleteTugasAkhir(nama);
    }
    public void menuTugasCreate(String judul, String kk){
        TugasAkhir ta = new TugasAkhir("asd","wew");
        setTugas(ta);
    }
    public void menuTugasDelete(String judul){
        deleteTugasAkhir(judul);
    }
    public void mainMenu(int pil){
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
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukkan pilihan : ");
        int pilihan = inputan.nextInt();
        switch (pilihan){
            case 1:
                menuMhsCreate("nama","jenis",1123123); 
            case 2:
                menuDosenCreate("nama","jeni",241241);
            case 3:
                menuKelompokCreate("nama kel","topik",2);
            case 4:
                menuTugasCreate("judul","icm");
            case 5:
                menuMhsDelete(1223213);
            case 6:
                menuDosenDelete(123123);
            case 7:
                menuKelompokDelete("nama kelompok");
            case 8:
                menuTugasDelete("judul");
        }
    }
}
