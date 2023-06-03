/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class CreateArrayIterator implements Iterator{
    MyArry soNguyen;
    int i=0;
    public CreateArrayIterator(MyArry soNguyen) {
        this.soNguyen = soNguyen;
    }
    @Override
    public Object First() {
        return soNguyen.getItem(i);
    }

    @Override
    public Object Next() {
        if(isDone())
        return soNguyen.getItem(++i);
        else return null;
    }

    @Override
    public boolean isDone() {
        return i< (soNguyen.count() -1);
    }

    @Override
    public Object CurrentItem() {
        return soNguyen.getItem(i);
    }
    

    
    
}
    
    

   
    

