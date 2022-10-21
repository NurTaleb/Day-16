package recordandclasses;

public class Main {
    public static void main(String[] args) {
        PersonClass talebClass = new PersonClass( "Taleb",  22, "Demon Slayer");
        PersonRecord talebClass2 =  new PersonRecord( "Taleb",  22, " Demon Slayer");

        PersonRecord talebRecord = new PersonRecord( "Taleb",  23,  "Demon Slayer");

        PersonClass glennCLass = new PersonClass( 45, " Glenn the Movie");


        System.out.println(talebClass);
        System.out.println(talebRecord);

        System.out.println(talebClass.hashCode());
        System.out.println(talebClass2.hashCode());

        System.out.println(talebRecord.hashCode());
    }
}
