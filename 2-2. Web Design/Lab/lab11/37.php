<?php
// a, b, c бодит тоонууд өгөгдөв. Хэрэв a ≥ b ≥ c бол эдгээр тоонуудыг 2-оор үржүүлж, эсрэг тохиолдолд модулиудаар нь соль.
// File: ConditionCheck.php

function modifyNumbers(&$a, &$b, &$c) {
    if ($a >= $b && $b >= $c) {
        // Multiply each number by 2
        $a *= 2;
        $b *= 2;
        $c *= 2;
    } else {
        // Replace each number by its modulus (absolute value)
        $a = abs($a);
        $b = abs($b);
        $c = abs($c);
    }
}

// Example usage:
$a = 5;
$b = 3;
$c = 1;

modifyNumbers($a, $b, $c);
echo "Modified values: a = $a, b = $b, c = $c\n";
?>
