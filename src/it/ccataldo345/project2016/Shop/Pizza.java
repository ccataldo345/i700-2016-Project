package it.ccataldo345.project2016.Shop;

/**
 * Created by Chris01 on 28/11/2016.
 */
public class Pizza extends Food  {

    private double pizzaPrice;

    public Pizza(double pizzaPrice){
        this.setPizzaPrice(pizzaPrice);
    }

    public double getPizzaPrice(){
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice){
        this.pizzaPrice = pizzaPrice;
    }
}

