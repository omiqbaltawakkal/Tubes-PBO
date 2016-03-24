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
public class Aplikasi {
    private ArrayList<Dosen> daftarDosen = new ArrayList();
    private Mahasiswa [] daftarMahasiswa = new Mahasiswa[50];
    private KelompokTA [] daftarKelompok = new KelompokTA[20];
    private TugasAkhir [] daftarTugasAkhir = new TugasAkhir[10];
    private int counterDosen;
    private int counterMhs;
    private int counterKel;
    private int counterTugas;
    
    public void addMahasiswa(Mahasiswa m){
        if (counterMhs <10){
        daftarMahasiswa[counterMhs]= m;
        counterMhs++;}
        else{
            System.out.println("Penuh");
        }
    }
    public void addDosen(Dosen d){
        if(counterDosen<10){
        daftarDosen[counterDosen] = d;
        counterDosen++;}
        else{
            System.out.println("Penuh");
        }
    }
    /*public Mahasiswa getMahasiswa(long nim){
        for (int i=0;i<50;i++){
            if (daftarMahasiswa[i].getNim() == nim){
                return daftarMahasiswa[i];
            }
        }
    }*/
    public void deleteMahasiswa(long nim){
        for (int i=0;i<50;i++){
            if (daftarMahasiswa[i].getNim() == nim){
                daftarMahasiswa[i]=null;
            }
        }
    }/*
    public Dosen getDaftarDosen(long nip) {
        for (int i=0;i<50;i++){
            if (daftarDosen[i].getNip() == nip){
                return daftarDosen[i];
            }
        }
    }*/
     public void deleteDosen(long nip){
        for (int i=0;i<50;i++){
            if (daftarDosen[i].getNip() == nip){
                daftarDosen[i]=null;
            }
        }
    }

    /*public KelompokTA getKelompok(String topik) {
        for (int i=0; i<20;i++){
            if(daftarKelompok[i].getTopik() == topik)
                return daftarKelompok[i];
        }
    }*/

    public void setKelompok(KelompokTA kelompok) {
        if (counterKel<20){
        daftarKelompok[counterKel] = kelompok;
        counterKel++;}
        else
        {
            System.out.println("Penuh");
        }
    }

    /*public TugasAkhir getTugas(String judul) {
        for (int i=0;i<10;i++){
            if(daftarTugasAkhir[i].getJudul().equals(judul)){   
                return daftarTugasAkhir[i];
            }
        }
    }*/

    public void setTugas(TugasAkhir tugas) {
        if (counterTugas<10)
            daftarTugasAkhir[counterTugas] = tugas;
        else{
            System.out.println("Penuh");
        }
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
