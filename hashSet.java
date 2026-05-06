import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
		HashSet<Integer>ai=new HashSet<>();
		ai.add(2);
		ai.add(20);
		ai.add(15);
		ai.add(2);
		System.out.println("The element removed is "+ai.remove(2));
		System.out.println("The element is present/absent " +ai.contains(20));
		System.out.println(ai);
	}
}
