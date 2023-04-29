/*
  Result:
  
  ************************************************
  Current Time: Sat 29 Apr 2023 11:44
  ************************************************
  ************************************************
*/

import java.time.LocalDateTime;

public class DateTimeTest {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("Current Time: " + returnTime());
        System.out.println("************************************************");
        System.out.println("************************************************");
    }

    static String returnTime() {
        var time = LocalDateTime.now();
        return convertDateElements(time.getDayOfWeek()) + " " +
                (appendZero(time.getDayOfMonth())) + " " +
                convertDateElements(time.getMonth()) + " " +
                time.getYear() + " " +
                time.getHour() + ":" +
                (appendZero(time.getMinute()));
    }

    static <T> String appendZero(T t) {
        try {
            var value = Integer.parseInt(String.valueOf(t));
            return (value < 10 ? "0" + value : String.valueOf(value));
        } catch (NumberFormatException ignored) { }

        return "";
    }

    static <T> String convertDateElements(T t) {
        var conversion = String.valueOf(t);
        conversion = conversion.substring(0, 3).toLowerCase();
        var firstLetter = conversion.substring(0, 1).toUpperCase();
        return firstLetter + conversion.substring(1);
    }
}
