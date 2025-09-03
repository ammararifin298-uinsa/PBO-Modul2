/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Ammar Arifin
 */
public class DemoInheritance {
    public static void main(String[] args) {
        Hewan h1 = new Kucing("Kitty");
        Hewan h2 = new Anjing("Doggy");

        h1.suara();
        h2.suara();
    }
}