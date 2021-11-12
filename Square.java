public class Square
{
public static void main(String[]args)
{
Square square1 = new Square();
int Area =square1.calculatearea(100);
System.out.println("find area = "+Area);
}
public int calculatearea(int l)
{

return l*l ;
}
}