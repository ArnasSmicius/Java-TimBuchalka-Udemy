package Hamburger;

import Hamburger.Adictions.*;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by Arnas on 2017.04.12.
 */
public class Hamburger {
    private ArrayList<Addiction> addictions;
    private double basePrice;

    public Hamburger(double basePrice){
        this.addictions = new ArrayList();
        this.basePrice = basePrice;
    }

    public boolean addCarrot(){
        if(leftAddictions()){
            this.addictions.add(new Carrot());
            return true;
        } else {
            return false;
        }
    }

    public boolean addCheese(){
        if(leftAddictions()){
            this.addictions.add(new Cheese());
            return true;
        } else {
            return false;
        }
    }

    public boolean addKetchup(){
        if(leftAddictions()){
            this.addictions.add(new Ketchup());
            return true;
        } else {
            return false;
        }
    }

    public boolean addLettuce(){
        if(leftAddictions()){
            this.addictions.add(new Lettuce());
            return true;
        } else {
            return false;
        }
    }

    public boolean addMustard(){
        if(leftAddictions()){
            this.addictions.add(new Mustard());
            return true;
        } else {
            return false;
        }
    }

    public boolean addTomato(){
        if(leftAddictions()){
            this.addictions.add(new Tomato());
            return true;
        } else {
            return false;
        }
    }

    public boolean leftAddictions(){
        return false;
    }

    public ArrayList<Addiction> getAddictions() {
        return addictions;
    }

    public void totalCost(){
        double totalCost = 0.0d;
        System.out.println("Base price: " + this.basePrice + " Eur");
        totalCost += this.basePrice;
        for(Addiction addiction : this.addictions){
            System.out.println(addiction.getName() + ": " + addiction.getCost() + " Eur");
            totalCost += addiction.getCost();
        }
        System.out.println("Total cost: " + totalCost + " Eur");

    }
}