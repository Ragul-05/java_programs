package java_basics;

public class Advance_switch {
    String day = "TUE";
        
    // Advanced switch with expression and yield
    int dayNumber = switch (day) {
        case "MON", "TUE", "WED", "THU", "FRI" -> 1;   // Weekday
        case "SAT", "SUN" -> 2;                        // Weekend
        default -> {
            System.out.println("Invalid day: " + day);
            yield 0;  // Return 0 for invalid input
        }
    };

    String dayType = switch (dayNumber) {
        case 1 -> "Weekday";
        case 2 -> "Weekend";
        default -> "Unknown";
    };

    System.out.println("Day: " + day);
    System.out.println("Day Number: " + dayNumber);
    System.out.println("Day Type: " + dayType);
}

