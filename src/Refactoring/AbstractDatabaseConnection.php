<?php

namespace App\Refactoring;

class AbstractDatabaseConnection
{
    public function connect(): void
    {
        echo "Connecting to database...\n";
    }
}