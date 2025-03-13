package io.github.gabbloquet.tddtraining.ChaimaeJAOUDI;

import io.github.gabbloquet.tddtraining.FizzBuzz.NonCompliantNumberException;

public class NewFizzBuzz {
    public String convert(int number) {
        if(number % 5 == 0  && number % 3 == 0) {
            return "FizzBuzz";
        }
        else if(number % 3 == 0 ) {
            return "Fizz";

        }
        else if(number % 5 == 0 ) {
            return "Buzz";
        }
        else{
            return String.valueOf(number);
        }
    }

    public String compute(int number) {
        if(number <1){
            throw new NonCompliantNumberException();
        }
        else{
            String result = "";
            for(int i = 1; i <= number; i++) {
                result += convert(i);
            }
            return result;

        }


    }
}
