/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.QuanLySinhVienandMonHoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class EntityDataBase <T> {
    List<T> entities = new ArrayList<>();
    protected abstract int getKey(T t);
    public  abstract void inDsSV(T t);
    private boolean  find(T t){ 
        for(T o:entities){ 
            if(getKey(o)==getKey(t)){
                return true;
            }
        }
        return false;
    }
    
    boolean add(T t){
        if(!find(t)){ 
            entities.add(t);
            return true;
        }
        return false;
    }
    
    public int update(T t){ 
        for( int i=0; i<entities.size();i++){
            if(getKey(t) == getKey(entities.get(i))){
                entities.set(i, t);
                return 1;
            }
        }
        return 0;
    }
    public int delelte(T t){ 
        for( int i=0; i<entities.size();i++){ 
            if(getKey(t) == getKey(entities.get(i))){ 
                entities.remove(i); 
                return 1;
            }
        }
        return 0;
    }
    public void inDs(){ 
        entities.forEach((t) -> {
            inDsSV(t);
            System.out.println("\n");
        });
    }
}
