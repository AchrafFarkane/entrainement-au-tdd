<?php

namespace App\Refactoring\Generator\Report\Strategy;


class PDFReportStrategy implements ReportStrategy
{

    public function Generate(): void
    {
        echo "Generating PDF Report...\n";
    }
}