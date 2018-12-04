/*
CSC 142
Justin Byun No partner at this time
HW#08 Last updated 11/18
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

public class Line {
	// arbtrarily x1 y1 are starting point and x2 y2 are ending point
	private int x1;
	private int x2;
	private int y1;
	private int y2;

	private double slope;
	private double length;

	public Point(int x1, int y1, int x2, int y2, double slope, double length) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.slope = slope;
		this.length = length;
	}

  public double getSlope() {
		if (this.x1 == this.x2) {
			throw new IllegalArgumentException();
		}
		return (p2.y-p1.y)/(p2.x-p1.x);
	}
	public String toString() {
		return "The slope is: " + getSlope();
	}
}
