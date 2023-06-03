/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder_pattern;

import java.util.Date;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class hoaDonBuider {
    private String mahd,tenkh;
    private Date ngayban;

    public hoaDonBuider(Builder builder) {
        this.mahd = builder.mahd;
        this.tenkh = builder.tenkh;
        this.ngayban = builder.ngayban;
    }

   
    private static class Builder {
        String mahd,tenkh;
        Date ngayban;
        public Builder addmahd(String mahd) {
            this.mahd = mahd;
            return this;
        }
        public Builder addtenkh(String tenkh) {
            this.tenkh = tenkh;
            return this;
        }
        public Builder addngayban(Date ngayban) {
            this.ngayban = ngayban;
            return this;
        }
        
        public hoaDonBuider build(){
            return new hoaDonBuider(this);
        }
    }
    
    
}
