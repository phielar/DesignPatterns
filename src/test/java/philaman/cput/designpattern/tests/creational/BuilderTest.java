/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.creational;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.creational.builder.Student;

/**
 *
 * @author phila
 */
public class BuilderTest {

    public BuilderTest() {
    }

    @Test
    public void studentBuilderTest() {
        Student student = new Student.Builder("Mane").lastname("manyile").build();
        Assert.assertEquals(student.getName(), "Mane");
    }
}
