import ru.netology.librerianusers.Administrator;
import ru.netology.librerianusers.Librarian;
import ru.netology.librerianusers.Reader;
import ru.netology.librerianusers.Supplier;

public class Worker implements Librarian, Administrator {
    final String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void orderBook(Librarian librarian, Supplier supplier, String book) {
        System.out.println("Библиотекарь " + librarian.getName() + " заказал " + book + " у поставщика " + supplier.getName());
    }

    @Override
    public void issuedBook(Administrator administrator, Reader reader, String book) {
        System.out.println("Администратор " + administrator.getName() + " выдал " + book + " читателю " + reader.getName());
    }

    @Override
    public void reported(Administrator administrator, Reader reader, String book) {
        System.out.println("Администратор " + administrator.getName() + " сообщил читателю " + reader.getName() + ", что он не вернул " + book);
    }
}
