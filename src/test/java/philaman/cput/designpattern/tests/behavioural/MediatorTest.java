/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.junit.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.Mediator.AmericanSeller;
import philaman.cput.designpattern.behavioural.Mediator.Buyer;
import philaman.cput.designpattern.behavioural.Mediator.DollarConvertor;
import philaman.cput.designpattern.behavioural.Mediator.FrenchBuyer;
import philaman.cput.designpattern.behavioural.Mediator.Mediator;
import philaman.cput.designpattern.behavioural.Mediator.SwedishBuyer;

/**
 *
 * @author phila
 */
public class MediatorTest {

    public MediatorTest() {
    }

    @Test
    public void mediatorPatternTest() {
        Mediator mediator = new Mediator();

        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchhBuyer = new FrenchBuyer(mediator);
        
        float sellingPriceInDollors = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollors);
        DollarConvertor dollarConvertor = new DollarConvertor(mediator);
        
        Assert.assertEquals(14.2, dollarConvertor.ConvertCurrencyToDollars(sellingPriceInDollors, "krone"), 00.1);
        Assert.assertEquals(14.2, dollarConvertor.ConvertCurrencyToDollars(sellingPriceInDollors, "Euros"), 000000.1);
        
        float swedishBidInKronor = 55.0f;
        Assert.assertEquals(true, swedishBuyer.attemptToPurchase(swedishBidInKronor));

        float frenchBidInEuros = 3.0f;
        Assert.assertEquals(false, frenchhBuyer.attemptToPurchase(frenchBidInEuros));
    }
}
