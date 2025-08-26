package Exception;
import java.util.*;
public class VoterId {
	private int age;

    public VoterId(int age) {
        this.age = age;
    }

    public void checkEligibility() throws InvalidStringException {
        if (age < 18) {
            throw new InvalidStringException(" You are not eligible for Voter ID! Age should be 18 or above.");
        } else {
            System.out.println(" You are eligible for Voter ID!");
        }
	
}
}