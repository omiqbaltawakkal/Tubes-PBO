public abstract class Orang{
	private String nama;
	private int umur;
	private String jenis;
	private 
	
	public Orang(String nama, int umur, String jenis){
		this.nama=nama;
		this.umur=umur;
		this.jenis=jenis;
	}
	public void setNama(String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}
	public void setUmur(int umur){
		this.umur=umur;
	}
	public int getUmur(){
		return umur;
	}
	public void setJenis(String jenis){
		this.jenis=jenis;
	}
	public String getJenis(){
		return jenis;
	}
}
