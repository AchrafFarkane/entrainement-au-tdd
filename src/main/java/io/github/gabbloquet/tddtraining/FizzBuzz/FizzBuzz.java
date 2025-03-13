package io.github.gabbloquet.tddtraining.FizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {

  // Default constructor
  public FizzBuzz() {
  }

  public String convert(int number) {
    if (number % 15 == 0) return "FizzBuzz"; // Divisible by 15
    else if (number % 3 == 0) return "Fizz"; // Divisible by 3
    else if (number % 5 == 0) return "Buzz"; // Divisible by 5
    else return String.valueOf(number); // return the number as a string
  }

  public String compute(int to) {
    if (to <= 0) throw new NonCompliantNumberException(); // Validate input
    ArrayList<String> result = new ArrayList<>();

    for (int i = 1; i <= to; i++) {
      result.add(convert(i)); // Convert each number and add to the list
    }

    return String.join("", result);
  }
}
