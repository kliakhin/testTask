package test.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {


    public static void main(String[] args) {
        Integer age = 1;
        List<String> list = new ArrayList<>();
        Student student = new Student(list, age);
        Map<Student, String> studentHashMap = new HashMap<>();
        studentHashMap.put(student, "Some data");
    }
}
