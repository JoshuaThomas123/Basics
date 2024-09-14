package basics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class questions {
	public static void main(String args[]) 
	{
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		Question6();
		Question7();
		Question8();
		Question9();
		Question10();
		Question11();
		Question12();
	}

	public static void Question1() {
		System.out.println("hello world");
		
		
	}
	public static void Question2() {
	int i=5;
	double a =6.555;
	String word= "hello";
	System.out.println(i);
	System.out.println(a);
	System.out.println(word);
		
	}
	public static void Question3() {
		int a =2;
		int b=1;
		if(a%2==0) {
			System.out.println("it is even");
			
		}
		else {
			System.out.println("it is odd");
		}
		
	}
	public static void Question4() {
		int a =4;
		switch (a) {
		case 1:
		System.out.println("1");
		break;
		case 2:
		System.out.println("2");
		break;
		case 3:
		System.out.println("W3");
		break;
		case 4:
		System.out.println("4");
		break;
		case 5:
		System.out.println("5");
		break;
		case 6:
		System.out.println("6");
		break;
		case 7:
		System.out.println("7");
		break;
		default:
		System.out.println("Invalid number");
		}
		
	}
	public static void Question5() {
		String[] names = {"Joshua","michael","Robert"};
		System.out.println(names[0]);
		
	}
	public static void Question6() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Michael");
	    names.add("Robert");
	    names.add(0, "Joshua");
	    names.remove(2);
	    System.out.println(names.get(1));
	}
	public static void Question7() {
		HashMap<String, String> names = new HashMap<String, String>();
		 names.put("Joshua", "20");
		    names.put("Michael", "35");
		    names.put("Robert", "50");
		    
		    names.get("Joshua");
		    names.remove("Joshua");
		    System.out.println(names);
		
	}
	public static void Question8() {
		HashSet<String> names = new HashSet<String>();
	    names.add("Joshua");
	    names.add("Michael");
	    names.add("Robert");
	  
	    names.contains("Michael");
	    names.remove("Joshua");
		
	}
	public static void Question9() {
		 LinkedList<String> names = new LinkedList<String>();
		    names.add("Joshua");
		    names.add("Michael");
		    names.add("Robert");  
		    System.out.println(names);
	}
	public static void Question10() {
		  Set<String> ts = new TreeSet<>();
		  ts.add("band");
	        ts.add("For");
	        ts.add("bands");
	        ts.add("100");
	        ts.add("1");
	        ts.add("10000");
		
	}
	public static void Question11() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek()); // Prints 2
		System.out.println(stack.pop()); // Removes and prints 2
	}
	public static void Question12() {
		Queue<String> queue = new LinkedList<>();
		queue.add("Joshua");
		queue.add("Michael");
		queue.add("Robert");

		System.out.println("Queue: " + queue);

		String front = queue.remove();
		System.out.println("Removed element: " + front);

		System.out.println("Queue after removal: " + queue);
		
	}






	

}
