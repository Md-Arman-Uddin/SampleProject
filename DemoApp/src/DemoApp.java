
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10, 20, 30, 40};
		for(int ele: a) {
			System.out.println(ele);
		}
		
		String name = "Sachin";
		int count = name.toUpperCase().length();
		System.out.println("The length of the String is: " + count);
		
		StringBuffer sb = new StringBuffer("ViratKohali");
		int length = sb.append("INDRCB").length();
		System.out.println(length);

	}

}
