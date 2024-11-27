package String;
//import java.util.*;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1= new StringBuffer("Pallavi");
		StringBuffer sb2= new StringBuffer("Pallavi");
		System.out.println(sb1==sb2);
		
		        sb1=sb1.append("sai");
				System.out.println(sb1==sb2);
				

	}

}
