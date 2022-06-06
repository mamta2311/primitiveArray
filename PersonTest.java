/* PersonTest is a Java application for testing the Person class */

public class PersonTest
{

    // Class variables to hold sample test values
    //
    private static String[] testNames = {"Trulli", "Baumgartner", "Montoya",
            "Sato", "Coulthard", "Barrichello",
            "Schumacher", "Button", "Alonso",
            "Fisichella", "Bruni", "Webber" };
    private static int[] testAges = {40, 26, 29, 27, 32, 31, 32, 37, 28, 30, 32, 32};


    //
    // The main() method is the entry point of this class
    //
    public static void main(String[] args)
    {
        // Declare a variable capable of referencing an array of persons
        //
        Person[] people;




        // Create an array capable of referencing as many persons as there are
        // names defined in the 'testNames' array
        //
        people = new Person[testNames.length];


        // Fill the array with references to Person objects
        // (Use test values provided in class variables above)
        //
        for (int i = 0; i < testNames.length; i++) {
            people[i] = new Person(testNames[i], testAges[i]);
        }

        // Print out initial contents of array
        //
        System.out.println("\nThe original list of people is:\n");
        displayArray(people);

        // Sort array so that names are either in age
        // or alphabetical order
        //
        Person.bSortByName(people);

        // Print sorted contents of array
        //
        System.out.println("\nThe sorted list of people is:\n");
        displayArray(people);




    }


    private static void displayArray(Person[] people) {
        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + "\t" + people[i].getAge());
        }

        System.out.println();
    }

}