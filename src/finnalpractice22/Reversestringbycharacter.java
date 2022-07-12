package finnalpractice22;

public class Reversestringbycharacter {
	
	public static void main(String[] args)
	{
		String a="mahesh salunkhe";
		for(int i=a.length()-1;i>=0;i--) {
			
			System.out.print(a.charAt(i));
		}
		System.out.println(a.length());
	}

}
