/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder_pattern;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class computer {
    private String CPU,RAM,HarDisk,Screen;

    public computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HarDisk = builder.HarDisk;
        this.Screen = builder.Screen;
    }

    @Override
    public String toString() {
        return "computer{" + "CPU: " + CPU + ", RAM: " + RAM + ", HarDisk: " + HarDisk + ", Screen: " + Screen + '}';
    }
    
    
    public static class Builder{
        String CPU,RAM,HarDisk,Screen;
        public  Builder addCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder addRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        
        public Builder addHarDisk(String HarDisk){
            this.HarDisk = HarDisk;
            return this;
        }
        public Builder addHScreen(String Screen){
            this.Screen = Screen;
            return this;
        }
        public computer build(){
            return new computer(this);
        }
    }
}
