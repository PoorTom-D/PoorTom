public class demo5{
	public static void main(String[] args){
		int a=11;//0000 1011
		a=a >>2;//0000 0010
		System.out.println(a);//2
		a=-11;
		int b=a>>1;
		int c=a>>>1;
		System.out.println(b);//-6
		System.out.println(c);//2147483642
		double d=a>10 ? 3.14:4.13;// true->zhi1(3.14)，false->zhi2(4.13)
		System.out.println(d);
	}
}