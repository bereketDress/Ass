package week1.Assignment.lab3.p1;

import java.util.Objects;

// use composite rather than inheritance

public class PersonWithJob {
    private Person people;
    private double salary;

    public PersonWithJob(String name, double salary) {
        people = new Person(name);
        this.salary = salary;
    }

    public String getName() {
        return people.getName();
    }

    public double getSalary() {
        return salary;
    }

    public Person getPeople() {
        return people;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PersonWithJob p)) return false;
        return Double.compare(this.salary, p.salary) == 0 &&
                Objects.equals(this.people, p.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(people, salary);
    }

    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");

        System.out.println("p1.getPerson().equals(p2)? " + p1.getPeople().equals(p2)); // true
        System.out.println("p2.equals(p1.getPerson())? " + p2.equals(p1.getPeople())); // true

    }
}
