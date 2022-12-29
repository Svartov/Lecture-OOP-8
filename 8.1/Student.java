package sample;

import java.util.Objects;

public class Student extends Human{

    private int id;
    private String groupName;

    public Student(String name, String lastName, Gender gender, int id, String groupName) {
        super(name, lastName, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public Student(String name, String lastName, Gender gender) {
        super(name, lastName, gender);
    }

    public Student() {
        super();
    }

    //  Get

    public int getId(){
        return  id;
    }

    public String getGroupName(){
        return groupName;
    }

    // Set

    public void setId(int id){
        this.id = id;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && groupName.equals(student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName);
    }


    // ToString

    @Override
    public String toString(){
        return  "[Name = " + getName() + ", Surname = " + getLastName() + ", ID = " + id + ", GroupName = " + groupName + ", Gender = " + getGender() + "]" ;
    }

}