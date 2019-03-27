
import java.util.ArrayList;
import java.util.Random;

import Classes.Pair;
import Classes.SLList;

public class RecReverse {
	public static void main(String[] args) {
		SLList<Integer> List = new SLList<>();
		
		for(int i = 0; i < 10; i ++) {
			List.addFirst(i);
		}
		
		System.out.print("The regular list is: ");
		System.out.println(List.toString());
		List.rev();
		System.out.print("The reversed list is: ");
		System.out.println(List.toString());
		

		SLList<Integer> List2 = new SLList<>();
		
		for(int i = 0; i < 10; i ++) {
			List.addFirst(i);
		}

		
		System.out.println("TESTING CONSECUTIVE INCREASING PAIRS METHOD");
		System.out.print("The regular list is: ");
		System.out.println(List2.toString());
		ArrayList<Pair<Integer>> arr = List2.CIPairs();
		System.out.println(arr.toString());
	}
	
	
	

}