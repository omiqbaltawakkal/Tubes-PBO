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

public class TugasAkhir {
    private Dosen pembimbing;
    private String judul;
    private String KK;
    private int posisi;

    public TugasAkhir(String judul,String KK,int posisi){
        this.judul=judul;
        this.KK=KK;
        this.posisi=posisi;
        
    }
    public void setPembimbing(Dosen pembimbing, int posisi){
        //set array disini
    }
    public void setKK(String KK){
        this.KK=KK;
    }
    public void setPosisi(String posisi){
        this.posisi=posisi;
    }
    public String KK(){
        return KK;
    }
    public int posisi(){
        return posisi;
    }
    public void display(){
        System.out.println("Nama : "+super.getNama());
        System.out.println("Judul : "+judul);
        System.out.println("KK : "+KK);
        System.out.println("Posisi : "+posisi);
        
    }
}
