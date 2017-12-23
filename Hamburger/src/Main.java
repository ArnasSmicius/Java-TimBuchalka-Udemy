import Hamburger.Adictions.DeluxeHamburger;
import Hamburger.BaseHamburger;
import Hamburger.HealthyBurger;

/**
 * Created by Arnas on 2017.04.12.
 */
public class Main {

    public static void main(String[] args){
        DeluxeHamburger hamburger = new DeluxeHamburger();
        hamburger.addCarrot();
        hamburger.addCheese();
        hamburger.addKetchup();
        hamburger.addCarrot();
        hamburger.addTomato();
        hamburger.addMustard();
        hamburger.addLettuce();
        hamburger.totalCost();
    }

    Integer integer = new Integer(54);
}
