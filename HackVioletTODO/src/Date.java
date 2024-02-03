
public class Date {
    private int day;
    private int month;
    private int year;
    /**
     * constructor
     * @param month
     * @param day
     * @param year
     */
    public Date(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
