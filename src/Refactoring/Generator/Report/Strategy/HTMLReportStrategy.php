<?php

namespace App\Refactoring\Generator\Report\Strategy;

class HTMLReportStrategy implements ReportStrategy
{

    public function Generate(): void
    {
        echo "Generating HTML Report...\n";
    }
}