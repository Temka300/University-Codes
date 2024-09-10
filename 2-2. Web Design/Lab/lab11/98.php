<?php
// a_1=b_1=1; a_k=3b_(k-1) + 2a_(k-1); b_k=2a_(k-1) + b_(k-1), k=2, 3, ... бол 
// Sum[2^k/(1+Subscript[a,k]^2+Subscript[b,k]^2)k!,{,,}]

function factorial($n) {
    if ($n == 0 || $n == 1) {
        return 1;
    }
    return $n * factorial($n - 1);
}

function computeSum($n) {
    // Initialize the sequences
    $a = [1];
    $b = [1];
    
    // Compute the sequences up to n
    for ($k = 2; $k <= $n; $k++) {
        $a[$k - 1] = 3 * $b[$k - 2] + 2 * $a[$k - 2];
        $b[$k - 1] = 2 * $a[$k - 2] + $b[$k - 2];
    }

    // Calculate the summation
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $term = pow(2, $k) / (1 + pow($a[$k - 1], 2) + pow($b[$k - 1], 2)) / factorial($k);
        $sum += $term;
    }

    return $sum;
}

// Example usage:
$n = 10; // You can change the value of n to compute more terms
$sum = computeSum($n);
echo "The summation is: " . $sum . "\n";
?>
