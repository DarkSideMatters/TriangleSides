package test;


import main.triangleCheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class triangleCheckTest {

    private final triangleCheck tc = new triangleCheck();
    @org.junit.Test
    public void checkIfInputIsValid() throws Exception {
        assertEquals(triangleCheck.checkIfNumbersAreValid("3","3","3"), true);
    }

    @org.junit.Test
    public void checkIfInputIsValid2() throws Exception {
        assertEquals(triangleCheck.checkIfNumbersAreValid("a","3","3"), false);
    }

    @org.junit.Test
    public void checkIfInputIsValid3() throws Exception {
        assertEquals(triangleCheck.checkIfNumbersAreValid("!","3","3"), false);
    }


}