/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder_pattern;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class HoaDonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        StringBuilder builder = new StringBuilder   ();
        builder.append("01")
                .append("Châu");
        StringBuilder builder2 = new StringBuilder   ();
        builder.append("01")
                .append("Châu");
        System.out.println(builder);
                
    }
    
}
