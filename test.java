interface I1
{
	//public static final int a=10;
	void show();  //public abstract type
	
}
public class test implements I1
{
	private void show()
	{
		System.out.println("1");
	}
	public static void main(String[] args)
	{
		test t =new test();
		t.show();
	}
}
