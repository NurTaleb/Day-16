package recordandclasses;

import java.util.Objects;

public class PersonClass {
    private static int NUMBER_OF_PEOPLE;
    private String name;
    private  final int age;
    private final String favouritMovie;


    //Constructor
    public PersonClass(String name, int age, String favouritMovie) {
        this.name = name;
        this.age = age;
        this.favouritMovie = favouritMovie;
        NUMBER_OF_PEOPLE++;
    }

    public PersonClass(int age, String favouritMovie) {

        this.name = "Taleb";
        this.age = age;
        this.favouritMovie = favouritMovie;
        NUMBER_OF_PEOPLE++;

    }

    //Getter and Setter
    public static int getNumberOfPeople() {
        return NUMBER_OF_PEOPLE;
    }

    public static void setNumberOfPeople(int numberOfPeople) {
        NUMBER_OF_PEOPLE = numberOfPeople;
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

    public String getFavouritMovie() {
        return favouritMovie;
    }

    //Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonClass that = (PersonClass) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(favouritMovie, that.favouritMovie);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, favouritMovie);
    }

    //toString
    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouritMovie='" + favouritMovie + '\'' +
                '}';
    }
}
