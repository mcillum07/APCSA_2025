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
    public void nextDay() {
        
    }

    // set month/date to given values
    public void setDate(int m, int d)

    /* return true if date that calls the method is before the one in brakcet
     * Step 1: Write something to compare the months. I want to compare if (this)'s' month is less than d's month
     * Step 2:
     *         
    */
    public boolean isBefore(Date d) {
    // this is not a mandatory thing to use
    // write your code here
    // DON'T FORGET () AFTER METHODS
        if (this.getMonth() < d.getMonth()) {
            return true;
        } else if (this.getMonth() == d.getMonth()){
            if (this.getDay() < d.getDay()) {
                return true;
            }
        }
        return false;
    }
}