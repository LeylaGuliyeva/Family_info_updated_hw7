package Hw7;

import java.sql.SQLOutput;

final public class Man extends Human {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, byte iq, String schedule[][],Family fam, Pet pet) {
        super(name, surname, year, iq, schedule,fam, pet);
    }

    public Man() {
        super();
    }

    @Override
    public void greetPet() {
        System.out.printf("Hi buddy :  %s\n", this.pet);
    }

    void football() {
        System.out.println("My favourite team is Real Madrid");
    }
}
