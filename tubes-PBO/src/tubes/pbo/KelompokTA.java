package tubes.pbo;

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
}