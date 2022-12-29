package sample;

import java.util.Objects;

public class Human {

    private String name;
    private String lastName;
    private Gender gender;

    public Human(String name, String lastName, Gender gender){
        super();
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
    }

    public  Human(){
        super();
    }

    // Get

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public Gender getGender(){
        return  gender;
    }

    // Set

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && lastName.equals(human.lastName) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender);
    }


    // toString

    @Override
    public String toString(){
        return "[" + "Name = " + name + " LastName = " + lastName + " Gender = " + gender;
    }

}