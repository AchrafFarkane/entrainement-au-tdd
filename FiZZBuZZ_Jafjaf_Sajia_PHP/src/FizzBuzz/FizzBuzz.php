<?php

namespace FizzBuzz;

class FizzBuzz
{
    public function convert(int $input): string
    {
        if ($input < 1) {
            throw new NonCompliantNumberException();
        }

        if ($input % 15 === 0) return 'FizzBuzz';
        if ($input % 5 === 0) return 'Buzz';
        if ($input % 3 === 0) return 'Fizz';

        return strval($input);
    }

    public function compute(int $to): string
    {
        if ($to < 1) {
            throw new NonCompliantNumberException();
        }

        $result = '';
        for ($i = 1; $i <= $to; $i++) {
            $result .= $this->convert($i);
        }

        return $result;
    }
}
?>