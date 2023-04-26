package Constrcter;

public class Without {
	int a;
	int b;     //varibal declaration 

Without(){
	 a=10;     //varibal initialization 
	 b=20;

}
public void m1() {
int sum =a+b;
System.out.println(sum);
}
public static void main(String[] args) {
	Without x=new Without();
	x.m1();

}
}

