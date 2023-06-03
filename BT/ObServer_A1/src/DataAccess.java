import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc>list= new ArrayList<>();
    Stream stream;

    public DataAccess(Stream stream) {
        this.stream = stream;
    }

    public void add(MonHoc mh){
        list.add(mh);
        stream.addEvent(list);

    }

}
