package JAVA.Collection.Map;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumMap {
    public static void main(String[] args) {
        EnumMap<Days, String> schedule = new EnumMap<>(Days.class);
    }
}
