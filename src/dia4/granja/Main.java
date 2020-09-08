package dia4.granja;

import dia4.granja.animals.birdAnimals.*;
import dia4.granja.animals.stableAnimals.*;

import dia4.granja.scenes.Farm;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm();
        Cow pepe = new Cow("Pepe");
        Cow pepa = new Cow("Pepa");
        Horse jors = new Horse("Jors");
        Ox romualda = new Ox("Romualda");
        Ox ocs = new Ox("Ocs");
        Ox buey = new Ox("Buey");

        System.out.println(farm.stable1.addStableAnimal(pepe));
        System.out.println(farm.stable1.addStableAnimal(pepa));
        System.out.println(farm.stable1.addStableAnimal(jors));
        System.out.println(farm.stable1.addStableAnimal(romualda));
        System.out.println(farm.stable1.addStableAnimal(ocs));
        System.out.println(farm.stable1.addStableAnimal(buey));
        System.out.println(farm.stable2.addStableAnimal(buey));

        System.out.print(farm.stable1.getStableMembers());
        System.out.println("There are " + farm.stable1.getNumberOfCows() + " cows.");

        System.out.println();
        System.out.println();

        Chicken farfalda = new Chicken("Farfalda");
        Chicken caponata = new Chicken("Caponata");
        Turkey antonio = new Turkey("Vivaldi");

        System.out.println(farm.chickenCopp.addBird(farfalda));
        System.out.println(farm.chickenCopp.addBird(caponata));
        System.out.println(farm.chickenCopp.addBird(antonio));
        System.out.println(farm.chickenCopp.takeEggs(2));
        System.out.println(farm.chickenCopp.getChickenCoopMembers());
        System.out.println();
        System.out.println(farm.slaughterHouse.sacrifaceBird(farm.chickenCopp));
        System.out.println(farm.slaughterHouse.sacrifaceBird(farm.chickenCopp));
        System.out.println(farm.slaughterHouse.sacrifaceBird(farm.chickenCopp));
        System.out.println(farm.chickenCopp.getChickenCoopMembers());
        System.out.println(farm.slaughterHouse.sacrifaceBird(farm.chickenCopp));
        System.out.println(farfalda.isAlive());
        System.out.println(farm.chickenCopp.addBird(farfalda));

        System.out.println();
        System.out.println();

        Chicken rosa = new Chicken("Rosa");
        Cow florentino = new Cow("Florentino");
        Cow sancha = new Cow("Sancha");

        System.out.println(farm.stable2.addStableAnimal(florentino));
        System.out.println(farm.stable2.addStableAnimal(sancha));
        System.out.println(farm.stable2.carryToFold(florentino, farm.fold));
        System.out.println(farm.stable2.getStableMembers());
        System.out.println(farm.fold.getFoldMembers());
        System.out.println(farm.chickenCopp.addBird(rosa));
        System.out.println(farm.chickenCopp.carryToFold(rosa, farm.fold));
        System.out.println(farm.stable2.carryToFold(sancha, farm.fold));
        System.out.println(farm.fold.getFoldMembers());


    }
}
