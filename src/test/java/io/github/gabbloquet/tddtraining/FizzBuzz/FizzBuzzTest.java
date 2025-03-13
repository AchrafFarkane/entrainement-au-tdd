package io.github.gabbloquet.tddtraining.FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void number_one_should_return_string_one(){
    assertEquals("1", fizzBuzz.transform(1));
  }

  @Test
  void number_two_should_return_string_two(){
    assertEquals("2", fizzBuzz.transform(2));
  }

  @Test
  void number_four_should_return_string_four(){
    assertEquals("4", fizzBuzz.transform(4));
  }

  @Test
  void should_return_fizz_if_number_is_multiple_of_three_but_not_five() {
    assertEquals("Fizz", fizzBuzz.transform(3));
    assertEquals("Fizz", fizzBuzz.transform(6));
    assertEquals("Fizz", fizzBuzz.transform(9));
    assertEquals("Fizz", fizzBuzz.transform(12));
  }

  @Test
  void should_return_buzz_if_number_is_multiple_of_five_but_not_three() {
    assertEquals("Buzz", fizzBuzz.transform(5));
    assertEquals("Buzz", fizzBuzz.transform(10));
    assertEquals("Buzz", fizzBuzz.transform(20));
  }

  @Test
  void should_return_fizzbuzz_if_number_is_multiple_of_five_and_three() {
    assertEquals("FizzBuzz", fizzBuzz.transform(15));
    assertEquals("FizzBuzz", fizzBuzz.transform(30));
    assertEquals("FizzBuzz", fizzBuzz.transform(45));
  }

  @Test
  void should_transform_100_to_expected_list() {
    String expectedList = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
    assertEquals(expectedList, fizzBuzz.compute(100));
  }

}