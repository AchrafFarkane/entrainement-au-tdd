const FizzBuzz = require('./fizzbuzz');

let fizzBuzz;

beforeEach(() => {
  fizzBuzz = new FizzBuzz();
});

test('should return "1" when number is 1', () => {
  expect(fizzBuzz.convert(1)).toBe("1");
});

test('should return "Fizz" when the number is 3', () => {
  expect(fizzBuzz.convert(3)).toBe("Fizz");
});

test('should return "Buzz" when the number is 5', () => {
  expect(fizzBuzz.convert(5)).toBe("Buzz");
});

test('should return "FizzBuzz" when the number is 15', () => {
  expect(fizzBuzz.convert(15)).toBe("FizzBuzz");
});

test('should return "Fizz" for every multiple of 3', () => {
  [6, 9, 12].forEach(num => {
    expect(fizzBuzz.convert(num)).toBe("Fizz");
  });
});

test('should return "Buzz" for every multiple of 5', () => {
  [5, 10, 20].forEach(num => {
    expect(fizzBuzz.convert(num)).toBe("Buzz");
  });
});

test('should return "FizzBuzz" for every multiple of 15', () => {
  [30, 45, 60].forEach(num => {
    expect(fizzBuzz.convert(num)).toBe("FizzBuzz");
  });
});

test('should return the number as a string otherwise', () => {
  [1, 2, 4].forEach(num => {
    expect(fizzBuzz.convert(num)).toBe(num.toString());
  });
});

test('should return transformed list up to 20', () => {
  const expectedList = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";
  expect(fizzBuzz.compute(20)).toBe(expectedList);
});

test('should return transformed list up to 100', () => {
  const expectedList = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
  expect(fizzBuzz.compute(100)).toBe(expectedList);
});

test('should throw error if number is 0', () => {
  expect(() => fizzBuzz.compute(0)).toThrow("The number provided is not greater than 1");
});

test('should throw error if number is negative', () => {
  expect(() => fizzBuzz.compute(-3)).toThrow("The number provided is not greater than 1");
});
