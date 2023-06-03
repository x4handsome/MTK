/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class QuanLyNhanVien implements IQuanLy{
    List<nhanVien> list = new ArrayList<>();
    @Override
    public void them(nhanVien nv) {
        list.add(nv);
    }

    @Override
    public void inDS() {
        
    }
}
