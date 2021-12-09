import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ender login:");
        String login = scanner.nextLine();
        System.out.println("Ender password");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);

    }

    public static User[] getUsers() {
        User vasya = new User("Vasya", "1234", 20);
        User petya = new User("Petya", "4321", 16);
        User valentin = new User("Valentin", "password", 46);
        return new User[]{vasya, petya, valentin};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Access denied!");
        }
        System.out.println("Access granted!");
    }

}
