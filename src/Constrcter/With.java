package Constrcter;

public class With {

	int a;
	int b;
	With (int c,int d)
	{
		a=c;
		b=d;
	}
	public void m1()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void m2() {
		int multi=a*b;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		With x=new With(10,20);
		x.m1();
		x.m2();
	}
}
