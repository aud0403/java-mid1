package lang.immutable.test;

public class MyDate {

    private int yser;
    private int month;
    private int day;

    public MyDate(int yser, int month, int day) {
        this.yser = yser;
        this.month = month;
        this.day = day;
    }

    public void setYser(int yser) {
        this.yser = yser;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  yser + "-" + month + "-" + day ;
    }
}
