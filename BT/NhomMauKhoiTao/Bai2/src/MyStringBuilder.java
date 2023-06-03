
public class MyStringBuilder {
    private String str;
    public MyStringBuilder(String str) {

        this.str = str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
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
