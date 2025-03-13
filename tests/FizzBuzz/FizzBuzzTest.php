<?php

namespace App\Tests\FizzBuzz;

use App\FizzBuzz\Exception\NonCompliantNumberException;
use App\FizzBuzz\FizzBuzz;
use PHPUnit\Framework\TestCase;

class FizzBuzzTest extends TestCase
{
    private FizzBuzz $fizzBuzz;

    protected function setUp(): void
    {
        $this->fizzBuzz = new FizzBuzz();
    }

    public function testShouldReturn1WhenNumberIs1(): void
    {
        $one = 1;
        $expectedString = "1";
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($one));
    }

    public function testShouldReturnFizzWhenTheNumberIs3(): void
    {
        $three = 3;
        $expectedString = "Fizz";
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($three));
    }

    public function testShouldReturnBuzzWhenTheNumberIs5(): void
    {
        $five = 5;
        $expectedString = "Buzz";
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($five));
    }

    public function testShouldReturnFizzBuzzWhenTheNumberIs15(): void
    {
        $fifteen = 15;
        $expectedString = "FizzBuzz";
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($fifteen));
    }

    public function testShouldReturnFizzForEveryMultipleOf3(): void
    {
        $six = 6;
        $nine = 9;
        $twelve = 12;

        $expectedString = "Fizz";

        $this->assertEquals($expectedString, $this->fizzBuzz->convert($six));
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($nine));
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($twelve));
    }

    public function testShouldReturnBuzzForEveryMultipleOf5(): void
    {
        $five = 5;
        $ten = 10;
        $twenty = 20;

        $expectedString = "Buzz";

        $this->assertEquals($expectedString, $this->fizzBuzz->convert($five));
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($ten));
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($twenty));
    }

    public function testShouldReturnFizzBuzzForEveryMultipleOf15(): void
    {
        $thirty = 30;
        $fortyFive = 45;
        $sixty = 60;

        $expectedString = "FizzBuzz";

        $this->assertEquals($expectedString, $this->fizzBuzz->convert($thirty));
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($fortyFive));
        $this->assertEquals($expectedString, $this->fizzBuzz->convert($sixty));
    }

    public function testShouldReturnTheNumberElse(): void
    {
        $one = 1;
        $two = 2;
        $four = 4;

        $this->assertEquals("1", $this->fizzBuzz->convert($one));
        $this->assertEquals("2", $this->fizzBuzz->convert($two));
        $this->assertEquals("4", $this->fizzBuzz->convert($four));
    }

    public function testShouldReturnTransformedListTo20(): void
    {
        $to = 20;

        $expectedList = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";

        $this->assertEquals($expectedList, $this->fizzBuzz->compute($to));
    }

    public function testShouldReturnTransformedListTo100(): void
    {
        $to = 100;

        $expectedList = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";

        $this->assertEquals($expectedList, $this->fizzBuzz->compute($to));
    }

    public function testShouldThrowNonCompliantErrorIfNumberIs0(): void
    {
        $this->expectException(NonCompliantNumberException::class);
        $this->expectExceptionMessage('The number provided is not greater than 1');

        $this->fizzBuzz->compute(0);
    }

    public function testShouldThrowNonCompliantErrorIfNumberIsMinus3(): void
    {
        $this->expectException(NonCompliantNumberException::class);
        $this->expectExceptionMessage('The number provided is not greater than 1');

        $this->fizzBuzz->compute(-3);
    }
}