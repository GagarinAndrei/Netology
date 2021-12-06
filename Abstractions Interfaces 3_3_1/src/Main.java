public class Main {
    public static void main(String[] args) {
        String book = "Букварь";

        User user = new User("Иван");
        Worker worker = new Worker("Василий");

        worker.orderBook(user, book);
        user.broughtBook(worker, book);
        user.takeBook(worker, book);
        worker.issuedBook(user, book);
        worker.reported(user, book);
        user.giveBook(worker, book);
    }
}
