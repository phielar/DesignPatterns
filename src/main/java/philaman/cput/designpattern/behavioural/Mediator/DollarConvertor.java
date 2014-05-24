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
public class DollarConvertor {

    Mediator mediator;
    public static final float DOLLOR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONE_UNIT = 8.0f;

    public DollarConvertor(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDollarConvertor(this);
    }

    public float ConvertCurrencyToDollars(float amount, String unitOfCurrency) {
        if ("krone".equalsIgnoreCase(unitOfCurrency)) {
            return ConvertKronorToDollar(amount);
        } else {
            return ConvertEuroToDollars(amount);
        }

    }

    private float ConvertKronorToDollar(float amount) {
        return (amount * (DOLLOR_UNIT / EURO_UNIT));

    }

    private float ConvertEuroToDollars(float amount) {
        return (amount * (DOLLOR_UNIT / EURO_UNIT));
    }

}
