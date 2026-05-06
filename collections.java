import java.util.Collections;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer>CSE=new LinkedList<>();
	    CSE.add(10);
	    CSE.add(20);
	    CSE.addFirst(5);
	    CSE.addLast(15);
	    System.out.println("The elemets "+CSE);
	    Collections.sort(CSE);
	    System.out.println("Ascending collection "+CSE);
		Collections.sort(CSE,Collections.reverseOrder());
		System.out.println("Descending order"+CSE);
	}
}
