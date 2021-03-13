package pay_train_weekind.class05;

class Persona
{
    private String name;
    public String getname()   {  return name;  }
    public void setname(String name)    {  this.name=name;  }
    public Persona(String name)  {  this.name=name;  }
    public Persona() {    }
    public void www() {  System.out.println("(～￣▽￣)～");  }
}
class Studenta extends Persona
{
    private String department;
    public void setdepartment(String newdepartment)   {  department=newdepartment;  }
    public String getdepartment()   {  return department;  }
    public Studenta()  {  super();  }
    public Studenta(String name)  {  super(name);this.www(); }
}
public class Demo02
{
    public static void main(String[] args)
    {
        Studenta s1=new Studenta();
        Studenta s2=new Studenta("||ヽ(*￣▽￣*)ノミ|Ю");
        s1.setname("张三");
        //s1.setdepartment("计算机系");
        System.out.println("姓名是"+s1.getname());
        //System.out.println(("系别是"+s1.getdepartment()));
        System.out.println("姓名是"+s2.getname());
    }
}
/* super();调用父类构造方法
   this();当前类的构造方法
 */