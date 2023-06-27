/* import java.util.Scanner;
class Stud
  {
    int id,mrks,roll;
    String name,ads;
    String mbl;
  }
class School
  {
    Scanner s=new Scanner(System.in);
    Stud obj[]=new Stud[5];
    public void setDetails()
    {
      System.out.println("Enter how many stud do uh want to add");
      int a=s.nextInt();
      for(int i=0;i<a;i++)
        {
          System.out.println("Enter the data for student"+(i+1));
          Stud ob=new Stud();
          System.out.println("Enter id");
          int id=s.nextInt();
          for(int j=0;j<5;j++)
            {
              if(obj[j].id==id)
              {
               obj[i].id=id;
              }
            }
          System.out.println("Enter name");
          String name=s.next();
          if(name.length()<=2  && name.length()<=30)
          {
            for(int j=0;j<name.length();j++)
              {
            if((name.charAt(j)>='A' )|| (name.charAt(j)<='Z') ||(name.charAt(j)>='a') || (name.charAt(j)<='z'))
            {
              System.out.println(name);
            }
          }
        }
          System.out.println("Enter roll");
          int roll=s.nextInt();
          if(roll>0)
          {
            System.out.println(roll);
          }
          System.out.println("Enter mobile ");
          String mbl=s.next();
          if(mbl.length()==10)
          {
            for(int j=0;j<1;j++)
              {
                if(mbl.charAt(j)=='7'||mbl.charAt(j)=='8'||mbl.charAt(j)=='9'||mbl.charAt(j)=='6')
                {
                 System.out.println(mbl);
                }
    }
  }
          System.out.println("Enter marks");
          int mrks=s.nextInt();
          if(mrks>0 && mrks<=99)
          {
            System.out.println(mrks);
          }
          System.out.println("Enter address");
          String ads=s.nextLine();
          if(ads.length()>=5 && ads.length()<=100)
          {
            System.out.println(ads);
          }
        }
    }
    public void getDetails()
      {
       for(int i=0;i<obj.length;i++)
         {
           System.out.println("student id"+obj[i].id);
           System.out.println("student id"+obj[i].name);
           System.out.println("student id"+obj[i].roll);
           System.out.println("student id"+obj[i].mbl);
           System.out.println("student id"+obj[i].mrks);
           System.out.println("student id"+obj[i].ads);
         }
      }
    
      
public class NewStud
  {
    public static void main(String args)
    {
      School obj1=new School();
      obj1.setDetails();
      obj1.getDetails();
    }
  }
  }import java.util.Scanner;
class Stud
  {
    int id,mrks,roll;
    String name,ads;
    String mbl;
  }
class School
  {
    Scanner s=new Scanner(System.in);
    Stud obj[]=new Stud[5];
    public void setDetails()
    {
      System.out.println("Enter how many stud do uh want to add");
      int a=s.nextInt();
      for(int i=0;i<a;i++)
        {
          System.out.println("Enter the data for student"+(i+1));
          Stud ob=new Stud();
          System.out.println("Enter id");
          int id=s.nextInt();
          for(int j=0;j<5;j++)
            {
              if(obj[j].id==id)
              {
               obj[i].id=id;
              }
            }
          System.out.println("Enter name");
          String name=s.next();
          if(name.length()<=2  && name.length()<=30)
          {
            for(int j=0;j<name.length();j++)
              {
            if((name.charAt(j)>='A' )|| (name.charAt(j)<='Z') ||(name.charAt(j)>='a') || (name.charAt(j)<='z'))
            {
              System.out.println(name);
            }
          }
        }
          System.out.println("Enter roll");
          int roll=s.nextInt();
          if(roll>0)
          {
            System.out.println(roll);
          }
          System.out.println("Enter mobile ");
          String mbl=s.next();
          if(mbl.length()==10)
          {
            for(int j=0;j<1;j++)
              {
                if(mbl.charAt(j)=='7'||mbl.charAt(j)=='8'||mbl.charAt(j)=='9'||mbl.charAt(j)=='6')
                {
                 System.out.println(mbl);
                }
    }
  }
          System.out.println("Enter marks");
          int mrks=s.nextInt();
          if(mrks>0 && mrks<=99)
          {
            System.out.println(mrks);
          }
          System.out.println("Enter address");
          String ads=s.nextLine();
          if(ads.length()>=5 && ads.length()<=100)
          {
            System.out.println(ads);
          }
        }
    }
    public void getDetails()
      {
       for(int i=0;i<obj.length;i++)
         {
           System.out.println("student id"+obj[i].id);
           System.out.println("student id"+obj[i].name);
           System.out.println("student id"+obj[i].roll);
           System.out.println("student id"+obj[i].mbl);
           System.out.println("student id"+obj[i].mrks);
           System.out.println("student id"+obj[i].ads);
         }
      }
    
      
public class NewStud
  {
    public static void main(String args)
    {
      School obj1=new School();
      obj1.setDetails();
      obj1.getDetails();
    }
  }
  }   */