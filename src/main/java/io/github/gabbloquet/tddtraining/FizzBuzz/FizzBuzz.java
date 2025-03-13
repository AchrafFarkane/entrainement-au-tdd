package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {
  public String convert(int nombre) {

    if(nombre % 3 == 0 && nombre % 5 == 0){
      return "FizzBuzz";
    } else if(nombre % 5 == 0) {
      return "Buzz";
    } else if(nombre % 3 == 0){
      return "Fizz";
    }
    return String.valueOf(nombre);
  }

  public String compute(int nbr) {
    if(nbr < 1)
      throw new NonCompliantNumberException();

    StringBuilder transformedString = new StringBuilder();
    for(int i = 1; i <= nbr; i++){
      transformedString.append(convert(i));
    }
    return transformedString.toString();
  }
}
