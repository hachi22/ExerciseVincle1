import org.example.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    List<String> result;
    @BeforeEach
    void setup() {
        result = new ArrayList<>();
        Collections.addAll(result,"1", "2", "VIN", "4", "CLE", "VIN", "7", "8", "VIN", "CLE", "11", "VIN", "13", "14", "VINCLE", "16", "17", "VIN", "19", "CLE", "VIN", "22", "23", "VIN", "CLE", "26", "VIN", "28", "29", "VINCLE", "31", "32", "VIN", "34", "CLE", "VIN", "37", "38", "VIN", "CLE", "41", "VIN", "43", "44", "VINCLE", "46", "47", "VIN", "49", "CLE", "VIN", "52", "53", "VIN", "CLE", "56", "VIN", "58", "59", "VINCLE", "61", "62", "VIN", "64", "CLE", "VIN", "67", "68", "VIN", "CLE", "71", "VIN", "73", "74", "VINCLE", "76", "77", "VIN", "79", "CLE", "VIN", "82", "83", "VIN", "CLE", "86", "VIN", "88", "89", "VINCLE", "91", "92", "VIN", "94", "CLE", "VIN", "97", "98", "VIN", "CLE");
    }
    @Test
    public void given100IterationsReturnListOfStrings(){

        assertEquals(result, Solution.vincleExercise());
    }
}