import ru.netology.librerianusers.Administrator;
import ru.netology.librerianusers.Librarian;
import ru.netology.librerianusers.Reader;
import ru.netology.librerianusers.Supplier;

public class User implements Reader, Supplier {
    final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeBook(Reader reader, Administrator administrator, String book) {
        System.out.println("Читатель " + reader.getName() + " попросил " + book + " у администратора " + administrator.getName());
    }

    @Override
    public void giveBook(Reader reader, Administrator administrator, String book) {
        System.out.println("Читатель " + reader.getName() + " отдаёт " + book + " администратору " + administrator.getName());
    }

    @Override
    public void broughtBook(Supplier supplier, Librarian librarian, String book) {
        System.out.println("Поставщик " + supplier.getName() + " поставил " + book + " библиатекарю " + librarian.getName());
    }
}
