package tubes.pbo;

public abstract class Orang{
	private String nama;
	private String JenisKelamin;
	
	public Orang(String nama, String JenisKelamin){
		this.nama=nama;
		setJenisKelamin(JenisKelamin);
	}
	public void setNama(String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}
	public void setJenisKelamin(String JenisKelamin){
		if (JenisKelamin =="Pria" || JenisKelamin =="Wanita")
			this.JenisKelamin=JenisKelamin;
		else
			this.JenisKelamin=null;
	}
	public String getJenisKelamin(){
		return JenisKelamin;
	}
	public abstract void deskripsi();
}