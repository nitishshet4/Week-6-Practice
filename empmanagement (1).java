/* import java.util.Scanner;
class InvalidSalaryException extends Exception{
    
}
class Employee{
private String name;
private double salary;
    public void addEmployee(String name, double salary) throws InvalidSalaryException{
        
        if(salary<20000){
            throw new InvalidSalaryException();
        }
        
        this.name=name;
        this.salary=salary;
        
        
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}
class Company{
    
    Employee[] employee=new Employee[10];
    int i=0;
    
    public void addEmployee(Employee emp){
        employee[i]=emp;
    }
    public void removeEmployee(String name){
        int count=0;
        for(int j=0;j<=i;j++){
            if(employee[i].getName().equals(name)){
                count++;
                employee[j]=employee[j+1];
            }
        }
        if(count>=1){
            System.out.println("Employee removed");
        }
        else{
            System.out.println("No Employee found with given name");
        }
    }
    public void displayEmployee(){
        System.out.println("Employees in Company");
        for(int j=0;j<employee.length;j++){
            if(employee[j] != null){
            System.out.println(employee[j].getName()+"     "+employee[j].getSalary());
            }
        }
    }
    
}
public class Main
{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company c=new Company();
        Employee emp=new Employee();
        int option=10;
        do{
            System.out.println("Enter 1 to addEmployee");
            System.out.println("Enter 2 to removeEmployee");
            System.out.println("Enter 3 to displayEmployee");
            System.out.println("Enter 0 to exit");
               
               option=sc.nextInt();
               switch(option){
                   case 1:{
                       sc.nextLine();
                       System.out.println("Enter employee name");
                       String name=sc.nextLine();
                       System.out.println("Enter employee salary");
                        double salary=sc.nextDouble();
                       try{
                          emp.addEmployee(name,salary);
                       }
                       catch(Exception e){
                          System.out.println(e);
                       }
                       
                       c.addEmployee(emp);
                       break;
                   }
                   case 2:{
                       sc.nextLine();
                       System.out.println("Enter employee name to remove");
                        String name=sc.nextLine();
                       c.removeEmployee(name);
                       break;
                   }
                   case 3:{
                       c.displayEmployee();
                       break;
                   }
                       
               }
               
               
        }while(option!=0);
        
        
        
        
        
    }
}
   */