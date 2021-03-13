package pay_train_weekind.class06;
//正确使用类的静态成员变量格式——类名.静态成员变量(方法)名
public class Demo2 {
    public static void main(String[] args){
        A a2 =new A();
        A a3 =new A();
        System.out.println(a2.bb);//正确写法——System.out.println(a.bb);
        System.out.println(a3.bb);
        a2.bb-=111;
        System.out.println(a2.bb);
        System.out.println(a3.bb);
        A.staticOut();
        B b1=new B();

    }
}
