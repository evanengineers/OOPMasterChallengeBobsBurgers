package com.company;

public class HealthyBurger extends Hamburger {

    private Additions addition5;
    private Additions addition6;
    private int countOfHealthyAdditions; 

    public HealthyBurger() {
        super(new BreadRollType("Brown Rye"), new Meat("Turkey"));
    }


    public Additions getAddition5() {
        return addition5;
    }

    public Additions getAdditions6() {
        return addition6;
    }

    public void setAddition5(Additions addition1) {
        this.addition5 = addition1;
    }

    public void setAdditions6(Additions additions2) {
        this.addition6 = additions2;
    }

    @Override
    public String make() {
        System.out.println("healthy burger. make called");
        return "healthy burger. make called";

    }




}
