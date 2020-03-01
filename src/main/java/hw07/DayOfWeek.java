package hw07;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    String string;

    DayOfWeek(String constr) {
        this.string=constr;
    }

    public String getString(){
        return this.string;
    }
}
