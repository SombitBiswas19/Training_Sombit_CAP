package searching_and_sorting;

import java.time.LocalDate;
import java.util.Arrays;

public class StudentDriver {
    static void main(String[] args) {
        Student[] students={
            new Student(5,"Dinga","hamba@gamba.com","Male", LocalDate.of(2004,8,19)),
                new Student(1,"Dingi","ramba@gamba.com","Feale", LocalDate.of(2003,4,20)),
                new Student(14,"Punga","kamba@gamba.com","Male", LocalDate.of(2002,1,21)),
                new Student(2,"Pungi","damba@gamba.com","Female", LocalDate.of(2001,11,22)),
                new Student(9,"Nunga","pamba@gamba.com","Male", LocalDate.of(2000,9,23))
        };

        System.out.println(Arrays.toString(students));

        for(Student student:students)
        {
            System.out.println(student);
        }
        System.out.println("==========================");
        //java.lang.ClassCastException: class searching_and_sorting.Student cannot be cast to class java.lang.Comparable
        // (searching_and_sorting.Student is in unnamed module of loader 'app'; java.lang.Comparable
        // is in module java.base of loader 'bootstrap')
        //Arrays.sort(students);
        //After implementing compareTo method->
        Arrays.sort(students); //sort is calling internally compareTo method
        for(Student student:students)
        {
            System.out.println(student);
        }
        System.out.println("==========================");
        //using namecomparator class
        NameComparator namecomparator=new NameComparator();
        Arrays.sort(students,namecomparator);
        for(Student student:students)
        {
            System.out.println(student);
        }
    }
}
