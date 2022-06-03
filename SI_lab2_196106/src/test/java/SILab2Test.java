import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {

    @Test
    void EveryStatement() {

        List<String> empty_list = new ArrayList<>();
        List<String> invalid = Arrays.asList("0", "0", "0", "0", "0");

        List<String> list1 = Arrays.asList("0", "#", "0", "0", "#");
        List<String> list1_c = Arrays.asList("2", "#", "1", "3", "#");


        // assertThrows(IllegalArgumentException.class, () -> SILab2.function(empty_list));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(empty_list));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(invalid));
        assertEquals(list1_c, SILab2.function(list1));
    }

    @Test
    void EveryBranch() {

        List<String> list1 = Arrays.asList("0", "#", "0", "0", "#","0", "#","0","0", "#","#");
        List<String> list1_c = Arrays.asList("2", "#", "1", "1", "#","2","#","2","2","#","#");
        assertEquals(list1_c, SILab2.function(list1));
    }
}