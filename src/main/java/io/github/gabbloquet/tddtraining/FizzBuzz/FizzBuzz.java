package io.github.gabbloquet.tddtraining.FizzBuzz;

public class FizzBuzz {
    public String convert(int input) {
        if(input % 15 == 0){
            return "FizzBuzz";
        }
        else if(input % 3 == 0){
            return "Fizz";
        }
        else if(input % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(input);
    }

    public String compute(int to) {
        if(to < 1) {
            throw new NonCompliantNumberException();
        }

        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= to; i++) {
            result.append(convert(i));
        }
        return result.toString();
    }
}
