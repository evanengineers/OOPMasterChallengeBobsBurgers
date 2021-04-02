package com.company;

public class Main {

    public static void main(String[] args) {
        BreadRollType brioche = new BreadRollType("Brioche");
        Meat turkey = new Meat("Turkey");
        Hamburger hamburger = new Hamburger(brioche, turkey);
        hamburger.addAddition(new Additions("Lettuce"));
        hamburger.addAddition(new Additions("Cheese"));
        hamburger.addAddition(new Additions("Tomato"));
        hamburger.addAddition(new Additions("Bacon"));

        hamburger.addAddition(new Additions("mayo"));

//        Additions addition1 = new Additions("Lettuce");
//
//      hamburger.addAddition(addition1)

        hamburger.getTotal();
        hamburger.make();

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addAddition(new Additions("Lettuce"));
        healthyBurger.addAddition(new Additions("raddish"));
        healthyBurger.getCountOfAdditions();
        healthyBurger.getTotal();
        healthyBurger.getPrice();
        healthyBurger.getCountOfAdditions();
        healthyBurger.getAddition1();
        healthyBurger.make();

        BreadRollType deluxeBread = new BreadRollType("Brioche");
        Meat deluxeMeat = new Meat("Beef");
        DeluxeBurger myDeluxe = new DeluxeBurger(deluxeBread, deluxeMeat, "Salt & Vineger", "Coke");
        myDeluxe.getPrice();


    }
}
