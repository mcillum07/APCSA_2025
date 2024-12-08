// this class ignores leap years
public class Date {

    private int month;
    private int day;
    // constructs the given month/day
    public Date(int m, int d)

    // returns the day
    public int getDay()

    // returns the month
    public int getMonth()

    // returns the number of days
    // in this date's month
    public int daysInMonth()

    // compares dates (true if same)
    public boolean equals(Date d)

    // modifies this date's state
    // forward in time by 1 day,
    // wrapping month/year if needed
    public void nextDay()

    // set month/date to given values
    public void setDate(int m, int d)

    /* return true if date that calls the method is before the one in brakcet
     * To be more specific: if month is smaller, it is earlier
     *                      if month is the same, we compare the days
     *                      if day is smaller, it is earlier
    */
    public boolean isBefore(Date d) {
    // this is not a mandatory thing to use
    // write your code here
        if (this.getMonth() < d.getMonth())
            return true;
        else if (this.getMonth() == d.getMonth()) {
            if (this.getDay() < d.getDay())
                return true;
        }
        return false;
    }

}