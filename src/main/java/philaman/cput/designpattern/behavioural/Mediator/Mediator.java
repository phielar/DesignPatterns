/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.behavioural.Mediator;

/**
 *
 * @author phila
 */
public class Mediator {

    Buyer swedishBuyer;
    Buyer frenchBuyer;
    AmericanSeller americanSeller;
    DollarConvertor dollarConvertor;

    public Mediator() {
    }

    public void registerSwedishBuyer(SwedishBuyer swedishBuyer) {
        this.swedishBuyer = swedishBuyer;
    }

    public void registerFrenchBuyer(FrenchBuyer frenchBuyer) {
        this.frenchBuyer = frenchBuyer;
    }

    public void registerAmericanSeller(AmericanSeller americanSeller) {
        this.americanSeller = americanSeller;
    }

    public void registerDollarConvertor(DollarConvertor dollarConvertor) {
        this.dollarConvertor = dollarConvertor;
    }

    public boolean placeBid(float bid, String unitOfCurrency) {
        float dollorAmount = dollarConvertor.ConvertCurrencyToDollars(bid, unitOfCurrency);
        return americanSeller.isBidAccepted(dollorAmount);
    }

}
