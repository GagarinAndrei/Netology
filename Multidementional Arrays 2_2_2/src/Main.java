public class Main {
    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }

        field[0][0] = CROSS;
        field[0][1] = CROSS;
        field[1][1] = CROSS;
        field[2][2] = CROSS;
        field[0][2] = CROSS;
        printField(field);
        if (isWin(field, CROSS)) {
            System.out.println("Победили " + CROSS);
        }

        printLine();
        emptyFields(field);

        for (int i = 0; i < SIZE; i++) {
            field[i][i] = CROSS;
        }
        printField(field);
        if (isWin(field, CROSS)) {
            System.out.println("Победили " + CROSS);
        }

        printLine();
        emptyFields(field);

        for (int i = 0; i < SIZE; i++) {
            field[1][i] = CROSS;
        }
        printField(field);
        if (isWin(field, CROSS)) {
            System.out.println("Победили " + CROSS);
        }

        printLine();
        emptyFields(field);

        for (int i = 0; i < SIZE; i++) {
            field[i][2] = CROSS;
        }
        printField(field);
        if (isWin(field, CROSS)) {
            System.out.println("Победили " + CROSS);
        }

        printLine();
        emptyFields(field);

        for (int i = 0; i < SIZE; i++) {
            field[i][(SIZE - 1) - i] = CROSS;
        }
        printField(field);
        if (isWin(field, CROSS)) {
            System.out.println("Победили " + CROSS);
        }

        printLine();
        System.out.println("Игра закончена!");
    }

    public static boolean isWin(char[][] field, char player) {

        int playerCount = 0;
        for (int row = 0; row < SIZE; row++) {
            for (int cell = 0; cell < SIZE; cell++) {
                if (field[row][cell] == player) {
                    playerCount++;
                    if (playerCount == SIZE) {
                        return true;
                    }
                }
            }
            playerCount = 0;
        }

        for (int cell = 0; cell < SIZE; cell++) {
            for (int row = 0; row < SIZE; row++) {
                if (field[row][cell] == player) {
                    playerCount++;
                    if (playerCount == SIZE) {
                        return true;
                    }
                }
            }
            playerCount = 0;
        }

        for (int row = 0; row < SIZE; row++) {
            if (field[row][row] == player) {
                playerCount++;
                if (playerCount == SIZE) {
                    return true;
                }
            }
        }
        playerCount = 0;

        for (int row = 0; row < SIZE; row++) {
            if (field[row][(SIZE - 1) - row] == player) {
                playerCount++;
                if (playerCount == SIZE) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void printLine() {
        System.out.println("=======================");
    }

    public static void emptyFields(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
    }
}
