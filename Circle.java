public class Circle
{
public static void main(String[] args)
{
Circle circle1 = new Circle(); 
double Area=circle1.calculatearea(3.14,100);
System.out.println("find area"+" "+Area);
}
public double calculatearea(double pi,double radius) 
{
return pi*radius*radius; 
}
}

