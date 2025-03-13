class FizzBuzz{
    convert(number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else{
            return number.toString();
        }
    }
    compute(number){
        if (number < 1) {
            throw new Error("The number provided is not greater than 1");
        }
        let result = "";
        for(let i = 1; i <= number; i++){
            result += this.convert(i) + "";
        }
        return result;
    }
}
module.exports= FizzBuzz;