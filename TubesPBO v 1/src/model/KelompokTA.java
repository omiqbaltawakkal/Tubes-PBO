/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class KelompokTA implements Serializable {

    public String topik;
    private String namaKelompok;
    private Mahasiswa[] anggota;
    private int numAnggota;
    public int max;

    public KelompokTA(String nama, String topik, int num) {
        this.topik = topik;
        anggota = new Mahasiswa[num];
        max = num;
        namaKelompok = nama;
    }

    public void addAnggota(Mahasiswa m) {
        if (numAnggota < max) {
            anggota[numAnggota] = m;
            numAnggota++;
        }
    }

    public void removeAnggota(int n) {
        anggota[n] = null;
    }

    public int getNumAnggota() {
        return numAnggota;
    }

    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }

    public Mahasiswa getAnggotaByIndeks(int indeks) {
        return anggota[indeks];
    }

    public Mahasiswa getAnggotaByNim(long nim) {
        int numOfAnggota = 0;
        for (int i = 0; i < anggota.length; i++) {
            if (anggota[i].getNim() == nim) {
                numOfAnggota = i;
            }
        }
        return anggota[numOfAnggota];
    }

    public String getNamaKelompok() {
        return namaKelompok;
    }

    public int getPosisiAnggota(long nim) {
        int posisi = 0;
        for (int i = 0; i < anggota.length; i++) {
            if (anggota[i].getNim() == nim) {
                posisi = i;
            }
        }
        return posisi;
    }

    public void setNamaKelompok(String namaKelompok) {
        this.namaKelompok = namaKelompok;
    }

}
