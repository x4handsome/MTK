/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class XepLoaiCaoNhat implements IXepLoai{
    String label;
    float max;
    
    public XepLoaiCaoNhat(String label, float max ) {
        this.label = label;
        this.max = max;
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
               return "Điểm ngoài phạm vi không xếp loại được";
           }
    }
    
}
