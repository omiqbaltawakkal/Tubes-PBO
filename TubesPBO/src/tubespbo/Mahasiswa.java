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
    
    
    //private String status;
    
    public Mahasiswa(String nama, long nim){
        super(nama);
        this.nim=nim;
    }
    public void createTA(String judul){
        if(TugasAkhir.length>=numOfJudul) {
            TugasAkhir[numOfJudul]=new TugasAkhir(judul);
            numOfJudul++;
        }else System.out.println("error");
    }
    public void addTugasAkhir(TugasAkhir t){
        if(numOfTugasAkhir<TugasAkhir.length){
            TugasAkhir[numOfTugasAkhir]=t;
            numOfTugasAkhir++;
        }else System.Out.Println("error");
    }
    

    /**
     *
     * @return
     */
    public TugasAkhir getTA(){
        return tugasakhir;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public String getJudul(){
        return judul;
    }
    public void display(){
        System.out.println("Nama : "+super.getNama());
        System.out.println("Nim : "+nim);
        System.out.println("Judul : "+judul);
        
    }
}
