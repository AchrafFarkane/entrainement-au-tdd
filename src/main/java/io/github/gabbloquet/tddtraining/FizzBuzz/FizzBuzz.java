package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {
  public String convert(int input) {
    StringBuilder result = new StringBuilder();

    if (input % 3 == 0) result.append("Fizz");
    if (input % 5 == 0) result.append("Buzz");

    return result.isEmpty() ? String.valueOf(input) : result.toString();
  }

  public String compute(int to) {
    if (to < 1) throw new NonCompliantNumberException();

    StringBuilder transformedString = new StringBuilder();
    for (int i = 1; i <= to; i++) {
      transformedString.append(convert(i));
    }

    return transformedString.toString();
  }
}
