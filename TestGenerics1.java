public class TestGenerics1{
	public static void main(String[] args)
	{
		MyGen<Integer>m = new MyGen<Integer>();
		m.add(2);
		System.out.println(m.get());
	}
}