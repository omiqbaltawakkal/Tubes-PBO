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
    public void menuCreate(int pil){
        switch (pil){
            case 1:
                Mahasiswa m = new Mahasiswa("s","a",1);
                addMahasiswa(m);
            case 2:
                Dosen d = new Dosen("a","d",123,"s");
                addDosen(d);
            case 3: 
                KelompokTA kel = new KelompokTA("joss","side",3);
                setKelompok(kel);
            case 4:
                TugasAkhir ta = new TugasAkhir("asd","wew");
                setTugas(ta);
        }
    }
    public void menuDelete(int pil){
        switch (pil){
            case 1:
                deleteMahasiswa(123123);
            case 2:
                deleteDosen(123123);
            case 3: 
                deleteKelompok("joss");
            case 4:
                deleteTugasAkhir("asd");
    }
    }
    public void menuDaftar(int pil){
    
    }
}
