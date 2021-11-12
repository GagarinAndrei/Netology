public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Иванов");
        Author author2 = new Author("Петров");

        Book book1 = new Book("Очень", 1995, author2);
        Book book2 = new Book("Классная", 2004, author1);
        Book book3 = new Book("Фигня", 2009, author1);

        User user1 = new User("Алексей", "+79127465734", true);
        User user2 = new User("Виталий", "8-924-567-38-12", false);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(user1);
        System.out.println(user2);

        System.out.println("Пользователей онлайн: " + User.onlineCount);

        Book.releaseComparsion(book1, book2);


    }
}
