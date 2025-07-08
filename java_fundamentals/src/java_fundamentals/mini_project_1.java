package java_fundamentals;

public class mini_project_1 {
    public static void main(String[] args) {
        // Array of employee data
        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        if (args.length == 0) {
            System.out.println("Please enter employee number");
            return;
        }

        int inputEmpNo = Integer.parseInt(args[0]);
        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == inputEmpNo) {
                found = true;
                String designation = "";
                int da = 0;

                switch (desigCode[i]) {
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                }

                int salary = basic[i] + hra[i] + da - it[i];

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empNo[i] + "\t" + empName[i] + "\t\t" + dept[i] + "\t" + designation + "\t" + salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + inputEmpNo);
        }
    }
}

//public class mini_project_1 {
//	static class Employee{
//		int EmpNo;
//		String Name;
//		String Department;
//		char Designationcode;
//		int Basic,Hra,It;
//		Employee(int EmpNo,String Name,char Designationcode,String Department,int Basic,int Hra,int It ){
//			this.EmpNo=EmpNo;
//			this.Name=Name;
//			this.Designationcode=Designationcode;
//			this.Department=Department;
//			this.Basic=Basic;
//			this.Hra=Hra;
//			this.It=It;
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		if(args.length==0) {
//			System.out.println("please provide an employee id");
//			return;
//		}
//		int searchId=Integer.parseInt(args[0]);
//		Employee employees[]= {
//			new Employee(1001,"Ashish",'e',"R&D",20000,8000,3000),
//			new Employee(1002,"Sushma",'c',"PM",30000,12000,9000),
//			new Employee(1003,"Rahul",'k',"Acct",10000,8000,1000),
//			new Employee(1004,"Chahat",'r',"Front Desk",12000,6000,2000),
//			new Employee(1005,"Ranjan",'m',"Engg",50000,20000,20000),
//			new Employee(1006, "Suman", 'e', "Manufactoring", 23000, 9000, 4400),
//			new Employee(1007,"Tanmay",'c',"PM",29000,12000,10000)
//			
//		};
//		String designation="";
//		int da=0;
//		Employee found=null;
//		for(Employee emp: employees) {
//			if(searchId==emp.EmpNo) {
//				found=emp;
//				break;
//			}
//		}
//		if(found==null) {
//			System.out.println("There is no employee with empid :"+searchId);
//			return;
//		}
//		
//		switch(found.Designationcode) {
//		case 'e':
//			designation="Engineer";
//			da=20000;
//			break;
//		case 'c':
//			designation="Consultant";
//			da=32000;
//			break;
//		case 'k':
//			designation="Clerk";
//			da=12000;
//			break;
//		case 'r':
//			designation="Receptionist";
//			da=15000;
//			break;
//		case 'm':
//			designation="Manager";
//			da=40000;
//			break;
//		default:
//			System.out.println("Invalid designation code");
//		}
//		int salary=found.Basic+found.Hra+da-found.It;
//		System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");
//		System.out.println(found.EmpNo+"\t"+found.Name+"\t\t"+found.Department+"\t"+designation+"\t"+salary);
//	}
//
//}



