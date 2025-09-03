/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author Ammar Arifin
 */
public class Perpustakaan {
    private String nama;
    private Buku[] koleksi;

    public Perpustakaan(String nama, Buku[] koleksi) {
        this.nama = nama;
        this.koleksi = koleksi;
    }

    public void tampilkanBuku() {
        System.out.println("Perpustakaan " + nama + " memiliki koleksi:");
        for (Buku b : koleksi) {
            System.out.println("- " + b.getJudul());
        }
    }
}