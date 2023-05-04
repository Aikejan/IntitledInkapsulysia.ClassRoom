import java.util.Scanner;
import java.util.stream.StreamSupport;

public class People {
    private String name;
    private String email;
    private int age;

    public People() {

    }

    public People(String name, String email, int age) {
        this.name = name;
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            System.out.println("Age can't be negativ namver");
        } else {
            this.age = age;
        }

    }
}



