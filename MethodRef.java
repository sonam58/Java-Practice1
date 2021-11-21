//Define a functional interface and refer a static method to its functional method.

interface addition{
	void add(int a, int b);
}

public class MethodRef{
	public static void add(int a,int b){
			System.out.println(a+b);
	}
	public static void main(String[] args){
		addition a = MethodRef::add;
		a.add(4,6);
	}

}
