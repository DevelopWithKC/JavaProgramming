public class SecondsAndMinutesChallenge {

    public static String getDurationString(int seconds)
    {
        int totalSeconds = seconds;
        int hours = totalSeconds/3600;
        int remainingSeconds = totalSeconds % 3600;
        int remainingTotalMinutes = remainingSeconds/60;
        int remainingTotalSeconds = remainingSeconds % 60;

        return (hours + "h " + remainingTotalMinutes + "m " + remainingTotalSeconds + "s");
    }
    public static String getDurationString(int minutes, int seconds)
    {
        if (minutes < 0)
            return "Invalid Value";
        if (seconds < 0 || seconds > 60)
            return "Invalid Value";

        return getDurationString(minutes*60 + seconds);


    }

    public static void main(String[] args) {
        System.out.println(getDurationString(500,59));
    }
}
