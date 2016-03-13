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
public class TubesPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("a","Pria",123123);
        Mahasiswa m2 = new Mahasiswa("b","Pria",123124);
        Mahasiswa m3 = new Mahasiswa("f","Wanita",123122);
        Mahasiswa m4 = new Mahasiswa("g","Wanita",123124);
        
        Dosen d1 = new Dosen("c","Pria",123123,"C");
        Dosen d2 = new Dosen("d","Pria",123121,"D");
        Dosen d3 = new Dosen("b","Wanita",123126,"B");
        Dosen d4 = new Dosen("r","Wanita",123125,"R");
        
        TugasAkhir t1 = new TugasAkhir("satu","icm");
        TugasAkhir t2 = new TugasAkhir("dua","side");
        
        KelompokTA k1 = new KelompokTA("icm",3);
        KelompokTA k2 = new KelompokTA("side",2);
        
        m1.createTugasAkhir(t1);
        
        k1.addAnggota(m1);
        k1.addAnggota(m3);
        
        k2.addAnggota(m2);
        k2.addAnggota(m4);
        
        d1.createKelompokTA(k1);
        d2.createKelompokTA(k2);
        
        m1.deskripsi();
        m2.deskripsi();
        
        d1.deskripsi();
        //d1.displayKelompok();
        //d2.deskripsi();
        
        
    }
    
}
