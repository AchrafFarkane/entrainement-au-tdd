<?php

namespace FizzBuzz;

class NonCompliantNumberException extends \RuntimeException
{
    public function __construct()
    {
        parent::__construct("The number provided is not greater than 1");
    }
}
