//WAP Use predefined functional interface  to refer method : Here use BiFunction Interface and use apply() method.
import java.util.function.BiFunction;
class Arith{
	public static int show(int a, int b){
		return a+b;
	}
}
public class BiFunctionInterface1{
	

	public static void main(String[] args){
	BiFunction<Integer, Integer, Integer> b =Arith::show;
	int res = b.apply(6,10);
	System.out.println(res);
}
}