package letscode;

import exceptions.InvalidProductException;
import exceptions.ProductNotFoundException;
import exceptions.SaltySnacksOutOfStockException;
import org.junit.jupiter.api.Test;
import products.Coke;
import products.LaysChips;
import products.Product;
import products.SmartieChocolate;
import vendingMachine.MaxiVendingMachine;
import vendingMachine.VendingMachine;

import static letscode.CodeThis.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeThisTest {


    @Test
    public void maxiStockTest() {
        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();
        Product product = new Product();
        LaysChips laysChips = new LaysChips();

        maxiVendingMachine.addStock(laysChips,3);
        maxiVendingMachine.getStock(laysChips);

        try{
            maxiVendingMachine.buy(laysChips);
            maxiVendingMachine.buy(product);

        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(2, maxiVendingMachine.getStock(laysChips));
    }


}
