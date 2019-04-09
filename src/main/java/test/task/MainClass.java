package test.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {


    public static void main(String[] args) {
        Integer age = 1;
        List<String> list = new ArrayList<String>();
        Student student = new Student(list, age);
        System.out.println("hash " + student.hashCode());
        Map<Student, String> studentHashMap = new HashMap<Student, String>();
        studentHashMap.put(student, "Some data");
        student.setAge(100);
        list.add("new contact");
        student.setContacts(list);
        System.out.println(studentHashMap.get(student));
        System.out.println(student.getContacts());

        System.out.println("hash " + student.hashCode());
    }
}
