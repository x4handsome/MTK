/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.GioiHang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class GioHang {
    
    List<MatHang> entities = new ArrayList<>();
    protected abstract void tinhChietKhau();
    public void gioHang(){
//        entities.add(new MatHang("Giày", 2, 100000));
//        entities.add(new MatHang("dép", 2, 100000));
//        entities.add(new MatHang("Giày", 2, 100000));
        inDs();
        System.out.println("Tổng tiền là: "+tinhTien());
        tinhChietKhau();
    }
    boolean add(MatHang mh){
        entities.add(mh);
        return true;
    }
    
    public double tinhTien(){
        double tongtien=0;
        for (MatHang value : entities)
            {
                tongtien += value.dongia * value.soluong;
            }
        return tongtien;
    }
    public void inDs(){
        entities.forEach((t) -> {
            System.out.println("Mặt hàng: "+t.mathang);
            System.out.println("Số lượng: "+t.soluong);
            System.out.println("Đơn giá: "+t.dongia);
        });
    }
    
    
}
