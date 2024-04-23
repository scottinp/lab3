import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void filterTest() {
    //new list
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    StringChecker sc = s -> s.length() > 2;
    assertEquals(2, ListExamples.filter(list, sc).size());

    }


    @Test
    public void mergeTest() {
        List <String> list1 = Arrays.asList("a", "b");
        List <String> list2 = Arrays.asList("c", "d");
        List <String> result = Arrays.asList("a", "b", "c", "d");
        List <String> result2 = ListExamples.merge(list1, list2);
        assertEquals(result, result2);
    }

}
