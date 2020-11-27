/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan61.objectorientedbangunruang;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan bangun ruang dari tabung,kerucut
 *                     bola, dengan berbasis objek
 */
public class Kerucut implements BangunRuang{
    private int r,tinggi;
    // tinggi = 9, r = 14
    
    public Kerucut(int r,int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return (22*r*r*tinggi)/(3*7);
    }

    @Override    
    public void tampilBangunRuang() {
        System.out.printf("Hasil : V = %.0f%n", hitungVolume());
    }
}
