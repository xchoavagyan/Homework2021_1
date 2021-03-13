package com.company;

public class Luke {
    //4. Luke Skywalker has family and friends. Help him remind them who is who.
    //Given a string with a name, return the relation of that person to Luke.
    //Darth Vader   ->   father
    //Leia    ->   sister
    //Han     ->   brother in law
    //R2D2    ->   droid
    //Examples
    //relationToLuke("Darth Vader") ➞ " Luke, I am your father. "
    //relationToLuke("Leia") ➞ " Luke, I am your sister. "
    //relationToLuke("Han") ➞ " Luke, I am your brother in law. "

    public void relationToLuke(String relative) {
        if (relative.equals("Darth Vader")) {
            System.out.println("Luke, I am your father");
        } else if (relative.equals("Leia")) {
            System.out.println("Luke, I am your sister");
        } else if (relative.equals("Han")) {
            System.out.println("Luke, I am your brother in law.");
        } else if (relative.equals("R2D2")) {
            System.out.println("Luke, I am your droid");
        } else
            System.out.println("It is not your relative, maybe it is your friend");
    }
}
