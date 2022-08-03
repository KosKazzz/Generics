public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringBox = new MagicBox<>(4);
        stringBox.add("qwerty1");
        stringBox.add("qwerty2");
        stringBox.add("qwerty3");
        stringBox.add("qwerty4");
        stringBox.add("qwerty5");
        System.out.println(stringBox.pick());

        MagicBox<Integer> integerMagicBox = new MagicBox<>(3);
        integerMagicBox.add(1);
        integerMagicBox.add(2);
        integerMagicBox.add(3);
        integerMagicBox.add(4);
        System.out.println(integerMagicBox.pick());

        System.out.println(stringBox.printMagicBox());
        System.out.println(integerMagicBox.printMagicBox());

    }
}
