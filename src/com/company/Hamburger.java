package com.company;

import java.sql.SQLOutput;

public class Hamburger {

    private BreadRollType breadRollType;
    private Meat meat;
    private double price;
    private int countOfAdditions;

    private Additions addition1;
    private Additions addition2;
    private Additions addition3;
    private Additions addition4;

    public Hamburger(BreadRollType breadRollType, Meat meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 3.0;
        this.countOfAdditions = 0;
    }

    public void addAddition(Additions addition) {
        if(countOfAdditions >= 4) {
            System.out.println("No more additions can be added at this time. The limit is 4");
        }else if (countOfAdditions == 0) {

            countOfAdditions ++;
            this.price += addition.getPrice();  // refactor this duplicated logic later
            setAddition1(addition);

        }else if (countOfAdditions == 1) {

            this.countOfAdditions += 1;
            this.price += addition.getPrice();
            setAddition2(addition);

        }else if(countOfAdditions == 2) {

            this.countOfAdditions += 1;
            this.price += addition.getPrice();
            setAddition3(addition);

        }else {
            this.countOfAdditions += 1;
            this.price += addition.getPrice();
            setAddition4(addition);
        }
    }

    public Meat getMeat() {
        System.out.println(this.meat.getName());
        return meat;
    }

    public BreadRollType getBreadRollType() {
        System.out.println(this.breadRollType.getBreadType());
        return breadRollType;
    }

    public double getPrice() {
        System.out.println(this.price);
        return price;
    }

    public String make() {
        System.out.println("Hamburger .make called.");
        return "hamburger .make called.";
    }

    public void setAddition1(Additions addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(Additions addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(Additions addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(Additions addition4) {
        this.addition4 = addition4;
    }

    public Additions getAddition1() {
        return addition1;
    }

    public Additions getAddition2() {
        return addition2;
    }

    public Additions getAddition3() {
        return addition3;
    }

    public Additions getAddition4() {
        return addition4;
    }

    public void getTotal() {
        System.out.println("You order: ");
        System.out.println(this.meat.getName() + " burger");
        System.out.println(this.breadRollType.getBreadType() +" Bun");
        System.out.println();
        System.out.println("Additions: " + '\n');
        switch (this.countOfAdditions) {  //refactor this later maybe by looping through a list of additions
            case 1:
                System.out.println(this.addition1.getName() + "  " +  this.addition1.getPrice() + "0");
                break;

            case 2:
                System.out.println(this.addition1.getName() + "  " +  this.addition1.getPrice() + "0");
                System.out.println(this.addition2.getName() + "  " +  this.addition2.getPrice() + "0");
                break;

            case 3:
                System.out.println(this.addition1.getName() + "  " +  this.addition1.getPrice() + "0");
                System.out.println(this.addition2.getName() + "  " +  this.addition2.getPrice() + "0");
                System.out.println(this.addition3.getName() + "  " +  this.addition3.getPrice() + "0");
                break;

            case 4:
                System.out.println(this.addition1.getName() + "  " +  this.addition1.getPrice() + "0");
                System.out.println(this.addition2.getName() + "  " +  this.addition2.getPrice() + "0");
                System.out.println(this.addition3.getName() + "  " +  this.addition3.getPrice() + "0");
                System.out.println(this.addition4.getName() + "  " +  this.addition4.getPrice() + "0");
                break;
        }
        System.out.println("Your total is "+ getPrice());
    }

    public int getCountOfAdditions() {
        System.out.println(this.countOfAdditions);
        return countOfAdditions;
    }
}
