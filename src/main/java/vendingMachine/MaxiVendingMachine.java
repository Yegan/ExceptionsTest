package vendingMachine;

import exceptions.*;
import products.Coke;
import products.LaysChips;
import products.Product;
import products.SmartieChocolate;

public class MaxiVendingMachine extends VendingMachine {

    @Override
    public void buy(Product product) throws InvalidProductException {
    throw new InvalidProductException();
    }

    public void buy(Coke coke) throws SoftDrinksOutOfStockException {
        if (cokeStock >= 1) {
            cokeStock -= 1;
            if (cokeStock == 0) {
                throw new SoftDrinksOutOfStockException();
            }
        }

    }

    public void buy(LaysChips laysChips) throws SaltySnacksOutOfStockException {
        if (chipsStock >= 1) {
            chipsStock -= 1;
            if (chipsStock == 0) {
                throw new SaltySnacksOutOfStockException();
            }
        }

    }

    public void buy(SmartieChocolate chocolate) throws ChocolatesAllGone {
        if (chocolateStock >= 1) {
            chocolateStock -= 1;
            if (chocolateStock == 0) {
                throw new ChocolatesAllGone();
            }
        }

    }

    @Override
    public void addStock(Product product, int stock){
        if (product instanceof Coke) {
            cokeStock += stock;
        }
        if (product instanceof SmartieChocolate) {
            chocolateStock += stock;
        }
        if (product instanceof LaysChips) {
            chipsStock += stock;
        }
    }

}
