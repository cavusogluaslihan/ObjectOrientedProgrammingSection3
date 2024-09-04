package com.example.objectorientedprogrammingsection3;

public class AnimalsOverrideMain {
    public static void main(String args[]){

        /*Animals a = new Animals();
        a.makeSound();
        AnimalsMammals m = new AnimalsMammals();
        m.makeSound(); // memeliler kendi metodu boş olduğu için bir üst(super) sınıfı çağırdı o nedenle 2 kez "I have no voice" yazdırdı
        AnimalsMammalsDog d = new AnimalsMammalsDog();
        d.makeSound();
        AnimalsMammalsCat c = new AnimalsMammalsCat();
        c.makeSound();*/

        Animals animal1 = new AnimalsMammalsCat();
        Animals animal2 = new AnimalsMammalsDog();
        Animals mammal1 = new AnimalsMammals();
        animal1.makeSound();
        animal2.makeSound();
        mammal1.makeSound();


    }
}
