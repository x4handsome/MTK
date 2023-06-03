import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    //Tao Array List
    //Tao Iterator tu ArrayList
    //Duyet cac phan tu cua Iterator

    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(7);
        Iterator<Integer> ite= arrayList.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}