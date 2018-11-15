package com.laibao.vavr;

import io.vavr.collection.List;
import io.vavr.control.Option;
import org.junit.Test;

/**
 * @author laibao wang
 */
public class VavrTest {

    @Test
    public void testList(){
       List<Integer> integerList = List.of(1, 2, 3,4,5,6,7,8,9,10);
       integerList.forEach(System.out::println);
    }

    @Test
    public void testListOptions(){
        List<Integer> integers = List.of(Option.of(42), Option.of(54)).flatMap(option -> option);
        integers.forEach(System.out::println);
    }
}
