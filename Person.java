public class Person {
    String name;
    String race;
    Integer age;



    public Person(String name, String race, Integer age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }
    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }
}
