package Oops;

public class Inheritance extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Inheritance obj1=new Inheritance();
      obj1.sum(1,2);
        
	}

}

class Addition
{
	  void sum(int a, int b)
      {
		  int c=a+b;
      System.out.println("sum="+c);
      }
	}
