public class Main {
    public static void main(String[] args) {
    Computer c= new Computer.Builder()
            .builderCPU("I9 9900K")
            .builderDISK("SSD SamSung 1TB")
            .builderSCREEN("4K")
            .builderRAM("SAMSUNG 1TB")
            .build();
    System.out.println(c.toString());
    }
}