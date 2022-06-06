/* Person is a class to represent a simple person */

public class Person
{
    private int age;
    private String name;



    public Person(String n, int a)
    {
        this.name = n;
        this.age = a;
    }





    // Method to get person's name
    //
    public String getName()
    {
        return name;
    }

    // Method to get person's age
    //
    public int getAge()
    {
        return age;
    }



    // Provide a compareTo() method similar to String.compareTo()
    //
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }

    // Provide a class method to sort persons in array by age
    // (use a simple bubble sort algorithm)
    //
    public static void bSortByAge(Person[] pers)
    {
        // Insert your code here

        for (int i = 0; i < pers.length - 1; ++i)
        {
            for (int j = i + 1; j < pers.length; ++j)
            {
                if (pers[i].getAge() > pers[j].getAge())
                {
                    Person temp = pers[i];
                    pers[i] = pers[j];
                    pers[j] = temp;
                }
            }
        }
    }

    // Provide a class method to sort persons in array by name
    // (use simple bubble sort algorithm)
    //
    public static void bSortByName(Person[] pers)
    {
        // Insert your code here

        for (int i = 0; i < pers.length - 1; ++i)
        {
            for (int j = i + 1; j < pers.length; ++j)
            {
//                if (pers[i].getName().compareTo(pers[j].getName()) > 0)
//                {
//                    Person temp = pers[i];
//                    pers[i] = pers[j];
//                    pers[j] = temp;
//                }

                if (pers[i].compareTo(pers[j]) > 0)
                {
                    Person temp = pers[i];
                    pers[i] = pers[j];
                    pers[j] = temp;
                }
            }
        }








    }


}