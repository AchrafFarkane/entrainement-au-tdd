package io.github.gabbloquet.tddtraining.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

  @ParameterizedTest
  @DisplayName("FizzBuzz function should return correct values")
  @CsvSource({
          "1, 1",
          "2, 2",
          "3, Fizz",
          "5, Buzz",
          "6, Fizz",
          "10, Buzz",
          "15, FizzBuzz",
          "30, FizzBuzz",
          "98, 98",
          "99, Fizz",
          "100, Buzz"
  })
  void testCalculate(int input, String expected) {
    assertEquals(expected, FizzBuzz.calculate(input));
  }

  @ParameterizedTest
  @DisplayName("FizzBuzz.compute(n) should generate correct concatenated sequence")
  @CsvSource({
          "1, '1'",
          "3, '1 2 Fizz'",
          "5, '1 2 Fizz 4 Buzz'",
          "15, '1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz'"
  })
  void testCompute(int input, String expected) {
    assertEquals(expected, FizzBuzz.compute(input));
  }
}
