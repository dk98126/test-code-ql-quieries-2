package testingcodeqlqueries;

import java.util.Random;

public class EmptyThenBranch {
    public void testEmptyThenBranch() {
        Integer randomNumber = (new Random()).nextInt();
        if (randomNumber == 1) {

        }
        System.out.println(randomNumber);
    }
}
