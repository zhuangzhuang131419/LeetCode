package Q17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsOfPhoneNumberTest {
    LetterCombinationsOfPhoneNumber lcpn = new LetterCombinationsOfPhoneNumber();

    @Test
    public void letterCombinations() {
        List<String> result = lcpn.letterCombinations("23");

        System.out.println(result);


    }
}