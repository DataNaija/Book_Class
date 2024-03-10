package book;

public class Main {

    public static void main(String[] args) {
        Book bookName = new Book("Best Software Developer Tips");
        String result = bookName.getName();

        System.out.println(result);
    }
}
