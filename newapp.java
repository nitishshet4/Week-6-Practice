/* import java.util.Scanner;
public class newapp
  {
    String name, dept, project;
    float salary;
    int id;
    int count=0;
    Employee e[];
    Scanner s=new Scanner(System.in);
    public void setDetails()
    {
     System.out.println("Enter the number of Employee details :");
     int n=s.nextInt();
     e=new Employee[n];
     for(int i=0;i<n;i++)
     {
     Employee em=new Employee();   
     System.out.println("Enter the Employee ID : ");
     em.setId(s.nextInt());
     System.out.println("Enter the Employee Name : ");
     em.setName(s.next());
     System.out.println("Enter the Employee Salary : ");
     em.setSalary(s.nextFloat());
     System.out.println("Enter the Employee Department : ");
     em.setDept(s.next());
     System.out.println("Enter the Employee Project : ");
     em.setProject(s.next());
     e[i]=em;
    }
    }
    public void searchId()
    {
      System.out.println("Enter the ID number of the employee to be searched ");
      int t=s.nextInt();
      for(int i=0;i<e.length;i++)
        {
          if((e[i].getId())==t)
                {
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("ID : "+e[i].getId());
                 System.out.println("Name: "+e[i].getName());
                 System.out.println("Salary: "+e[i].getSalary());
                 System.out.println("Department name : "+e[i].getDept());
                 System.out.println("Project name: "+e[i].getProject());
                 System.out.println();
                 }
                else
                 {
                   count++;
                 }
             }
          if(count==e.length)
          {
            System.out.println("Search valid name");
          }
    }
    public void searchSalary()
    {
      System.out.println("Enter the salary of the employee to be searched ");
      float t=s.nextFloat();
       for(int i=0;i<e.length;i++)
        {
          if((e[i].getSalary())>=t && (e[i].getSalary())< (t+10000))
          {
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("ID : "+e[i].getId());
                 System.out.println("Name: "+e[i].getName());
                 System.out.println("Salary: "+e[i].getSalary());
                 System.out.println("Department name : "+e[i].getDept());
                 System.out.println("Project name: "+e[i].getProject());
                 System.out.println();
           }
         }
    }
    public void displayDept()
    {
      System.out.println("Enter the Department of the employee to be displayed ");
      String t=s.next();
      for(int i=0;i<e.length;i++)
        {
          if((e[i].getDept()).equals(t))
          {
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("ID : "+e[i].getId());
                 System.out.println("Name: "+e[i].getName());
                 System.out.println("Salary: "+e[i].getSalary());
                 System.out.println("Department name : "+e[i].getDept());
                 System.out.println("Project name: "+e[i].getProject());
                 System.out.println();
                 }
                else
                 {
                   count++;
                 }
             }
          if(count==e.length)
          {
            System.out.println("Search valid department name");
          }
    }
    public void displayPro()
    {
      System.out.println("Enter the Project name of the employee to be displayed ");
      String t=s.next();
      for(int i=0;i<e.length;i++)
        {
          if((e[i].getProject()).equals(t))
          {
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("ID : "+e[i].getId());
                 System.out.println("Name: "+e[i].getName());
                 System.out.println("Salary: "+e[i].getSalary());
                 System.out.println("Department name : "+e[i].getDept());
                 System.out.println("Project name: "+e[i].getProject());
                 System.out.println();
                 }
                else
                 {
                   count++;
                 }
             }
          if(count==e.length)
          {
            System.out.println("Search valid Project name");
          }
    }
    public void deleteId()
    {
      System.out.println("Enter the ID number of the employee to be deleted");
      int t=s.nextInt();
      for(int i=0;i<e.length;i++)
        {
          if((e[i].getId())==t)
          {
            continue;
          }
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("ID : "+e[i].getId());
                 System.out.println("Name: "+e[i].getName());
                 System.out.println("Salary: "+e[i].getSalary());
                 System.out.println("Department name : "+e[i].getDept());
                 System.out.println("Project name: "+e[i].getProject());
                 System.out.println();
    }
    }
    public void update()
    {
      System.out.println("Enter the ID number of the employee to be updated");
      int t=s.nextInt();
      int opt=0;
      System.out.println("Enter the which has to be updated ");
      System.out.println("1.Name "+"2.Department Name "+" "+"3.Project Name ");
      String data=s.next();
      System.out.println("Enter the option number");
      opt=s.nextInt();
      for(int i=0;i<e.length;i++)
      {
      if(t==(e[i].getId()))
      {
      switch(opt)
        {
          case 1: e[i].setName(data);
                  break;
          case 2: e[i].setDept(data);
                  break;
          case 3:e[i].setProject(data);
                  break;
          case 4:System.out.println("Enter the salary ");
                 float salary=s.nextFloat();
                 e[i].setSalary(salary);
                 break;
          default:System.out.println("Enter valid option ");
                  break;
        }
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("ID : "+e[i].getId());
                 System.out.println("Name: "+e[i].getName());
                 System.out.println("Salary: "+e[i].getSalary());
                 System.out.println("Department name : "+e[i].getDept());
                 System.out.println("Project name: "+e[i].getProject());
                 System.out.println();
      }
      }
    }
    public void getDetails()
    {
       int opt=0;
             do
               {
             System.out.println("Choose the option");
             System.out.println("1.Search employee by ID ");
             System.out.println("2.Search employee whose salary is between certain range ");
             System.out.println("3.Display Employee Based on Department Name ");
             System.out.println("4.Display Employee Based on Project Name ");
             System.out.println("0.EXIT ");
             opt=s.nextInt();
             switch(opt)
               {
                 case 1:searchId();
                        break;
                 case 2:searchSalary();
                        break;
                 case 3:displayDept();
                        break;
                 case 4:displayPro();
                         break;
                 default: System.out.println("Enter valid option");
                        break;
               }
               }while(opt!=0);
    }
    public static void main (String args[])
    {
    Scanner s=new Scanner(System.in);
    NewApp obj=new NewApp();
    obj.setDetails();
    obj.getDetails();
    System.out.println("Do you want to delete Employee Based on Employee ID(true/false) ");
    boolean input=s.nextBoolean();
    if(input)
    {
    obj.deleteId();
    }
    System.out.println("Do you want to update Employee Based on Employee ID(true/false) ");
    boolean in=s.nextBoolean();
    if(in)
    {
    obj.update();
    }
  }   */
  