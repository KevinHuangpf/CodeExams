public class Interval {
    private int left;
    private int right;

    public Interval(Interval interval) {
        this.left = interval.getLeft();
        this.right = interval.getRight();
    }

    public Interval(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public boolean isContain(int point) {
        if (point <= right && point >= left)
            return true;
        else
            return false;
    }

    public int getLeft() {
        return left;
    }
    public int getRight() {
        return right;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String toString(){
        return "[" + left + " , " + right + "]";
    }
}