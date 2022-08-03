import java.util.Random;

public class MagicBox<T> {
    private T[] items;//?????
    private int count;

    public MagicBox(int count) {
        this.count = count;
        this.items = (T[]) new Object[count];

    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (T oneItem : items) {
            if (oneItem == null) {
                throw new RuntimeException("Box not filled.Box have some more free spaces!");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
    //test only for String and Number
    public String printMagicBox(){
        String result="";
        for (T oneItem: items) {
            result +=  String.valueOf(oneItem)+" ";
        }
        return result;
    }
}
