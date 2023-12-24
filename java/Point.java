
package oopsheet;


class Point {
  private double x;
  private double y;
  
  public void setPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
        * (p1.y - p2.y));
  }

  public double distance(Point p2) {
    return distance(this, p2);
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}