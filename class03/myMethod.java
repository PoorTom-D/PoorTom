package pay_train_weekind.class03;

public class myMethod {
    public static void main(String[] args) {
        System.out.println(gg(1,2));
        System.out.println(gg(1));
        System.out.println(gg(1.58));
        jj();
    }
    public static int gg(int a,int b){
        return a+b+10086;
    }
    public static int gg(int a){
        return a+10086;
    }
    public static double gg(double a){
        return a+10086;
    }
    public static void jj(){
        System.err.println("啊哈！");
    }
}