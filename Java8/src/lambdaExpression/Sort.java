package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Sort {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("souvikchak","palash","rahul","ram","Das","Anjan Das Raybahadur");
		
		System.out.println("Sorting list according to  length");
		list.sort((String first, String second)->first.length()-second.length());
		list.forEach(l->System.out.println(l));
		
		System.out.println("Sorting list alphabatically");
		list.sort((String l1, String l2)->l1.compareTo(l2));
		list.forEach((String l)->System.out.println(l));
		
		System.out.println("Sorting list method reference");
		list.sort(String::compareTo);
		list.forEach(System.out::println);
		
		System.out.println("Sorting list in a reverse order");
		list.sort((l1,l2)->l2.compareTo(l1));
		list.forEach(System.out::println);
	}
}
