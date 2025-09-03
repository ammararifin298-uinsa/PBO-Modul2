/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author Ammar Arifin
 */
public class DemoAggregation {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java");
        Buku b2 = new Buku("Basis Data Lanjut");
        Buku b3 = new Buku("Sistem Informasi");

        Buku[] koleksi = {b1, b2, b3};
        Perpustakaan p = new Perpustakaan("UINSA Library", koleksi);

        p.tampilkanBuku();
    }
}