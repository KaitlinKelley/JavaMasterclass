public class Point {

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double val = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(val);
    }

    public double distance(int x, int y){
        double val = ((this.x - x)*(this.x - x)) + ((this.y - y)*(this.y - y));
        return Math.sqrt(val);
    }

    public double distance(Point pointB){
        double val = ((this.x - pointB.x)*(this.x - pointB.x)) + ((this.y - pointB.y)*(this.y - pointB.y));
        return Math.sqrt(val);
    }
}
