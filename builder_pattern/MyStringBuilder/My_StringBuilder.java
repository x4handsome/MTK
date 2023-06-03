/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder_pattern.MyStringBuilder;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class My_StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyStringBuilder str = new MyStringBuilder.Builder()
                .addStringstr("Nguyễn Quốc Châu")  
                .addString("61.CNTT_1 ")
                .addFloat(7 )
                .addBool(true)
                .build();
        System.out.println(str.toString());
    }
    
}
