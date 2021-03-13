package com.company;

public class Person {
    //3. Create a method in the Person class which returns how another person's age compares.
    //Given the instances p1, p2 and p3, which will be initialised with the attributes name and age,
    // return a sentence in the following format:
    //{other person name} is {older than / younger than / the same age as} me.
    //Examples
    //p1 = Person("Samuel", 24)
    //p2 = Person("Joel", 36)
    //p3 = Person("Lily", 24)
    //p1.compareAge(p2) ➞ "Joel is older than me."
    //p2.compareAge(p1) ➞ "Samuel is younger than me."
    //p1.compareAge(p3) ➞ "Lily is the same age as me."
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String compareAge(Person person){
        String sentence;
        if (this.age < person.age)
            sentence = person.name + " is older than me.";
        else if (this.age > person.age)
            sentence = person.name + " is younger than me.";
        else
            sentence = person.name + " is the same age as me.";
        return sentence;
    }

}
