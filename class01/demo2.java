public class demo2{
	public static void main(String[] args){
		int a=1;//(2^31-1)~-2^31
		byte b=0;//127~-128//(2^7-1)~-2^7
		short c=0;//(2^15-1)~-2^15
		long d=21000000000l;//(2^63-1)~-2^63
		long now=System.currentTimeMillis();  
		int a8=010;//8进制
		int a16=0xf;//16进制
		System.out.println(now);
		System.out.println(a8);
		System.out.println(a16);
	}
}