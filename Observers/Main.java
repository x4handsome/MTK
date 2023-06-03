/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observers;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TiGia t = new TiGia();
       NhaDauTuA a = new NhaDauTuA(t);
       NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lần 1 :");
        t.notifyTiGia(-5);
        a.HuyDangKy();
        System.out.println("Lần 2 :");
        t.notifyTiGia(0);
    }
    
}
