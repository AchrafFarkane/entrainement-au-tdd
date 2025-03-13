<?php

namespace App\Refactoring\Generator\Report;

use App\Refactoring\Generator\Report\Strategy\HTMLReportStrategy;
use App\Refactoring\Generator\Report\Strategy\PDFReportStrategy;
use App\Refactoring\Generator\Report\Strategy\ReportStrategy;

class ReportContext {
    private ReportStrategy $strategy;

    public function setStrategy(ReportStrategy $strategy): void
    {
        $this->strategy = $strategy;
    }

    public function generateReport(): void
    {
        $this->strategy->generate();
    }

    // Method to change report strategy
    public function setReportStrategy($format): void
    {

        if (strtoupper($format) == "PDF") {
            $this->setStrategy(new PDFReportStrategy());
        } else if (strtoupper($format) == "HTML") {
            $this->setStrategy(new HTMLReportStrategy());
        } else {
            throw new \Exception("Unsupported report format: " . $format);
        }
    }
}