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
public class KelompokTA{
	public String topik;
	private Mahasiswa[] anggota;
	private int numAnggota;
        
	public KelompokTA(String topik ){
	    this.topik = topik;
	}
        public void addAnggota(Mahasiswa m){
		if(numAnggota<10){
                    anggota[numAnggota] = m;
                    numAnggota++;
		}
	}
        public void removeAnggota(int n){
            anggota[n]=null;
        }
        public Mahasiswa getAnggotaByIndeks(int indeks){
            return anggota[indeks];
        }
        public Mahasiswa getAnggotaByNim(String nim){
            int numOfAnggota=0;
            for (int i=0; i<anggota.length;i++){
                if(anggota[i].topik.equalsIgnoreCase(topik)){
                    numOfAnggota= i;
                }
            }
            return anggota[numOfAnggota];
        }
}
