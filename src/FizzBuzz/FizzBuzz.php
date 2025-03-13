<?php

namespace App\FizzBuzz;

use App\FizzBuzz\Exception\NonCompliantNumberException;

class FizzBuzz
{
    public function convert(int $number): string
    {
        if ($number % 15 === 0) {
            return "FizzBuzz";
        }

        if ($number % 3 === 0) {
            return "Fizz";
        }

        if ($number % 5 === 0) {
            return "Buzz";
        }

        return (string) $number;
    }
    public function compute(int $to): string
    {
        if ($to < 1) {
            throw new NonCompliantNumberException("The number provided is not greater than 1");
        }

        $result = '';

        for ($i = 1; $i <= $to; $i++) {
            $result .= $this->convert($i);
        }

        return $result;
    }
}