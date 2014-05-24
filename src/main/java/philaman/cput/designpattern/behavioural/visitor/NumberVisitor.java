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
public interface NumberVisitor {

    public int visit(TwoElement twoElement);

    public int visit(ThreeElement threeElement);

    public void visit(List<NumberElement> elementList);
}
