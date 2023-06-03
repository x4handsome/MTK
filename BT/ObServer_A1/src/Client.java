import java.util.List;

public class Client implements Stream.StreamListener {
    Stream stream;

    public Client(Stream stream) {
        this.stream = stream;
        stream.listen(listener);
    }

    @Override
    public void handle(List<MonHoc> mhs) {
     for(var mh:mhs){
         System.out.println(mh.toString());
     }
    }
}
