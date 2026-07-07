
// Address class
class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

// Student class (has an Address)
class Student {
    private String name;
    private int age;
    private Address address; // Composition

    public Student(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.address = new Address(city, country);
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        address.displayAddress();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Cabatay", 18, "Caloocan", "Philippines");
        student.displayStudent();
    }
}