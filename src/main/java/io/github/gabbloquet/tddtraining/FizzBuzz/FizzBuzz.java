package io.github.gabbloquet.tddtraining.FizzBuzz;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class FizzBuzz {

  public static String calculate(int number) {
    String result = "";
    if (number % 3 == 0) result += "Fizz";
    if (number % 5 == 0) result += "Buzz";
    return result.isEmpty() ? String.valueOf(number) : result;
  }

  public static String compute(int n) {
    return IntStream.rangeClosed(1, n)
            .mapToObj(FizzBuzz::calculate)
            .collect(Collectors.joining(" "));
  }

}
