import java.util.*;

public class TestGenerics{
	public static void main(String[] args){
			ArrayList <String> list = new ArrayList <String>();
			list.add("This");
			list.add("is");
			list.add("Generics");
			
			String s = list.get(1);
			System.out.println(s);
			Iterator <String> itr = list.iterator();
			
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			
		}
	}
