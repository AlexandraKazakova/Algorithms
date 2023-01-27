import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        List<Notebook> list = notebook.addNotebookToStok(10);
        System.out.println(list);
        Collections.sort(list, new NotebookComparatorByPrice());
        System.out.println(list);
        Collections.sort(list, new NotebookComparatorByRam());
        System.out.println(list);
        Collections.sort(list, new NotebookComparatorByBrand());
        System.out.println(list);
    }
}
