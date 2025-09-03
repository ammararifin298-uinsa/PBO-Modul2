/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Ammar Arifin
 */
public class DemoEncapsulation {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank(500000);

        System.out.println("Saldo awal: " + akun.getSaldo());
        akun.setoran(200000);
        akun.tarik(100000);
        akun.tarik(700000); // gagal
        System.out.println("Saldo akhir: " + akun.getSaldo());
    }
}