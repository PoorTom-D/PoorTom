package pay_train_weekind.class05;

public class Demo03 {
    public static void main(String[] args) {
        Circle a=new Circle(7);
        Cylinder b=new Cylinder(7,7);
        System.out.println("圆的面积是 "+a.area()+" 圆柱的面积和体积分别是"+b.area()+"和"+b.volume());
    }
}
abstract class Shape
{
    int x,y;
    abstract double area();
    abstract double volume();
    //Shape(int newx,int newy)   {  this.x=newx;  this.y=newy;  }
}
class Circle extends Shape
{
    int radius;final float PI=3.14F;
    Circle(int r)   { this.radius=r; }
    double area()   {  return PI*radius*radius;  }
    double volume()   {  return 0;  }
}
class Cylinder extends Circle
{
    int height;final float PI=3.14F;
    Cylinder(int r,int h)   {  super(r);  this.height=h;  }
    double area()   {  return super.area()*2+PI*radius*height*2;  }
    double volume()   {  return PI*radius*radius*height;  }
}