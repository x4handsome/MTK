/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composite_Pattern;

public class PathFolderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PathFile data = new Folder("data","","");
        PathFile toan = new Folder("toán","","");
        PathFile van = new Folder("toán","","");
        PathFile ly = new Folder("toán","","");
        data.addItem(toan);
        data.addItem(van);
        ly.addItem(van);
        System.out.println("Cây thư mục Data");
        System.out.println(data.getStringTreeFolder());
        System.out.println(ly.getStringTreeFolder());
        //System.out.println(data.path());
    }
    
}
