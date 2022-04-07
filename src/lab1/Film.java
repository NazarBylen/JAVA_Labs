package lab1;

public record Film(String filmName, Integer timeInMin, Integer NumberOfCommentsIMDB){
    //variables
    private static double trailerDuration = 30.5;
    private static int ticketPrice = 70;
    private static String mainCharacterName = "Alan";

    //constructors
    public Film(){
        this("Titanic", 45, 70);
    }

    public Film(String filmName, Integer timeInMin){
        this(filmName, timeInMin, 59);
    }

    //methods

    public String timeInMinAndNumberOfCommentsToString() {
        return "film name: "+filmName + " time in min: "+timeInMin().toString() + " number of comments : " + NumberOfCommentsIMDB().toString() + " trailer duration: "+trailerDuration + " ticket price: " + ticketPrice + " main Character name: " + mainCharacterName;
    }

    public static int GetTimeInMin(int timeInMin){
        return timeInMin;
    }
}
