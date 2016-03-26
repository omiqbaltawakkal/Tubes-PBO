/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.io.Serializable;

/**
 *
 * @author user
 */
public abstract class Orang implements Serializable{
	private String nama;
	private String JenisKelamin;
	
	public Orang(String nama, String jenis){
		this.nama=nama;
		this.JenisKelamin= jenis;
	}
	public void setNama(String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}
	public void setJenisKelamin(String JenisKelamin){
		if ("Pria".equals(JenisKelamin) || "Wanita".equals(JenisKelamin))
			this.JenisKelamin=JenisKelamin;
		else
			this.JenisKelamin=null;
	}
	public String getJenisKelamin(){
		return JenisKelamin;
	}
	public abstract void deskripsi();
}
