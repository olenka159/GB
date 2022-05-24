import java.text.MessageFormat;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class employee {
    public String name;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

 public employee (String name, String post, String email, String phoneNumber, int salary, int age) {
 this.name = name;
 this.post = post;
 this.email = email;
 this.phoneNumber = phoneNumber;
 this.salary = salary;
 this.age = age;
 }
 public String employeeInfo() {
     String pattern = "name: {0}, post: {1}, email: {2}, phoneNumber: {3}, salary: {4}, age: {5}";
     return MessageFormat.format(pattern, this.name, this.post, this.email, this.phoneNumber, this.salary, this.age);
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


