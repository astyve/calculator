package org.bluej.calkulator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcEngineTest {
@Test public void testNumberInput(){
    CalcEngine calcEngine = new CalcEngine();

    // Test at brukeren trykker tallene 1, 2, 3,

    calcEngine.numberPressed(1);
    calcEngine.numberPressed(2);
    calcEngine.numberPressed(3);

   assertEquals(123, calcEngine.getDisplayValue());
}

@Test public void testAdditionOfTwoNumbers(){
    CalcEngine calcEngine = new CalcEngine();

    // Test at brukeren trykker tallene 2,5 +, 1, 3, =

    calcEngine.numberPressed(2);
    calcEngine.numberPressed(5);
    calcEngine.plus();
    calcEngine.numberPressed(1);
    calcEngine.numberPressed(3);

    // Calculate result
    calcEngine.equals();

    assertEquals(38, calcEngine.getDisplayValue());
}

@Test public void testAdditionOfThreeNumbers(){
    CalcEngine calcEngine = new CalcEngine();

    // Test at brukeren trykker tallene 2,5 +, 1, 3, =

    calcEngine.numberPressed(2);
    calcEngine.numberPressed(5);
    calcEngine.plus();
    calcEngine.numberPressed(1);
    calcEngine.numberPressed(3);
    calcEngine.plus();
    calcEngine.numberPressed(1);

    // Calculate result
    calcEngine.equals();

    assertEquals(39, calcEngine.getDisplayValue());
}

@Test public void testClear(){
    CalcEngine calcEngine = new CalcEngine();

    // Test at brukeren trykker tallene 2,5 +, 1, 3, =

    calcEngine.numberPressed(2);
    calcEngine.numberPressed(5);
    calcEngine.clear();

    assertEquals(0, calcEngine.getDisplayValue());
}
}
