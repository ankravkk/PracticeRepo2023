package Java8Practice;

import java.util.ArrayList;
import java.util.Comparator;

import org.w3c.dom.ls.LSException;

public class MainClass {
	public static void main(String[] args) {
    MaxSalaryEmployee maxSalaryEmployee = new MaxSalaryEmployee(1);
    MaxSalaryEmployee maxSalaryEmployee1 = new MaxSalaryEmployee(2);
    MaxSalaryEmployee maxSalaryEmployee2 = new MaxSalaryEmployee(90);
    MaxSalaryEmployee maxSalaryEmployee3 = new MaxSalaryEmployee(40);
 
     ArrayList< MaxSalaryEmployee> list = new ArrayList<>();
     list.add(maxSalaryEmployee);
     list.add(maxSalaryEmployee1);
     list.add(maxSalaryEmployee2);
     list.add(maxSalaryEmployee3);
     
      Integer integer =  list
    		  .stream()
    		  .sorted((x,y)->y.getSalary().compareTo(x.getSalary()))
    		  .skip(1)
    		  .findFirst()
    		  .get()
    		  .getSalary();
      
      
      
      
      System.out.print(integer);
     
     
     


	}
	
}
