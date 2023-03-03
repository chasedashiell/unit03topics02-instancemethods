public class Point2D {
    private double X;
    private double Y;

    public Point2D(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double x) {
        X = x;
    }
    public void setY(double y) {
        Y = y;
    }


    public double distanceTo(Point2D other){
        //x-x^2+y-y^2 but sqrt
        return Math.sqrt((other.X - this.X * other.X - this.X) + (other.Y - this.Y * other.X - this.X));
    }

    @Override
    public String toString() {
        return "(" + X + "," + Y + ")";
    }

    public static void main(String[] args) {
        Point2D orgin = new Point2D(0, 0);
        Point2D tenTen = new Point2D(10, 10);
        System.out.println(orgin.distanceTo(tenTen));
    }
}
