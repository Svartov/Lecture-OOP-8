package sample;

import java.util.Comparator;

public class SortStudentsByLastName implements Comparator {

    public int compare(Object o1, Object o2) {

        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        String students1 = student1.getLastName();
        String students2 = student2.getLastName();

        if(students1.compareTo(students2)>0){
            return 1;
        }if(students1.compareTo(students2)<0){
            return -1;
        }

        return 0;
    }

}
