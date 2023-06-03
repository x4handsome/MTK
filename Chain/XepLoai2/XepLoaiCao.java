/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain.XepLoai2;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class XepLoaiCao implements IXepLoai{
    float max;
    String label;

    public XepLoaiCao( String label,float max) {
        this.max = max;
        this.label = label;
    }

    @Override
    public IXepLoai setSuccessor(IXepLoai xepLoai) {
        return null;
    }

    @Override
    public String xepLoai(float diem) {
        if(diem<=max){ 
            return label;
        }
        else{ 
            return "Không xếp loại được";
        }
    }
    
    
}
