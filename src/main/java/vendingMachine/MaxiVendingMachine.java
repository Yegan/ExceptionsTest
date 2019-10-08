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




//    public static void main(String[] args) {
//    VendingMachine vendingMachine = new VendingMachine();
//    MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();
//
//    Coke coke = new Coke();
//    vendingMachine.addStock(coke,2);
//    vendingMachine.getStock(coke);
//
//    SmartieChocolate smartieChocolate = new SmartieChocolate();
//    vendingMachine.addStock(smartieChocolate, 1);
//    vendingMachine.getStock(smartieChocolate);
//
//
//    LaysChips laysChips = new LaysChips();
//    vendingMachine.addStock(laysChips,1);
//    vendingMachine.getStock(laysChips);
//
//        System.out.println("--------------------------------------------");
//    try{
//        maxiVendingMachine.buy(coke);
//        maxiVendingMachine.buy(laysChips);
//        maxiVendingMachine.buy(laysChips);
//        maxiVendingMachine.buy(smartieChocolate);
//    }catch (InvalidProductException in){
//        in.printStackTrace();
//    }catch (ChocolatesAllGone c){
//        c.printStackTrace();
//    }catch(SaltySnacksOutOfStockException s){
//        s.printStackTrace();
//    }catch (SoftDrinksOutOfStockException so){
//        so.printStackTrace();
//    }
//
//
//    }

}
