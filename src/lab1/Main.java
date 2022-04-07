package lab1;

public class Main {
    public static void main(String args[]) {
        int time = 34;
        Film film = new Film();
        Film film2 = new Film("Scream", time);
        Film film3 = new Film("Avenngers", time,130);

        System.out.println(film.timeInMinAndNumberOfCommentsToString());
        System.out.println(film2.timeInMinAndNumberOfCommentsToString());
        System.out.println(film3.timeInMinAndNumberOfCommentsToString());
        System.out.println(film3.GetTimeInMin(time));
    }
}
