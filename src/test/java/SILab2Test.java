import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> generateString;

    private List<String> lista(String... elems) {
        return new ArrayList<> (Arrays.asList (elems));
    }
    @Test
    public void everyStatement() {
        IllegalArgumentException exp;
        exp = assertThrows (IllegalArgumentException.class, ()->SILab2.function (lista ()));
        assertTrue (exp.getMessage ().contains ("List length should be greater than 0"));
        exp = assertThrows (IllegalArgumentException.class, () ->SILab2.function (lista ("3", "3")));
        assertTrue (exp.getMessage ().contains ("List length should be perfect square"));
        assertEquals (lista ("1", "#", "2", "0", "3", "#", "1", "#", "#"),SILab2.function (lista ("0","#","0", "0", "0", "0", "#", "0", "#", "#")));
}
    @Test
    public void everyBranchStatement(){
        IllegalArgumentException exp;
        exp = assertThrows (IllegalArgumentException.class, ()->SILab2.function (lista ()));
        assertTrue (exp.getMessage ().contains ("List length should be greater than 0"));
        exp = assertThrows (IllegalArgumentException.class, () ->SILab2.function (lista ("3", "3")));
        assertTrue (exp.getMessage ().contains ("List length should be perfect square"));
        assertEquals (lista ("1", "#", "2", "0", "3", "#", "1", "#", "#"),SILab2.function (lista ("0","#","0", "0", "0", "0", "#", "0", "#", "#")));

    }
}
