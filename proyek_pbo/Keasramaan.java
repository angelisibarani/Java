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
public class Keasramaan {
    private String nik;
    private String nama;
    private String hp;
    private String jenis_kelamin;
    
    public Keasramaan(String _nama,String _nik,String _hp,String _kelamin){
    this.nik = _nik;
    this.nama = _nama;
    this.hp = _hp;
    this.jenis_kelamin = _kelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}
