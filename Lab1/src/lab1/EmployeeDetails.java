package lab1;


public class EmployeeDetails {
//Class
    String name;
    int age;
    String address;
    String position;
    String department;
    double salary;

public void print(){
//Print details   
    System.out.println("Employee Details");
    System.out.println("Name is        : "+name);
    System.out.println("Age is         : "+age);
    System.out.println("Address is     : "+address);
    System.out.println("Position is    : "+position);
    System.out.println("Department is  : "+department);
    System.out.println("Salary is      : "+salary);
    System.out.println(" ");
    
}
//Getter Methods
public String getName(){
    return this.name;
}

public double getSalary(){
    return this.salary;
      
}



}

