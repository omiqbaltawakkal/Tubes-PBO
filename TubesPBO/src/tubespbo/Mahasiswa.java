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
    private TugasAkhir tugasakhir;
    private String judul;
    //private String status;
    
    public Mahasiswa(String nama, long nim){
        super(nama);
        this.nim=nim;
    }
    public void createTA(String judul){
        
    }
    public TugasAkhir getTA(){
        return tugasakhir;
    }
    //setter, getter, display
}
