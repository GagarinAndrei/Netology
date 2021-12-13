import ru.netology.my.Event;
import ru.netology.my.Movie;
import ru.netology.my.Theatre;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
            throw new RuntimeException();
        }
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Середина", 2012, 17),
                new Movie("Конец", 2014, 18)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Марфа Петрова", 2003, 16),
                new Theatre("Агафья Леонтьева", 2019, 14)
        };
    }
}

