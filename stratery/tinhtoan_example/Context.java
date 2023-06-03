/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stratery.tinhtoan_example;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class Context {
    ITinhToan tinhToan;

    public ITinhToan getTinhToan() {
        return tinhToan;
    }

    public void setTinhToan(ITinhToan tinhToan) {
        this.tinhToan = tinhToan;
    }
    
}
