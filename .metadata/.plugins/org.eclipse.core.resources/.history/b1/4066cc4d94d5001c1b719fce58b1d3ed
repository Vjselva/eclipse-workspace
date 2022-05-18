package PojoUsingArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		 ArrayList<Employee2> employee = new ArrayList<>(); 
		  
		  String str="";
		  int empId=101;
		  do
			{
				Employee2 emp=new Employee2();
				str=sc.nextLine();
				String[] names = str.split(" ");
				
				//boolean iflag=true;
				if(names.length>1)
				{
					
						emp.setEmpId(empId++);
						emp.setName(names[0]);
						emp.setAge(Integer.parseInt(names[1]));
						emp.setSalary(Long.parseLong(names[2]));
						emp.setAddress(names[3]);
						employee.add(emp);
					
				}
			}while(!(str.equals("END")));
		  
		  for(Employee2 obj:employee) { 
			  System.out.println("Name: "+obj.getName());
			  System.out.println("EmpID: "+obj.getEmpId());
			  System.out.println("Age: "+obj.getAge());
			  System.out.println("Salary: "+obj.getSalary());
			  System.out.println("Address: "+obj.getAddress()); }
		  
		  String Fname=sc.next(); 
		  for(Employee2 obj:employee) 
		  {
		     if(obj.getName().equals(Fname)) { 
		    	 System.out.println(obj.toString());
		    	 } }
		  
		  int EID=sc.nextInt(); 
		  for(Employee2 obj:employee) 
		  {
		     if(obj.getEmpId()==(EID)) { 
		    	 System.out.println(obj.toString());
		    	 } }

		  
		  
		 

	}

}
