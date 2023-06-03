/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.QuanLySinhVienandMonHoc;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class SinhVienDataBase extends EntityDataBase<SinhVien>{

    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.id;
    }

    
    public void inDsSV(SinhVien sinhVien){
        System.out.println("Id: "+sinhVien.id);
        System.out.println("Họ và tên: "+sinhVien.ten);
        System.out.println("Năm sinh: "+sinhVien.namsinh);
        System.out.println("Quê quán: "+sinhVien.quequan);
    }
}
