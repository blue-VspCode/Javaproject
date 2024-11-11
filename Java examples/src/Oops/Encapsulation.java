package Oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee e =new Employee();
   e.setEmpId(2);
   int sum = e.getBasicsal()+e.getIncentive();
   System.out.println(e.getEmpId() + " "+e.getBasicsal()+" "+e.getIncentive()+" "+sum);
   
	}

}
class Employee{
	 private int EmpId;
	 private int basicsal=2000;
	   private int incentive=700;
	   
	
	   
	   
	public int getBasicsal() {
		return basicsal;
	}
	public void setBasicsal(int basicsal) {
		this.basicsal = basicsal;
	}
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	public int getEmpId()
	{
		return EmpId;
	}
	 
	public void setEmpId(int i)
	{
		this.EmpId=i;
	}
}