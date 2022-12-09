package ClassObjectMethods;

public class Person {

    private String middleName = "Rahi";

    public void sayHello() {
        System.out.println("Inside Say Hello");
    }

    public void saySomething(String message) {
        System.out.println("Inside Say Something " + message);
    }

    public char getMiddleInitial(){
        return middleName.charAt(0);
    }

    int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        //System.out.println(p1);
        //say hello belongs to P1 objects
        p1.sayHello();
        p1.saySomething("Hey print this message");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.sum(2,3));
    }
}
