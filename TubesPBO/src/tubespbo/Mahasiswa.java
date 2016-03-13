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
public class Mahasiswa extends Orang{
    private long nim;
    private TugasAkhir[] tugasakhir;
    private int numOfTugasAkhir;
    
    public Mahasiswa(String nama, String jeniskelamin, long nim){
        super(nama,jeniskelamin);
        this.nim=nim;
        tugasakhir = new TugasAkhir[1];
    }
    /*public void createTA(String judul,String KK){
        if(tugasakhir.length>=numOfJudul) {
            tugasakhir[numOfJudul]=new TugasAkhir(judul,KK);
            numOfJudul++;
        }else System.out.println("error");
    }*/
    public void createTugasAkhir(TugasAkhir t){
        if(numOfTugasAkhir<tugasakhir.length){
            tugasakhir[numOfTugasAkhir]=t;
            numOfTugasAkhir++;
        }else System.out.println("error");
    }
    public TugasAkhir getTA(int i){
        return tugasakhir[i];
    }
    public void setNim(long nim) {
        this.nim = nim;
    }
    public long getNim() {
        return nim;
    }

    /**
     *
     */
    @Override
    public void deskripsi(){
        System.out.println("Info Mahasiswa");
        System.out.println("Nama : "+super.getNama());
        System.out.println("Nim : "+getNim());
    }
}
