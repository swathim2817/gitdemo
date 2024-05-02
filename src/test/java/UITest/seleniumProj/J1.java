package UITest.seleniumProj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		
		//Dynamically change the values,we can able to delete and update the values 
		ArrayList<String> s=new ArrayList<String>();
		s.add("swathi");
		s.add("vasu");
		s.add("jaswaik");
		System.out.println(s.get(2));
		for(String s1:s)
		{
			System.out.println(s1);
			
		}
		
		String[] s2= {"n1","n2","n3"};
		List<String>nl1=Arrays.asList(s2);
		System.out.println(nl1.contains("n1"));
		
		

	}

}
