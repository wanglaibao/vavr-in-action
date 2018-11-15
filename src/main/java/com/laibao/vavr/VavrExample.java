package com.laibao.vavr;

import io.vavr.Tuple;
import io.vavr.Value;
import io.vavr.control.Try;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author laibao wang
 */
public class VavrExample {

    private Tuple tuple;

    private Value value;

    public int divide(int dividend, int divisor) {
        // throws if divisor is zero
        return dividend / divisor;
    }

    // In a functional setting we are in the favorable situation to encapsulate the side-effect in a Try
    // = Success(result) or Failure(exception)
    Try<Integer> divideInFunctionalWay(int dividend, int divisor) {
        return Try.of(() -> dividend / divisor);
    }

    public static void main(String[] args) {
        // not referentially transparent
        Math.random();

        // referentially transparent
        Math.max(1, 2);

        List<String> strList = Arrays.asList("asdfasdf","fasdfa","fasfdasf","asfdasfd","asdfasfd");
        List<String> list = Collections.unmodifiableList(strList);
        // Boom!
        list.add("why not?");
    }
}
