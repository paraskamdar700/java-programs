// public class constructor {

//     class teacher{
//         String name;
//         int rollno;

//        teacher(){
//         System.out.println("constructor invoked");
            
//         }


//     }
//     public static void main(String args[]) {
           
//     teacher obj=new teacher();
   
        

//     }

// }
//parametarised constructor and non paramaterised constructor;

public class construc{
  
  class Student{
    String name;
    int roll;
    Student(){
      System.out.println("consturctor invoked");
    }
    Student(String name){
     this.name=name;
    }
    Student(int roll){
      this.roll=roll;
    }
  }
  
  public void main(String[] args) {
    Student s1=new Student();   //Non parameterized 
    Student s2=new Student("Start today");//Parameterized 
    Student s3=new Student(99);
  
    
  }

  
}
