package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {

  public String convert(int number) {
    if (number % 15 == 0) {
      return "FizzBuzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(number);
    }
  }

  public String compute(int to) {
    if (to < 1) {
      throw new NonCompliantNumberException();
    }

    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= to; i++) {
      result.append(convert(i));
    }
    return result.toString();
  }
}
