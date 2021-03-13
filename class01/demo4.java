package pay_train_weekind.class01;

public class demo4{
	public static void main(String[] args){
		int a=3/2;// 1
		double j=3.0/2;// 1.5
		double k=5.0%3;// 2.0
		System.out.println("a="+a);
		System.out.println("j="+j);
		System.out.println("k="+k);
		byte b=2,b1=127;
		byte c=b++;
		System.out.println("6 & 9="+(6 & 9));// 1&1=1  1&0=0  0&0=0
		System.out.println("6 | 9="+(6 | 9));// 1|1=1  1|0=1  0|0=0
		System.out.println("6 ^ 9="+(6 ^ 9));// 1^1=0  1^0=1  0^0=0
		int x=4,y=9;
		System.out.println("x++> 4 && --y <=8 "+(x++> 4 && --y <=8));
		System.out.println("x="+x);
		System.out.println("y="+y);
		x=4;y=9;
		System.out.println("x++> 4 & --y <=8 "+(x++> 4 & --y <=8));
		System.out.println("x="+x);
		System.out.println("y="+y); //0110 1001
	}
}