/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder_pattern;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class ComputerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        computer cpt = new computer.Builder()
                .addCPU("Core I9 12900U")
                .addRAM("32GB SamSung")
                .addHarDisk("1TB SSD SamSung")
                .addHScreen("21 inches")
                .build();
        System.out.println(cpt.toString());
//        StringBuilder builder = new StringBuilder   ();
//        builder.append(true)
//                .append("61CNTT-1")
//                .
    }
    
}
