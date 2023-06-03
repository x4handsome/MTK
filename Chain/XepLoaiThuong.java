/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class XepLoaiThuong implements IXepLoai{
    IXepLoai successor;
    String label;
    float min;

    public XepLoaiThuong(String label, float min) {
        this.label = label;
        this.min = min;
    }

    @Override
    public IXepLoai setSuccessor(IXepLoai xepLoai) {
        return null;
    }

    @Override
    public String xepLoai(float diem) {
        if(diem>=min){ 
            return label;
        }
        else{ 
            if(successor!=null){ 
                return successor.xepLoai(diem);
            }
            else{ 
                return "Điểm ngoài phạm vi không xếp loại được";
            }
        }
    }
    
    
}
