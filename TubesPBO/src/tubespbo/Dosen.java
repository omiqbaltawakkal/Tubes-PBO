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
public class Dosen extends Orang{
	private String nip;
	private String kodedosen;
	private KelompokTA[] topikTA;
	
	public Dosen(String nama, String JenisKelamin, String nip, String kodedosen){
		super(nama,JenisKelamin);
		this.nip=nip;
		this.kodedosen=kodedosen;
	}
	public void setNip(String nip){
		this.nip=nip;
	}
	public String getNip(){
		return nip;
	}
	public void setKodeDosen(String kodedosen){
		this.kodedosen=kodedosen;
	}
	public String getKodeDosen(){
                return kodedosen;
        }
	public void createKelompokTA(int n){
		this.topikTA = new KelompokTA[n];
	}
	
        public void deleteKelompokTA(int n){
            topikTA[n] = null;
        }
        
        public KelompokTA getKelompokByIndeks(int indeks){
            return topikTA[indeks];
        }
        
        public KelompokTA getKelompokByTopik(String topik){
            int indeks=0;
            for (int i=0; i<topikTA.length;i++){
                if(topikTA[i].topik.equalsIgnoreCase(topik)){
                    indeks = i;
                }
            }
            return topikTA[indeks];
        }
        
	public void deskripsi(){
            System.out.println("Info dosen");
            System.out.println("Nama: "+getNama());
            System.out.println("NIP: "+getNip());
            System.out.println("Kode Dosen: "+getKodeDosen());
            System.out.println("Topik TA by indeks: "+getKelompokByIndeks(1));
            System.out.println("Topik TA by topik: "+getKelompokByTopik("e-learning"));
	}
	
}
