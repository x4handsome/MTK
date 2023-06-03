/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chain.ATMRutTien;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class DoiTienMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IATMRutTien namtram = new MenhGiaCaoNhat("500", 500);
        IATMRutTien haitram = new MenhGiaCaoNhat("200", 200);
        IATMRutTien motram = new MenhGiaCaoNhat("100", 100);
        IATMRutTien namchuc = new MenhGiaCaoNhat("50", 50);
        IATMRutTien haichuc = new MenhGiaCaoNhat("20", 20);
        IATMRutTien muoingan = new MenhGiaCaoNhat("10", 10);
        IATMRutTien namngan = new MenhGiaCaoNhat("5", 5);
        IATMRutTien haingan = new MenhGiaCaoNhat("2", 2);
        IATMRutTien motngan = new MenhGia1k("1", 1);
        namtram.setSuccessor(haitram)
                .setSuccessor(motram)
                .setSuccessor(namchuc)
                .setSuccessor(haichuc)
                .setSuccessor(muoingan)
                .setSuccessor(namngan)
                .setSuccessor(haingan)
                .setSuccessor(motngan);
        System.out.println("Số tờ tiền được rút \n"+namtram.SoTien("", 2575));
    }
    
}
