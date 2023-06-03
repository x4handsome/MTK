/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.QuanLySinhVienandMonHoc;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class SinhVien {
    int id,namsinh;
    String ten,quequan;
    
//    @Override
//    public String toString() {
//        return "SinhVien{" + "id=" + id + ", namsinh=" + namsinh + ", ten=" + ten + ", quequan=" + quequan + '}';
//    }

    public SinhVien(int id, int namsinh, String ten, String quequan) {
        this.id = id;
        this.namsinh = namsinh;
        this.ten = ten;
        this.quequan = quequan;
    }
    
}
