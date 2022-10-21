package streams;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Mainmetod för Streams
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    /**
     *
     * Explaning how to print out people adresses using a for loap instead of stream
     *
     * @param people is a list of {@link Person} Person generated from a JSON-file
     * @author Taleb
     */


    private static void stepTwoFor(List<Person> people) {
        for(Person person : people){
            if (person.getAge() > 10) {
                System.out.println(person.getName() + " är älder än 10");
            }
        }

    }

    /**
     *
     * @param people
     */
    private static void stepThreeFor(List<Person> people) {
        for(Person person : people) {
            if (person.getAge() > 10 && person.getAge() > 45) {
                if(person.getName() != null) {
                    if(person.getName().startsWith("T"))  {
                        System.out.println(person.getAddress());

                    }
                }
            }
        }
    }

    private static void stepFourFor (List<Person> people ) {
        for(Person person : people) {
            if (person.getAge() > 30){
                if (person.getName() != null) {
                    if (person.getName().startsWith("s")) {
                        System.out.println(person.getAddress());
                    }
                }
            }
        }
    }

    private static void stepThreeStream (List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 10 && person.getAge() < 45)
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("T"))
                .map(person -> person.getAddress())
                .forEach(System.out::println);
    }
    private static void stepFourStream (List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 10 && person.getAge() < 23)
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("T"))
                .map(person -> person.getAddress())
                .forEach(System.out::println);
    }



    private static void stepTwoStream (List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 10)
                .forEach(person -> System.out.println(person.getName() + " är äldre än 10"));

    }

    private static void stepTwoStream(){

    }
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Person> people = List.of(mapper.readValue(Paths.get("src/main/java/streams/people.json").toFile(), Person[].class));

        for(Person person : people) {
            System.out.println(person.getName());

            //stepTwoFor(people);
            System.out.println("----------");
            //stepTwoStream(people);
            System.out.println("----------");
            //stepThreeFor(people);
            //stepThreeStream(people);

            stepFourFor(people);
            stepFourStream(people);

        }
    }
}
