package com.latam.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachPOC {

  public static void main(String[] args) {
    List<String> names =
        Arrays.asList(
            "John", "John", "Mariam", "Alex", "Mohammado", "Mohammado", "Vincent", "Alex", "Alex");

    for (String name:names){
      System.out.println(name);
    }
    System.out.println("\n\n");
    names.stream().filter(s -> s.contains("M"))
      .forEach(System.out::println);
  }
}
