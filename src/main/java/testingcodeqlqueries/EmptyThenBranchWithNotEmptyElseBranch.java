package testingcodeqlqueries;

import java.util.Random;

public class EmptyThenBranchWithNotEmptyElseBranch {
    public void testEmptyThenBranchWithNotEmptyElseBranch() {
        Integer randomNumber = (new Random()).nextInt();
        if (randomNumber == 1) {
            // здесь не нужно ничего делать
        } else {
            System.out.println("Число " + randomNumber + " не равно 1");
        }
        System.out.println(randomNumber);
    }
}
