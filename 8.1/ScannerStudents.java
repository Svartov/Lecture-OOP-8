package sample;

import java.util.Scanner;

public class ScannerStudents {

    public static Student ScannerStudents(){

        Student student = new Student();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student Name: ");
        student.setName(in.nextLine());

        System.out.print("Enter student Surname: ");
        student.setLastName(in.nextLine());

        System.out.print("Enter student Gender(Man or Women): ");
        String gender = in.nextLine();

        if(gender.equals("Man") || gender.equals("man") ){
            student.setGender(Gender.Man);
        }else if(gender.equals("Women") || gender.equals("women")){
            student.setGender(Gender.Women);
        }else{
         System.out.println("Error");
        }

        System.out.print("Enter student GroupName: ");
        student.setGroupName(in.nextLine());

        System.out.print("Enter student ID: ");
        student.setId(in.nextInt());

        return student;
    }
}
