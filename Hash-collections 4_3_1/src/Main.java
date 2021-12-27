import ru.netology.my.Contact;
import ru.netology.my.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook(new HashMap<>());

        book.addGroup("Friends");
        book.addGroup("Work");
        book.addGroup("Other");

        book.addContact("Friends", new Contact("Oleg", "2323525"));
        book.addContact("Friends", new Contact("Mikhail", "564635"));
        book.addContact("Work", new Contact("Vasiliy", "7898945"));
        book.addContact("Other", new Contact("Ivan", "235424563"));

        for(Map.Entry<String, List<Contact>> item : book.getContactList().entrySet()) {
           System.out.println(item.getKey() + ": " + item.getValue());
       }

        book.findContact("564635");
    }
}
