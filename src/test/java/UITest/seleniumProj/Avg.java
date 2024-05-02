package UITest.seleniumProj;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {1,2,3,4,5,6,7,8};
		int total=0;
		for(int e:num)
		{
			total=total+e;
			
		}
     System.out.println(total);
     System.out.println(num.length);
     System.out.println(total/num.length);
	}

}
