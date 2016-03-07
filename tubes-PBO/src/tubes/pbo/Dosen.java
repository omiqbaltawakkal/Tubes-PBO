package tubes.pbo;

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
	
	public void deskripsi(){
            System.out.println("Info dosen");
            System.out.println("Nama: "+getNama());
            System.out.println("NIP: "+getNip());
            System.out.println("Kode Dosen: "+getKodeDosen());
            System.out.println("Topik TA: ");
	}
	
}