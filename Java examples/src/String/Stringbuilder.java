package String;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1= new StringBuilder("Pallavi");
		StringBuilder sb2= new StringBuilder("Pallavi");
		System.out.println(sb1==sb2);
		
		        sb1=sb1.append("sai");
				System.out.println(sb1==sb2);
				
				sb1.ensureCapacity(120);
				System.out.println(sb1.capacity());
				
	}

}
