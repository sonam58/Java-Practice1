interface InterfaceDemo {
	void show();

}
interface InterfaceDemo2{
	void display();
}
class Test implements InterfaceDemo, InterfaceDemo2
{
	public void show()
	{
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		Test t = new Test;
		t.show();
		t.display();
	}
}