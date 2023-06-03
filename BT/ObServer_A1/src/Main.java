public class Main {
    public static void main(String[] args) {
        Stream stream= new Stream();
        DataAccess dataAccess= new DataAccess(stream);
        Client client= new Client(stream);
        dataAccess.add(new MonHoc("01","aaaa",'3'));
    }
}