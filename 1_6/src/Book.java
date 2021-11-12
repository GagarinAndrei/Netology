public class Book {
    String name;
    int yearOfPublication;
    int numberOfPages;
    Author author;

    public Book(String name, int yearOfPublication, Author author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = (int) (Math.random() * 1000);
        this.author = author;
    }

    public static void releaseComparsion(Book book1, Book book2) {
        if (book1.yearOfPublication < book2.yearOfPublication) {
            System.out.println(book1.name + " вышла раньше " + book2.name);
        }
        else if (book1.yearOfPublication > book2.yearOfPublication) {
            System.out.println(book2.name + " вышла раньше " + book1.name);
        }
        else {
            System.out.println("Вышли в один год");
        }
    }

    public String toString() {
        return "Название: " + name + "\n" +
                "Год: " + yearOfPublication + "\n"
                + "Количество страниц: " + numberOfPages + "\n"
                + "Автор: " + author + "\n"
                + "============================" + "\n";
    }
}
