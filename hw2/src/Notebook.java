import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Notebook {
    private int price;
    private int ram;
    private Brand brand;
    private Notebook(int price, int ram, Brand brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }
    private static final int[] PRICES = new int[] {100, 200, 300, 400, 500, 600, 700, 800};
    private static final int[] RAM = new int[] {4, 8, 16, 20, 24, 28, 32};

    public Notebook() {

    }

    private static int randomPrice(){
        int randomIndex = ThreadLocalRandom.current().nextInt(PRICES.length);
        return PRICES[randomIndex];
    }

    private static int randomRAM(){
        return RAM[ThreadLocalRandom.current().nextInt(RAM.length)];
    }

    private static final Random RND = new Random();

    private static Brand brandRandom(){
        Brand[] brands = Brand.values();
        return brands[RND.nextInt(brands.length)];
    }

    public List<Notebook> addNotebookToStok(int n){
        List<Notebook> stok = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stok.add(new Notebook(randomPrice(),randomRAM(), brandRandom()));
        }
        return stok;
    }

    @Override
    public String toString() {
        return "\n" + price + " " + " " + ram + " " + brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public Brand getBrand() {
        return brand;
    }

}



