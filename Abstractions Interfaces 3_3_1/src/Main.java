public class Main {
    public static void main(String[] args) {
        String book = "Букварь";

        User user = new User("Иван");
        Worker worker = new Worker("Василий");

        worker.orderBook(worker.getName(), user.getName(), book);
        user.broughtBook(user.getName(), worker.getName(), book);
        user.takeBook(user.getName(), worker.getName(), book);
        worker.issuedBook(worker.getName(), user.getName(), book);
        worker.reported(worker.getName(), user.getName(), book);
        user.giveBook(user.getName(), worker.getName(), book);
    }
}
