<?php

namespace App\Refactoring\Generator\Report;

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
}