package sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];

    public  Group(String groupName, Student [] students){
        super();
        this.students = students;
        this.groupName = groupName;
    }

    public Group(){
        super();
    }

    // Get
    public String getGroupName(){
        return  groupName;
    }
    public Student[] getStudents(){
        return students;
    }

    // Set

    public  void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public void setStudent(Student[] students){
        this.students = students;
    }

    public void addStudent(Student student) throws GroupOverflowException{
        if(!studentInGroup(student)){
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    return;
                }
            }
        }
        throw new GroupOverflowException();
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getLastName().equals(lastName)){
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException();
    }

    public boolean removeStudentByID(int id){
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getId() == id){
                    students[i] = null;
                    return  true;
                }
            }
        }
        return  false;
    }

    public void sortStudentsByLastName(){
        Arrays.sort(students, Comparator.nullsFirst(new SortStudentsByLastName()));
        for(int i = 0; i < students.length; i++){
            System.out.println();
        }
    }

    public boolean studentInGroup(Student student){
        for(Student std : students){
            if(std != null && std.equals(student)){
                System.out.println("Student = " + student.getName() + "." + student.getLastName() + ", Already added to the group!");
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupName.equals(group.groupName) && Arrays.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(groupName);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString(){
        return "[" + "Students = " + Arrays.toString(students) + " GroupName = " + groupName + "]";
    }

}