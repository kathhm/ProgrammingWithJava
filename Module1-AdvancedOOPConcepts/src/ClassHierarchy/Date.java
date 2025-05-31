package ClassHierarchy;

public class Date {
    int dd;
    int mm;
    int yy;

    public Date(int d, int m, int y) {
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }

    public String getDate() {
    return this.dd + "-" + this.mm + "-" + this.yy;
}

}