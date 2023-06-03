/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
import java.util.ArrayList;
import java.util.List;


public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList() ;

  public void attach(I_TheoDoiTiGia o ){
      if(!observers.contains(o))
          observers.add(o);
  }
  public void detach(I_TheoDoiTiGia o ){
      if(observers.contains(o))
          observers.remove(o);
  }
  
  public void notifyTiGia(float delta){
      for(I_TheoDoiTiGia o : observers)
          o.CapNhapTiGia(delta);
  }
  static public interface I_TheoDoiTiGia{
      void CapNhapTiGia(float delta);
  }
  
}
