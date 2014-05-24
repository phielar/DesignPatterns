/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.behavioural.visitor;

import java.util.List;

/**
 *
 * @author phila
 */
public class TotalVisitor implements NumberVisitor {

    int tot2 = 0, tot3 = 0;

    @Override
    public int visit(TwoElement twoElement) {
        tot2 = (twoElement.a + twoElement.b);
        return tot2;
    }

    @Override
    public int visit(ThreeElement threeElement) {
        tot3 = (threeElement.a + threeElement.b + threeElement.c);
        return tot3;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement numberElement : elementList) {
            numberElement.accept(this);
        }
    }

    public int getTotalSum() {
        return (tot2 + tot3);
    }

}
