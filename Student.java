class Student 
{
    String name;
    int rollno;
    String Branch;

    Student (String name, int rollno, String Branch)
    {
        this.name = name;
        this.rollno = rollno;
        this.Branch = Branch;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Branch: " + Branch);
    }
    public static void main(String args[])
    {
     Student s1=new Student("Rahul", 101 , "CSE");
     Student s2=new Student("Rohit", 102 , "ECE");
     s1.display();
     System.out.println();
     s2.display();  
    }
  
}