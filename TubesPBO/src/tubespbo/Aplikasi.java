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
        for (int i=0;i<50;i++){
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
        for (int i=0;i<50;i++){
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
    
    public void menuCreate(int pil){
        switch (pil){
            case 1:
                Mahasiswa m = new Mahasiswa("s","a",1);
        }
    }
    public void menuDelete(int pil){
    
    }
    public void menuDaftar(int pil){
    
    }
}
