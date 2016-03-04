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
public abstract class Orang {
	private String nama;
	private int umur;
	private String jenis; 
	
	public Orang(String nama){
		this.nama=nama;
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