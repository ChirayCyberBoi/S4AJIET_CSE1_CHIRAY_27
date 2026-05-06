
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) {
		TreeSet<Integer>ai=new TreeSet<>();
		ai.add(2);
		ai.add(20);
		ai.add(15);
		ai.add(2);
		System.out.println("Elements "+ai);
		System.out.println("Size "+ai.size());
		System.out.println(ai.contains(20));
		System.out.println(ai);
	}
}
