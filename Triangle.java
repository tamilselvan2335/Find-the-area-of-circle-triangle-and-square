public class Triangle
{
public static void main(String[] args)
{
Triangle triangle = new Triangle(); 
double Area=triangle.calculatearea(33.5,55);
System.out.println("find area"+" "+Area);
}
public double calculatearea(double b,int h) 
{
return (b*h)/2; 
}
}