package ClassObjectMethods;

public class Person {

    public void sayHello() {
        System.out.println("Inside Say Hello");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        //say hello belongs to P1 objects
        p1.sayHello();
    }
}
