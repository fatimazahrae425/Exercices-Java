package tp3;

class Point {
	
	private double x;
	private double y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void deplacer(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double distanceOrigine() {
		return Math.sqrt(x * x + y * y);
	}
	
	public String toString() {
		return "Point { x: " + x + " | y: " + y + " }";
	}
}

public class Ex1 {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        p2.deplacer(1, 2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Distance origine p2 = " + p2.distanceOrigine());
    }
}
