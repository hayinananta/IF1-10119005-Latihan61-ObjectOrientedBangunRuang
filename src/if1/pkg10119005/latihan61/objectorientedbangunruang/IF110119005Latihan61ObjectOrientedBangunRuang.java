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
public class IF110119005Latihan61ObjectOrientedBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        Tabung t = new Tabung(10,21);
        Kerucut k = new Kerucut(14,9);
        
        b.tampilBangunRuang();
        t.tampilBangunRuang();
        k.tampilBangunRuang();
    }   
}
