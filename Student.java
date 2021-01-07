
public class Student{
	String Name;
	Integer Enroll;
	String Branch;
	Integer Age;
	String City;
	
	public static void main(String []args)
	{
		Student Parth = new Student();
		Parth.Name = "Jethwani Parth";
		Parth.Enroll = 7508;
		Parth.Branch = "Computer";
		Parth.Age = 20;
		Parth.City = "Porbandar";
		Student Dharmik = new Student();
		Dharmik.Name = "Dharmik Pajwani";
		Dharmik.Enroll = 7511;
		Dharmik.Branch = "Computer";
		Dharmik.Age = 20;
		Dharmik.City = "Bhavnagar";
		System.out.println("Parth Name is:-"+Parth.Name);
		System.out.println("Parth Enroll is:-"+Parth.Enroll);
		System.out.println("Parth Age is:-"+Parth.Age);
		System.out.println("Parth City is:-"+Parth.City);
		
	}
}
