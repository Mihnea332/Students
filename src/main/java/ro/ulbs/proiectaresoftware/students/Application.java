package ro.ulbs.proiectaresoftware.students;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main() {
        Student s1 = new Student(112, "Ioan", "Popa", "TI21/1");
        Student s2 = new Student(112, "Maria", "Oprea", "TI21/1");
        Student s3 = new Student(120, "Alis", "Popa", "TI21/2");
        Student s4 = new Student(122, "Mihai", "Vecerdea", "TI22/1");
        Student s5 = new Student(122, "Eugen", "Uritescu", "TI22/2");
        System.out.println("numar matricol      prenume   nume   formatiDeStudiu");

        List<Student> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);
        studenti.add(s5);
        for (Student s : studenti) {
            System.out.println(s.toString());
        }

        for (Student s : studenti) {
if(s.compare(new Student(120, "Alis", "Popa", "TI21/2"))){ System.out.println("Exista");break;}
if(s.compare(new Student(112, "Maria", "Popa", "TI21/1"))){ System.out.println("Exista");break;}
        }
    }
}
