//WAP use predefined functional interface runnable.

public class MethodRef1{
	public static void run(){
		System.out.println("predefined runnable interface");
	}
	public static void main(String[] ags){
	Runnable r = MethodRef1::run;
	r.run();
	}
}