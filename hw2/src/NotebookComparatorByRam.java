import java.util.Comparator;

public class NotebookComparatorByRam implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        if(Integer.valueOf(o1.getRam()) > Integer.valueOf(o2.getRam())){
            return 1;
        }
        if(Integer.valueOf(o1.getRam()) < Integer.valueOf(o2.getRam())){
            return -1;
        }
        return 0;
    }
}
