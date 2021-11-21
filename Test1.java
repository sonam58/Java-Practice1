interface InterfaceDemo {
	void show();

}
interface InterfaceDemo2{
	void display();
}
class Test1 implements InterfaceDemo, InterfaceDemo2
{
	public void show()
	{
		System.out.println("1");
	}
	private void display()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		Test1 t = new Test1();
		t.show();
		t.display();
	}
}