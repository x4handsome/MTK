import java.util.ArrayList;
import java.util.List;

public abstract class EntityDB<T> {
    List<T> enti = new ArrayList<>();
    protected abstract int getKey(T t);
    public  abstract void inDsSV(T t);
    boolean add(T t){
        for(T o : enti){
            if(getKey(o)==getKey(t))
                return false;
        }
        enti.add(t);
        return true;
    }
    public int update(T t){
        for( int i=0; i<enti.size();i++){
            if(getKey(t) == getKey(enti.get(i))){
                enti.set(i, t);
                return 1;
            }
        }
        return 0;
    }
    public int delete(T t){
        for( int i=0; i<enti.size();i++){
            if(getKey(t) == getKey(enti.get(i))){
                enti.remove(enti.get(i));
                return 1;
            }
        }
        return 0;
    }
    public boolean findByID(int id){

        for(T o:enti){
            if(getKey(o)==getKey(id)){
                return true;
            }
        }
        return false;
    }
    public int deleteByKey(int id){
        return 0;
    }


}
