<?php

namespace Test\FizzBuzz;

use PHPUnit\Framework\TestCase;
use FizzBuzz\FizzBuzz;
use FizzBuzz\NonCompliantNumberException;

class FizzBuzzTest extends TestCase
{
    private FizzBuzz $fizzBuzz;

    protected function setUp(): void
    {
        $this->fizzBuzz = new FizzBuzz();
    }

    public function testShouldReturn1WhenNumberIs1()
    {
        $this->assertEquals('1', $this->fizzBuzz->convert(1));
    }

    public function testShouldReturnFizzWhenNumberIs3()
    {
        $this->assertEquals('Fizz', $this->fizzBuzz->convert(3));
    }

    public function testShouldReturnBuzzWhenNumberIs5()
    {
        $this->assertEquals('Buzz', $this->fizzBuzz->convert(5));
    }

    public function testShouldReturnFizzBuzzWhenNumberIs15()
    {
        $this->assertEquals('FizzBuzz', $this->fizzBuzz->convert(15));
    }

    public function testShouldReturnFizzForMultiplesOf3()
    {
        $this->assertEquals('Fizz', $this->fizzBuzz->convert(6));
        $this->assertEquals('Fizz', $this->fizzBuzz->convert(9));
        $this->assertEquals('Fizz', $this->fizzBuzz->convert(12));
    }

    public function testShouldReturnBuzzForMultiplesOf5()
    {
        $this->assertEquals('Buzz', $this->fizzBuzz->convert(10));
        $this->assertEquals('Buzz', $this->fizzBuzz->convert(20));
        $this->assertEquals('Buzz', $this->fizzBuzz->convert(25));
    }

    public function testShouldReturnFizzBuzzForMultiplesOf15()
    {
        $this->assertEquals('FizzBuzz', $this->fizzBuzz->convert(30));
        $this->assertEquals('FizzBuzz', $this->fizzBuzz->convert(45));
        $this->assertEquals('FizzBuzz', $this->fizzBuzz->convert(60));
    }

    public function testShouldReturnNumberElse()
    {
        $this->assertEquals('2', $this->fizzBuzz->convert(2));
        $this->assertEquals('4', $this->fizzBuzz->convert(4));
        $this->assertEquals('7', $this->fizzBuzz->convert(7));
    }

    public function testShouldReturnTransformedListTo20()
    {
        $expected = '12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz';
        $this->assertEquals($expected, $this->fizzBuzz->compute(20));
    }

    public function testShouldThrowExceptionForInvalidInput()
    {
        $this->expectException(NonCompliantNumberException::class);
        $this->fizzBuzz->compute(0);
        
        $this->expectException(NonCompliantNumberException::class);
        $this->fizzBuzz->compute(-3);
    }
}
