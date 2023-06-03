public class Computer {
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", SCREEN='" + SCREEN + '\'' +
                ", DISK='" + DISK + '\'' +
                '}';
    }

    String CPU,RAM,SCREEN,DISK;
    private Computer(Builder b){
        this.CPU=b.CPU;
        this.DISK=b.DISK;
        this.RAM=b.RAM;
        this.SCREEN=b.SCREEN;
    }
    public static class Builder{
        String CPU,RAM,SCREEN,DISK;
        public Builder builderCPU(String cpu){
            this.CPU=cpu;
            return this;
        }
        public  Builder builderRAM(String ram){
            this.RAM=ram;
            return this;
        }
        public Builder builderSCREEN(String screen){
            this.SCREEN=screen;
            return this;
        }
        public  Builder builderDISK(String disk){
            this.DISK=disk;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
