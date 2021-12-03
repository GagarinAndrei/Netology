public class Main {
    public static void main(String[] args) {
        String book = "Букварь";

        User user = new User("Иван");
        Worker worker = new Worker("Василий");

        worker.orderBook(worker, user, book);
        user.broughtBook(user, worker, book);
        user.takeBook(user, worker, book);
        worker.issuedBook(worker, user, book);
        worker.reported(worker, user, book);
        user.giveBook(user, worker, book);
    }
}
