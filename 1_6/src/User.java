public class User {
    static int onlineCount = 0;
    static  int serialNumber = 1;

    int number;
    String name;
    String phoneNumber;
    boolean isOnline;

    public User(String name, String phoneNumber, boolean isOnline) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isOnline = isOnline;
        this.number = serialNumber++;
        if (isOnline) {
            onlineCount++;
        }
    }

    public String toString() {
        return number + ". Имя пользователя: " + name +
                ". Номер телефона: " + phoneNumber;
    }
}
