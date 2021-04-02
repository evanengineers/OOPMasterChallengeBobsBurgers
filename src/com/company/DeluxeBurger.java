package com.company;

public class DeluxeBurger extends Hamburger {

    private String chips;
    private String drink;
    private double costOfChipsAndDrink;

    public DeluxeBurger(BreadRollType breadRollType, Meat meat, String chips, String drink) {
        super(breadRollType, meat);
        this.chips = chips;
        this.drink = drink;
        this.costOfChipsAndDrink = 2.99;
    }


    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    public double getCostOfChipsAndDrink() {
        return costOfChipsAndDrink;
    }

    @Override
    public double getPrice() {
        double DeluxeBurgerCost = super.getPrice() + getCostOfChipsAndDrink();
        System.out.println(DeluxeBurgerCost);
        return DeluxeBurgerCost;
    }
}
