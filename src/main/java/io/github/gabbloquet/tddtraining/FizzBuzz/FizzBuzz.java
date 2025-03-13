package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {

  public boolean isMultipleOfThree(int number){
    return number % 3 == 0;
  }

  public boolean isMultipleOfFive(int number){
    return number % 5 == 0;
  }

  public String transform(int numberInput){
    if (isMultipleOfThree(numberInput) && isMultipleOfFive(numberInput)){
      return "FizzBuzz";
    } else if(isMultipleOfThree(numberInput)){
      return "Fizz";
    } else if(isMultipleOfFive(numberInput)){
      return "Buzz";
    }
    return String.valueOf(numberInput);
  }

  public String compute(int number){
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= number; i++) {
      result.append(transform(i));
    }
    return result.toString();
  }
}
