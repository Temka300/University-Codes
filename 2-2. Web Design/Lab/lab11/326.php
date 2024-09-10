<?php
// Хоёр натурал тооны кубуудын нийлбэр хэлбэртэй буюу x^3 + y^3 (x≥y) байх хамгийн бага n тоог ол.
// File: SmallestCubeSum.php

function findSmallestCubeSum() {
    $smallestSum = PHP_INT_MAX;  // Initialize with the largest possible int value
    $limit = 100;  // Set a reasonable upper limit to search within, adjust as needed

    for ($x = 1; $x <= $limit; $x++) {
        for ($y = 1; $y <= $x; $y++) {
            $sum = pow($x, 3) + pow($y, 3);

            // Check if this sum is the smallest found so far
            if ($sum < $smallestSum) {
                $smallestSum = $sum;
                // Since we're looking for the smallest sum, we can stop once a new minimum is found
                break;
            }
        }
    }

    return $smallestSum;
}

// Find the smallest sum
$smallestSum = findSmallestCubeSum();

// Print the result
echo "The smallest number n that is the sum of the cubes of two natural numbers is: $smallestSum\n";
?>
