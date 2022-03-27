package thursdayy;

public class Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Learning";
		String s2 = new String("Learning");
		if(s1.equals(s2)==true)
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	}

}
