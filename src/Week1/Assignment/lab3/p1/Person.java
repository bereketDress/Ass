package week1.Assignment.lab3.p1;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
/*
equals() checks if objects are equal
hashCode() fast lookup & equal object have same hashCode()
 */
    @Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person p)) return false;
		return Objects.equals(this.name, p.name);

	}
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

