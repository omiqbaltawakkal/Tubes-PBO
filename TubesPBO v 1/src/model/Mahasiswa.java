/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Mahasiswa extends Orang {

    private long nim;
    private TugasAkhir tugasakhir;

    public Mahasiswa(String nama, String jeniskelamin, long nim) {
        super(nama, jeniskelamin);
        this.nim = nim;
    }

    public void createTugasAkhir(TugasAkhir t) {
        tugasakhir = t;
    }

    public TugasAkhir getTugasAkhir() {
        return tugasakhir;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public long getNim() {
        return nim;
    }

    public TugasAkhir getTugasakhir() {
        return tugasakhir;
    }

    public void setTugasakhir(TugasAkhir tugasakhir) {
        this.tugasakhir = tugasakhir;
    }

    public void removeTugas() {
        tugasakhir = null;
    }

    /**
     *
     */
    @Override
    public void deskripsi() {
        System.out.println("Info Mahasiswa");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Nim : " + getNim());
    }
}
