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
    private final long nim;
    private TugasAkhir[] tugasakhir;
    private String judul;
    private int numOfTugasAkhir;
    private int numOfJudul;
    
    public Mahasiswa(String nama, String jeniskelamin, long nim){
        super(nama,jeniskelamin);
        this.nim=nim;
    }
    /*public void createTA(String judul,String KK){
        if(tugasakhir.length>=numOfJudul) {
            tugasakhir[numOfJudul]=new TugasAkhir(judul,KK);
            numOfJudul++;
        }else System.out.println("error");
    }*/
    public void addTugasAkhir(TugasAkhir t){
        if(numOfTugasAkhir<tugasakhir.length){
            tugasakhir[numOfTugasAkhir]=t;
            numOfTugasAkhir++;
        }else System.out.println("error");
    }
    public TugasAkhir getTA(int i){
        return tugasakhir[i];
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public String getJudul(){
        return judul;
    }

    /**
     *
     */
    @Override
    public void deskripsi(){
        System.out.println("Nama : "+super.getNama());
        System.out.println("Nim : "+nim);
        System.out.println("Judul : "+judul);
        
    }
}
