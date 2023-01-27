import java.util.Comparator;

public class NotebookComparatorByPrice implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2){
        if(Integer.valueOf(o1.getPrice()) > Integer.valueOf(o2.getPrice())){
            return 1;
        }
        if(Integer.valueOf(o1.getPrice()) < Integer.valueOf(o2.getPrice())){
            return -1;
        }
        return 0;
    }
}
