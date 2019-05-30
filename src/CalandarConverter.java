public class CalandarConverter {
    static int MONDAY = 1;
    static int TUESDAY = 2;
    static int WEDNESDAY = 3;
    static int THURSDAY = 4;
    static int FRIDAY = 5;
    static int SATURDAY = 6;
    static int SUNDAY = 7;

    static String convertDayToString(int dayNumber){

        switch(dayNumber){
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return "Number out of range!";
        }

    }
}
