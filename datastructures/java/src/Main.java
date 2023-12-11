import ArrayBag.ArrayBag;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ArrayBag<String> bag = new ArrayBag<String>();

        bag.add("apple");
        bag.add("grapes");
        bag.add("milk");
        System.out.println("current size!: " + bag.getCurrentSize());
        bag.displayItems();
        System.out.println("remove function!");
        boolean res = bag.remove("apple");
        System.out.println("current size!: " + bag.getCurrentSize());
        bag.displayItems();
        System.out.println("status: " + res);
        bag.add("cheese");
        System.out.println("current size!: " + bag.getCurrentSize());
        bag.displayItems();
    }
}