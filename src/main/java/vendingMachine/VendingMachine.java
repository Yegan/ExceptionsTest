package vendingMachine;

import exceptions.*;
import products.Coke;
import products.LaysChips;
import products.Product;
import products.SmartieChocolate;

public class VendingMachine {

   public int cokeStock =0;
    public int chipsStock =0;
    public int chocolateStock =0;


    public void buy(Product product) throws ProductNotFoundException {
    // checking for the type of product before purchasing that product
    if(!(product instanceof Product)){
    throw new InvalidProductException();
    }
    if(product instanceof Coke){
        if(cokeStock >= 1){
            cokeStock -=1;
            if(cokeStock == 0) {
                throw new SoftDrinksOutOfStockException();
            }
        }
    }
   else if(product instanceof SmartieChocolate) {
        if (chocolateStock >= 1) {
            chocolateStock -= 1;
            if(chocolateStock == 0){
                throw new ChocolatesAllGone();
            }
        }
    }
   else if(product instanceof LaysChips) {
                if (chipsStock >= 1) {
                    chipsStock -= 1;
                      if(chipsStock == 0) {
                        throw new SaltySnacksOutOfStockException();
                    }
                }
   }
    // throwing an exception if the product purchases is below 0

    }
    public void addStock(Product product, int newStock){
            if (product instanceof Coke) {
                cokeStock += newStock;
            }
            if (product instanceof SmartieChocolate) {
                chocolateStock += newStock;
            }
            if (product instanceof LaysChips) {
                chipsStock += newStock;
            }
        }

    public int getStock(Product product){
        if(product instanceof Coke){
            System.out.println("Coke on hand: " + cokeStock);
            return cokeStock;
        }
        if(product instanceof LaysChips){
            System.out.println("Chips on hand: " + chipsStock);
            return chipsStock;
        }
        if(product instanceof SmartieChocolate){
            System.out.println("Chocolates on hand: " + chocolateStock);
            return chocolateStock;
        }

        return 0;
    }


}

