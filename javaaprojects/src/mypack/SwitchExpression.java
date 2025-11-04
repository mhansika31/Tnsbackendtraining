package mypack;

public class SwitchExpression {
    public static void main(String[] args) {
        int day = 3;

        // switch expression version
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number!";
        };

        System.out.println(dayName);
    }
}
