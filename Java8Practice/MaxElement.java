package Java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElement {
	
	
	public String maxElement(List<String> inpuList) {
		String conString = inpuList.stream().max(Comparator.comparingInt(String::length)).get();		
		return conString;
	}
	
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>(Arrays.asList("Geeks","for","AnkitGeeks"));
	
		
		
	}

}
