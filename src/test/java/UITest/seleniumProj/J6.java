package UITest.seleniumProj;

public class J6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="good girl swathi";
		String[] s1=s.split("girl");
		System.out.println(s1[0]);
		System.out.println(s1[1].trim());
		for(int i=s.length()-1;i>0;i--)
		{
			System.out.println(s.charAt(i));
			
		}
//		
		
//		for(int i=0;i<s.length();i++)
//		{
//			System.out.println(s.charAt(i));
//			
//		}

	}

}
