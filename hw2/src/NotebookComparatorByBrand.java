import java.util.Comparator;

public class NotebookComparatorByBrand implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
