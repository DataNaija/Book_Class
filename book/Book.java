package book;

/*
Your task:
        Implement a class that represent a book with a name. Then, implement the getter method so the book
        name can be retrieved after the book is created.

Example 1:
        Input Book with name "Best Software developer Tips"
        Result: "Best Software Tips"
 */
public class Book {
    private String name;

    public Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
