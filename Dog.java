package Training;

public class Dog {
    String name;
    int age;
    int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    public void showExcitement(){
        System.out.println(name + " is wagging their tail");
    }
    public void showExcitement(int levelOfExcitement){
        System.out.println(name + " is wagging their tail their excitement level is "+ (levelOfExcitement));
        System.out.println();
    }

    public void eating(){
        System.out.println(name + " is eating");
    }
    public void eating(String food){
        System.out.println(name + " is eating " + food);
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class DogTest{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Butch",3,25);
        Dog dog2 = new Dog("Tee",5,15);

        System.out.println(dog1);
        System.out.println(dog2);
        dog1.showExcitement();
        dog2.showExcitement();
        dog1.showExcitement(5);
        dog2.showExcitement(10);
        dog1.eating();
        dog2.eating();
        dog1.eating("Hamburger");
        dog2.eating("Dog Food");
    }
}
