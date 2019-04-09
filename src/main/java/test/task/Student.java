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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (contacts != null ? !contacts.equals(student.contacts) : student.contacts != null) {
            return false;
        }
        return age != null ? age.equals(student.age) : student.age == null;
    }

    @Override
    public int hashCode() {
        int result = contacts != null ? contacts.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
