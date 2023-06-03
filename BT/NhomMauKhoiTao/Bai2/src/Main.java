public class Main {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder.Builder()
                .addStringstr("Dang Le Hoai Nhi")
                .addString("61.CNTT_1 ")
                .addFloat(7)
                .addBool(true)
                .build();
        System.out.println(str.toString());
    }
}
