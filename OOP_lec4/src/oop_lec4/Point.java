package oop_lec4;

public class Point {

    private float xcord;
    private float ycord;
    private static int fquad = 0; // counter to count number of point in first quadinate

    public Point(float a, float b) {
        xcord = a;
        ycord = b;
        if (a > 0 && b > 0) {
            fquad++;
        }

    }

    public void setx(float h) {
        if (xcord >= 0 && ycord >= 0 && h < 0) {
            fquad--;
        } else if (ycord >= 0 && xcord <= 0 && h > 0) {
            fquad++;
        }
        xcord = h;
    }

    public void sety(float h) {
        if (xcord >= 0 && ycord >= 0 && h < 0) {
            fquad--;
        } else if (ycord <= 0 && xcord >= 0 && h > 0) {
            fquad++;
        }
        ycord = h;
    }

    public float getx() {
        return xcord;
    }

    public float gety() {
        return ycord;
    }

    public Point addpoint(Point p) {
        Point r = new Point(0, 0);
        r.xcord = p.xcord + this.xcord;
        r.ycord = p.ycord + this.ycord;
        return r;

    }
    
    public float Distance(Point p)
    {
    return (float) Math.sqrt ( Math.pow(p.xcord-this.xcord,2) +Math.pow(p.ycord-this.ycord,2 )  );
    }
    public static int getfquad()
    {return fquad;}
    public static double getpowfquad(int n)
    {return Math.pow(fquad, n);}
    

}
