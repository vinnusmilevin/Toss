package com.mphsis.demonew;

public class Mainclass {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
				
		
		//Employee empnew=new Contract();
		String employee="Intern";
				
		Employee emp=new HR().recruit(employee);
	    new Finance().processSalary(emp);
	}

}
#############
Hr Class

package com.mphsis.demonew;

public class HR {
	
	
	public Employee  recruit(String emp) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		Employee obj = (Employee) Class.forName("com.mphsis.demonew."+emp).newInstance();
		/*
		 * if(emp instanceof Confirmed) { obj=new Confirmed();
		 * 
		 * }else if(emp instanceof Intern) { obj=new Intern();
		 * 
		 * } else if(emp instanceof Contract) { obj=new Contract();
		 * 
		 * }
		 */
		return obj;
	}

}




######
Finance class
package com.mphsis.demonew;

public class Finance {
	
	public void processSalary(Employee emp) {
		
		Employee emp1=emp;
		emp1.netpay();
		emp1.empid();
		emp1.empName();
		
	}

}




#############
Employee

package com.mphsis.demonew;

abstract class Employee {
	
	public String company="Mphasis";
	
	
	public abstract void netpay();
	
    public abstract void empName();
    
    public abstract void empid();

	public String getCompany() {
		return company;
	}
	

}
##############
Confirmed
package com.mphsis.demonew;

public class Confirmed extends Employee {

	@Override
	public void netpay() {
		int salary=10000;
		System.out.println("Confirmed=>"+salary);
		
	}

	@Override
	public void empName() {
		System.out.println("Confirmed employee");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empid() {
		
		System.out.println("Confirmed emp id");
		// TODO Auto-generated method stub
		
	}

}
########
contract
package com.mphsis.demonew;

public class Contract extends Employee{

	@Override
	public void netpay() {
		int salary=2500;
		System.out.println("Contract Salary=>"+salary);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empName() {
		System.out.println("Contract employee");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empid() {
		
		System.out.println("Contract emp id");
		// TODO Auto-generated method stub
		
	}

}

####
intern
package com.mphsis.demonew;

public class Intern extends Employee {

	@Override
	public void netpay() {
		
		int salary=5000;
		System.out.println("Intern Salary=>"+salary);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empName() {
		System.out.println("Intern employee");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empid() {
		
		System.out.println("Intern emp id");
		// TODO Auto-generated method stub
		
	}

	

}
