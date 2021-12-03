import ru.netology.librerianusers.Administrator;
import ru.netology.librerianusers.Librarian;

public class Worker implements Librarian, Administrator {
    final String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void orderBook(String worker, String user, String book) {
        System.out.println("Библиотекарь " + worker + " заказал " + book + " у поставщика " + user);
    }

    @Override
    public void issuedBook(String worker, String user, String book) {
        System.out.println("Администратор " + worker + " выдал " + book + " читателю " + user);
    }

    @Override
    public void reported(String worker, String user, String book) {
        System.out.println("Администратор " + worker + " сообщил читателю " + user + ", что он не вернул " + book);
    }
}
