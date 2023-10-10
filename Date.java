public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isCorrectDate() {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return day <= 31;
            case 4: case 6: case 9: case 11:
                return day <= 30;
            case 2:
                if (year % 4 == 0) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            default:
                return false;
        }
    }

    public void printDate() {
        System.out.println("Dátum: " + year + "." + String.format("%02d", month) + "." + String.format("%02d", day));
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
