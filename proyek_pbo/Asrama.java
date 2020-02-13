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
public class Asrama {
    private String id;
    private String nama_asrama;
    private String jumlah_kamar;
    private String pembina_asrama;
    private String kapasitas;

    
    public Asrama(String _id,String _nama,String _jlh,String _pembina,String _kapasitas){
    this.id = _id;
    this.nama_asrama = _nama;
    this.pembina_asrama = _pembina;
    this.jumlah_kamar = _jlh;
    this.kapasitas = _kapasitas;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_asrama() {
        return nama_asrama;
    }

    public void setNama_asrama(String nama_asrama) {
        this.nama_asrama = nama_asrama;
    }

    public String getJumlah_kamar() {
        return jumlah_kamar;
    }

    public void setJumlah_kamar(String jumlah_kamar) {
        this.jumlah_kamar = jumlah_kamar;
    }

    public String getPembina_asrama() {
        return pembina_asrama;
    }

    public void setPembina_asrama(String pembina_asrama) {
        this.pembina_asrama = pembina_asrama;
    }
    
   
    
    
}
