package test.task;

import java.util.List;

public class Student {

    private List<String> contacts;

    private Integer age;

    public Student(List<String> contacts, Integer age) {
        this.contacts = contacts;
        this.age = age;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
