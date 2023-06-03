import java.util.ArrayList;
import java.util.List;

public class Stream {
    List<StreamListener>listen= new ArrayList<>();

    public Stream() {
        this.list = list;
    }

    List<MonHoc> list;
    public void Listen(StreamListener listeners){
        listener.add(listeners);
    }
    void addEvent(T t){
        for (var listener:listeners) {
            listener.handle(t);
        }
    }
    public static interface StreamListener{
        void  handle(List<MonHoc>list);
    }
}
