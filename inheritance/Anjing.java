/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Ammar Arifin
 */
public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " menggonggong: Guk Guk!");
    }
}
