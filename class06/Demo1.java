package pay_train_weekind.class06;
//静态成员（方法）属于类，并不属于具体对象；静态成员方法中不能直接调用普通成员变量（方法），但普通成员方法直接使用静态成员（方法）
//正确使用类的静态成员变量格式——类名.静态成员变量(方法)名
public class Demo1 {
  public static void main(String[] args){
   A a1 =new A();
   A a4=new A(6969);
   System.out.println(a1.getAa());
   a1.setAa(33);
   System.out.println( a1.getAa());
  }
}

class A {
    private int aa=22;
    static int bb,cc;
    {  System.out.println("啊~A类的构造方法被执行了。");  }//代码块——属于对象-创建几个对象就调用几次——给成员变量初始化（提取构造方法中公共的部分）——在构造方法使用前执行
    static{
        bb=666;
        cc=222;
        System.out.println("啊~A类的静态代码块被执行了。");
    }//静态代码块——属于类——只加载和执行一次——给类成员信息初始化

    static void staticOut(){
    System.out.println("bb="+bb+cc);
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    A(int i) {
        this.aa=i;
        System.out.println("A类的有参构造方法");
    }

    A() {
     System.out.println("A类的无参构造方法");
    }
}

class B extends A {
    {  System.out.println("啊~B类的构造方法被执行了。");  }
    static{
        System.out.println("啊~B类的静态代码块被执行了。");
    }
  B(){
      System.out.println("B类的无参构造方法");
  }
}