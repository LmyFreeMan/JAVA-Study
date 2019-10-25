package bean_demo;

import java.time.LocalDate;

public abstract class Person
{
    public abstract String getDescription();
    private String name;

    @Override
    public String toString() {
        return getClass().getName()+"Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public static void main(String[] args) {
        Person[] people = new Person[2];
        LocalDate today = LocalDate.now();
        // fill the people array with Student and Employee objects
        people[0]=new Employee("Harry Hacker", 50000,today);
        people[1]=new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
