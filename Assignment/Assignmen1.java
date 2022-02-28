import java.util.*; 

public class Assignment1

 { 

  public static void main(String args[])

   {

    int h=0,y=0,s=30;

    int r[]=new int[20];

    int a[]=new int[20];

    float c[]=new float[20];

    String n[]=new String[20];

    String p[]=new String[20];

    Scanner obj=new Scanner(System.in);

    for(int i=0;i<10;i++)

    { 

      System.out.println("Details of student "+(i+1));

      System.out.println("Enter Rollno.:");

      r[i]=obj.nextInt();

      System.out.println("Enter student's Name:");

      n[i]=obj.next();

      System.out.println("Enter student's phone number:");

      p[i]=obj.next();

      System.out.println("Enter Age:");

      a[i]=obj.nextInt();

      System.out.println("Enter CGPA:");

      c[i]=obj.nextFloat();

    }

    

    String str="ANU";

      for(int i=0;i<10;i++)

    { 

        if(c[i]>c[h])

          h=i;

        

        if(a[i]<a[y])

          y=i;

        

        if(n[i].equals(str))

          s=i;    

    }

    System.out.println("the student with highest CGPA is "+n[h]+" with CGPA of "+c[h]);

   

    if(s==30)

      System.out.println("there is no student named ANU");

    else

     System.out.println("the phone no. of ANU is : "+p[s]);

    

    System.out.println("the youngest student's rollno is "+r[y]+" of age "+a[y]);

    

    

   }

}
