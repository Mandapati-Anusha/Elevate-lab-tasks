import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CurdOperations{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Student> studentList=new ArrayList<Student>();
    public static void main(String args[]){
        CurdOperations obj=new CurdOperations();
        while(true){
        System.out.println("Choice the operation Add,View,Delete,Update!");
        String choice=sc.next().toLowerCase();     
        
        switch(choice){
            case "add":
                obj.addStudent();
                break;
            case "view":
                System.out.print("Enter the Id:");
                int id=sc.nextInt();
                obj.viewStudent(id);
                break;
            case "delete":
                obj.deleteStudent();
                break;
            case "update":
                obj.updateStudent();
                break;
            default:
                System.out.println("Nothing to choice");
        }
    }
 }
        public  void addStudent(){
            System.out.println("Adding a new student to the List");
            System.out.print("Enter the student_id:");
            int id=sc.nextInt();
            System.out.print("Enter the student_name:");
            String name=sc.next();
            System.out.print("Enter the student_marks:");
            int marks=sc.nextInt();
            studentList.add(new Student(id, name,marks));
            System.out.println("Student successfully added!");
        }
        public  void viewStudent(int id){
            for(Student s:studentList){
                if(s.getId()==id){
                   System.out.println("Student founded!");
                   System.out.println("Id:" +id);
                   System.out.println("Name:" +s.getName());
                   System.out.println("Marks:" +s.getMarks());
                }
                else{
                    System.out.println("Student not found!");
                }
            }  
        } 
        public  void deleteStudent(){
            System.out.print("Enter the student id for deleting the record:");
            int id=sc.nextInt();
            boolean found=false;
            Iterator<Student> iterator=studentList.iterator();
            while(iterator.hasNext()){
                Student s=iterator.next();
                if(s.getId()==id){
                    iterator.remove();
                    System.out.println("Student successfully deleted");
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student is not founded!");
                }
            
        }
        public void updateStudent(){
            System.out.println("Enter the student id for updating!");
            int id=sc.nextInt();
            boolean found=false;
            for(Student s:studentList){
                if(s.getId()==id){
                    System.out.println("Enter the updated name of a student:");
                    String newName=sc.next();
                    System.out.println("Enter the updated marks of a student:");
                    int newMarks=sc.nextInt();
                    s.setName(newName);
                    s.setMarks(newMarks);
                    System.out.println("Updated successfully!");
                    found=true;
                    break;
                }
            }
                if(!found){
                    System.out.println("Student not founded!");
                }
        }

}
