package streams;

public class Person {
    private String name;
    private String address;
    private String favoritCandy;
    private int age;

    public Person(String name, String address, String favoritCandy, int age) {
        this.name = name;
        this.address = address;
        this.favoritCandy = favoritCandy;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavoritCandy() {
        return favoritCandy;
    }

    public void setFavoritCandy(String favoritCandy) {
        this.favoritCandy = favoritCandy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
