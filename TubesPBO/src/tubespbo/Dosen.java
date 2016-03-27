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
public class Dosen extends Orang {

    private long nip;
    private String kodedosen;
    private KelompokTA[] topikTA;
    int i = 0;

    public Dosen(String nama, String JenisKelamin, long nip, String kodedosen) {
        super(nama, JenisKelamin);
        this.nip = nip;
        this.kodedosen = kodedosen;
        topikTA = new KelompokTA[5];
    }

    public void setNip(long nip) {
        this.nip = nip;
    }

    public long getNip() {
        return nip;
    }

    public void setKodeDosen(String kodedosen) {
        this.kodedosen = kodedosen;
    }

    public String getKodeDosen() {
        return kodedosen;
    }

    public void addKelompokTA(KelompokTA kel) {
        if (topikTA.length < 5) {
            topikTA[i] = kel;
            i++;
        } else {
            System.out.println("Penuh");
        }
    }

    public void deleteKelompokTA(int n) {
        topikTA[n] = null;
    }

    public KelompokTA getKelompokByIndeks(int indeks) {
        return topikTA[indeks];
    }

    public KelompokTA getKelompokByTopik(String topik) {
        int indeks = 0;
        for (int i = 0; i < topikTA.length; i++) {
            if (topikTA[i].topik.equalsIgnoreCase(topik)) {
                indeks = i;
            }
        }
        return topikTA[indeks];
    }

    public void displayKelompok() {
        System.out.println("Data");
        for (int k = 0; k < topikTA.length; k++) {
            System.out.println("Nama: " + getKelompokByIndeks(k).getTopik());
            System.out.println("");
        }
    }

    /**
     *
     */
    @Override
    public void deskripsi() {
        System.out.println("Info dosen");
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Kode Dosen: " + getKodeDosen());
        //System.out.println("Topik TA by indeks: "+getKelompokByIndeks());
        //System.out.println("Topik TA by topik: "+getKelompokByTopik("e-learning"));
    }

}
