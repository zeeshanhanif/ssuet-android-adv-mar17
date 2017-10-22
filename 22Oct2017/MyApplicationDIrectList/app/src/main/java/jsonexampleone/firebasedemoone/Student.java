package jsonexampleone.firebasedemoone;

/**
 * Created by Ishaq Hassan on 10/22/2017.
 */

public class Student {
    String name;
    String email;
    String phone;
    String key;
    int age;

    public Student() {
    }


    public Student(String name, String email, String phone, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
        //return (st.name.equals(name) && st.email.equals(email) && st.age == age);
        return (st.key.equals(key));
    }
}
