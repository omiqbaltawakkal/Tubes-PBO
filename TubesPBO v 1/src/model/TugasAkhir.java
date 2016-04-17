/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Dosen;
import java.io.Serializable;

/**
 *
 * @author user
 */

public class TugasAkhir implements Serializable{
    private Dosen[] pembimbing;
    private String judul;
    private String KK;
    private int posisi;
    public int i;

    public TugasAkhir(String judul,String KK){
        this.judul=judul;
        this.KK=KK;
        pembimbing = new Dosen[2];
    }
    public void setPembimbing(Dosen baru, int posisi){
        if(this.pembimbing[i] != null){
            System.out.println("Pembimbing dari TA ini sudah full");
        }
        else{
            setPosisi(posisi);
            pembimbing[posisi]=baru;
            i++;
        }
    }
    public void removePembimbing(long nip){
        for (int j=0; j<1;j++){
            if (getDosenPembimbing(j).getNip() == nip){
                pembimbing[j] = null;
            }
        }
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setKK(String KK){
        this.KK=KK;
    }
    public Dosen getDosenPembimbing(int a){
        return pembimbing[a];
    }
    public void setPosisi(int posisi){
        this.posisi=posisi;
    }
    public String getKK(){
        return KK;
    }
    public int getPosisi(){
        return posisi;
    }
    public void display(){
        //System.out.println("Nama : "+super.getNama());
        System.out.println("Judul : "+judul);
        System.out.println("KK : "+KK);
        System.out.println("Posisi : "+posisi);
        
    }
}
