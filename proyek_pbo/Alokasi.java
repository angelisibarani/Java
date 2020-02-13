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
public class Alokasi {
    String ID_Asrama;
    String ID_Kamar;
    String NIM;
    String Nama_Mahasiswa;
    String Nama_Asrama;
   
    public Alokasi(String _ID_Asrama , String _ID_Kamar , String _NIM , String _Nama_Mahasiswa , String _Nama_Asrama){
        this.ID_Asrama = _ID_Asrama;
    this.ID_Kamar= _ID_Kamar;
    this.NIM=_NIM;
    this.Nama_Mahasiswa = _Nama_Mahasiswa;
    this.Nama_Asrama = _Nama_Asrama;
    
    }

    public String getID_Asrama() {
        return ID_Asrama;
    }

    public void setID_Asrama(String ID_Asrama) {
        this.ID_Asrama = ID_Asrama;
    }

    public String getID_Kamar() {
        return ID_Kamar;
    }

    public void setID_Kamar(String ID_Kamar) {
        this.ID_Kamar = ID_Kamar;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama_Mahasiswa() {
        return Nama_Mahasiswa;
    }

    public void setNama_Mahasiswa(String Nama_Mahasiswa) {
        this.Nama_Mahasiswa = Nama_Mahasiswa;
    }

    public String getNama_Asrama() {
        return Nama_Asrama;
    }

    public void setNama_Asrama(String Nama_Asrama) {
        this.Nama_Asrama = Nama_Asrama;
    }
    
    
}
