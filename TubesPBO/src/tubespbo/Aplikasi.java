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
    private Dosen [] daftarDosen = new Dosen[10];
    private Mahasiswa [] daftarMahasiswa = new Mahasiswa[50];
    private int counterDosen;
    private int counterMhs;
    
    public void addMahasiswa(Mahasiswa m){
        if (counterMhs <10){
        m = daftarMahasiswa[counterMhs];
        counterMhs++;}
        else{
            System.out.println("Penuh");
        }
    }
    public void addDosen(Dosen d){
        if(counterDosen<10){
        d = daftarDosen[counterDosen];
        counterDosen++;}
        else{
            System.out.println("Penuh");
        }
    }
    public Mahasiswa getMahasiswa(long nim){
        for (int i=0;i<50;i++){
            if (daftarMahasiswa[i].getNim() == nim){
                return daftarMahasiswa[i];
            }
    }
    }
}
