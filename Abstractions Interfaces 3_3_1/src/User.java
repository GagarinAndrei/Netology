import ru.netology.librerianusers.Reader;
import ru.netology.librerianusers.Supplier;

public class User implements Reader, Supplier {
    final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void takeBook(String username, String username2, String book) {
        System.out.println("Читатель " + username + " попросил " + book + " у администратора " + username2);
    }

    @Override
    public void giveBook(String username, String username2, String book) {
        System.out.println("Читатель " + username + " отдаёт книгу " + book + " администратору " + username2);
    }

    @Override
    public void broughtBook(String username, String username2, String book) {
        System.out.println("Поставщик " + username + " поставил " + book + " библиатекарю " + username2);
    }
}
