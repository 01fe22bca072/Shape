public class Shapes{

    /**
     * The function calculates the area of a triangle given the base and height.
     * 
     * @param b1 The base length of the triangle.
     * @param h The parameter "h" represents the height of the triangle.
     * @return The method is returning the area of a triangle, which is calculated by multiplying the
     * base (b1) by the height (h) and dividing the result by 2.
     */
    public double triangle(double b1,double h)
    {
       return(0.5*b1*h);
    }

   /**
    * The function calculates the area of a rectangle given its length and breadth.
    * 
    * @param l The length of the rectangle.
    * @param b The parameter "b" represents the length of the rectangle.
    * @return The area of the rectangle is being returned.
    */
    public int rectangle(int l,int b)
    {
        return(l*b);
    }
    /**
     * The function calculates the area of a circle given its radius.
     * 
     * @param r The parameter "r" represents the radius of the circle.
     * @return The area of a circle with radius r.
     */
    public double circle(double r)
    {
        return(3.142*r*r);
    }
   /**
    * The function returns the square of a given float number.
    * 
    * @param a The parameter "a" is a float value that represents the number to be squared.
    * @return the value of the input parameter 'a'.
    */
    public float square(float a)
    {
        return (a);

    }

// The `public static void main(String[] args)` method is the entry point of the Java program. It is
// the method that is executed when the program is run.
public  static void main(String[] args)
{
    int res1;
    float res2;
    double res3;
    Shapes s1=new Shapes();
res1=s1.rectangle(2,3);
System.out.println("The area of rectangle is:" +res1);
res3=s1.triangle(2,3);
System.out.println("The area of triangle is:" +res3);
res3=s1.circle(2);
System.out.println("The area of circle is:" +res3);
res2=s1.square(4);
System.out.println("The area of square is:" +res2);
}    
}