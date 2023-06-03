/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder_pattern.MyStringBuilder;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class MyStringBuilder {
    private String str;
    public MyStringBuilder(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Chuỗi là: " + str ;
    }
    public static class Builder {
        private String str;
        public Builder() {
        }
        public Builder addStringstr(String str){
        this.str = str;
        return this;
        }
        public Builder addString(String s){
        this.str = str + s;
        return this;
        }
        public Builder addFloat(float f){
        this.str = str+f;
        return this;
        }
        public Builder addBool(boolean b){
        this.str = str+b;
        return this;
        }
        public MyStringBuilder build (){
            return new MyStringBuilder(str);
        }
    }
    
}
