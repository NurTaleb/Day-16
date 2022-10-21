package recordandclasses;

public record PersonRecord(String name, int age, String favouritMovie) {

    //private static int NUMBER_OF_PEOPLE;

    public PersonRecord (int age, String favouritMovie) {
        this("Glenn", age, favouritMovie);
        //NUMBER_OF_PEOPLE++;
    }

    /*public PersonRecord(int age, String favouritMovie) {
        this(name, age, favouritMovie);
        NUMBER_OF_PEOPLE++;
    }*/

    /*public static int getNumberOfPeople() {
        return NUMBER_OF_PEOPLE;
    }*/


}
