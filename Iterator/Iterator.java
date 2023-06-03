/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Iterator;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public interface Iterator<T> {   
    abstract Object First();
    abstract Object Next();
    abstract boolean isDone();
    abstract Object CurrentItem();
}
