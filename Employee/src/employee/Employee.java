package employee;

/**
 * Lab 1 Week 10
 * @author conorgriffin
 */
public class Employee {

   private String Name;
   private String empNumber;
   private String hireDate;
   
   
public Employee(String NameIn, String empNumberIn, String hireDateIn){
    Name = NameIn;
    empNumber = empNumberIn;
    hireDate = hireDateIn;
    
    if (empNumberIn.charAt(0) != 'e' ){
        empNumberIn = "";
    }
    else{
        empNumber = empNumberIn;
    }
        
}

public Employee(){
    
    Name = " ";
    empNumber = " ";
    hireDate = " ";
    
    
}

//Getter Methods
public String getName(){
    return Name;
}
public String getEmpNumber(){
    return empNumber;
}    
public String getHireDate(){
    return hireDate;
}

//Setter Methods
public void setName(String n){
    Name = n;
}
public void setEmpNumber(String en){
    empNumber = en;
}
public void setHireDate(String hd){
    hireDate = hd;
}

public void print(){
    System.out.println("Name is: "+Name);
    System.out.println("Employee Number is : "+empNumber);
    System.out.println("Hire Date is: "+hireDate);
}
}
