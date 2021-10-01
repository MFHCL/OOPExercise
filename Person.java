package Training;

public class Person {
    private String name;
    private int age;
    private double shoeSize;

    public Person(String name, int age, double shoeSize) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    private void walking(){
        System.out.println(name+" "+age+" "+shoeSize+" is walking");

    }

    public void startWalking(){
        walking();

    }
}
class DriverClass{
    public static void main(String[] args) {
        Person person1 = new Person("Alex",26,9.5);

        person1.startWalking();
    }
}
