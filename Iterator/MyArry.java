/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class MyArry {
    private int[] array = {};

    public MyArry(int[] array) {
        this.array = array;
    }
    public Iterator CreateIterator(){
        return new CreateArrayIterator(this);
    }
    public int getItem(int soNguyen){
        return array[soNguyen];
    }
    public int count(){
        return  array.length;
    }
}
