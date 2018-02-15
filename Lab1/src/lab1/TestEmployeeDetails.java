package lab1;


public class TestEmployeeDetails {
    public static void main(String args[]){
        
        EmployeeDetails empJoe = new EmployeeDetails();
        
        empJoe.name = "Joe Soap";
        empJoe.age = 22;
        empJoe.address = "13 Tamarisk Walk Dublin 24";
        empJoe.position = "Programmer";
        empJoe.department = "I.T";
        empJoe.salary = 60000;
        
        empJoe.print();
        
        
        EmployeeDetails empMark = new EmployeeDetails();
        
        empMark.name = "Mark Chin";
        empMark.age = 33;
        empMark.address = "Forrest Avenue Kingswood";
        empMark.position = "Systems Analyst";
        empMark.department = "I.T";
        empMark.salary = 42000;
        
        empMark.print();
  
        if (empJoe.salary>empMark.salary)
        {
            System.out.println("Employee Joe has the largest salary ");
            empJoe.print();
        }
        else
        {
            System.out.println("Employee Mark has the largest salary ");
            empMark.print();
        }
    }
      
    
}
