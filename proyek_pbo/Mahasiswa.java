/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek_pbo;

/**
 *
 * @author kylex
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenis_kelamin;
    private String prodi;
    private String angkatan;
    
    public Mahasiswa(String _nim,String _nama,String _kelamin,String _prodi,String _angkatan){
    
        this.nim = _nim;
        this.nama = _nama;
        this.jenis_kelamin = _kelamin;
        this.prodi = _prodi;
        this.angkatan = _angkatan;
        
        
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
    
}
