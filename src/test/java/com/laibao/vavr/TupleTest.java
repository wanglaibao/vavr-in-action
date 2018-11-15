package com.laibao.vavr;

import io.vavr.*;
import org.junit.Test;

/**
 * @author laibao wang
 */
public class TupleTest {

    @Test
    public void testCreateTuple() {
        Tuple0 tuple0 = Tuple.empty();
        Tuple1<String> tuple1 = Tuple.of("java8");
        Tuple2<String, String> java8 = Tuple.of("Java8", "Groovy");
        Tuple3<String,String,String> tuple3 = Tuple.of("Java8", "Groovy","Scala");
        Tuple4<String,String,String,String> tuple4 = Tuple.of("Java8", "Groovy","Scala","Kotlin");
        Tuple5<String,String,String,String,String> tuple5 = Tuple.of("Java8", "Groovy","Scala","Kotin","HasKell");
        Tuple6<String,String,String,String,String,String> tuple6 = Tuple.of("Java8", "Groovy","Scala","Kotin","HasKell","Clojure");
        Tuple7<String,String,String,String,String,String,String> tuple7 = Tuple.of("Java8", "Groovy","Scala","Kotin","HasKell","Clojure","F#");
        Tuple8<String,String,String,String,String,String,String,String> tuple8 = Tuple.of("Java8", "Groovy","Scala","Kotin","HasKell","Clojure","F#","JavaScript");

        tuple8.toSeq().forEach(System.out::println);
        System.out.println();
        System.out.println(tuple8._1);
    }

    @Test
    public void testMapATupleToAnother() {
        Tuple8<String,String,String,String,String,String,String,String> tuple8 = Tuple.of("Java8", "Groovy","Scala","Kotin","HasKell","Clojure","F#","JavaScript");

        Tuple8<String,String,String,String,String,String,String,String> tuple81 = tuple8.map(
                ((s, s2, s3, s4, s5, s6, s7, s8) -> Tuple.of(s.toUpperCase(),s2.toUpperCase(),s3.toUpperCase(),s4.toUpperCase(),s5.toUpperCase(),s6.toUpperCase(),s7.toUpperCase(),s8.toUpperCase()))
        );

        tuple81.toSeq().forEach(System.out::println);
    }
}
