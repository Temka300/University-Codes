<?php
// // https://chat.openai.com/share/5336c9da-e00e-4ba0-8888-b1b81fc6c530
// 22.
// File: Lab11.php

// Declare the bases and the angle in radians (PHP trigonometric functions expect radians)
$a = 5;   // Length of base 'a'
$b = 10;  // Length of base 'b'
$alpha_degrees = 30; // Angle at the base 'a' in degrees

// Convert angle to radians
$alpha = deg2rad($alpha_degrees);

// Calculate the height of the trapezoid using the tangent function
$h = ($b - $a) * tan($alpha / 2);

// Calculate the area of the trapezoid
$area = 0.5 * ($a + $b) * $h;

// Print out the result
echo "The area of the equilateral trapezoid is: " . $area . " square units.";
?>


<?php
// 37.
// File: ConditionCheck.php 

// Declare the variables
$a = 5;
$b = 3;
$c = 1;

// Check if the numbers fulfill the condition a >= b >= c
if ($a >= $b && $b >= $c) {
    $a *= 2;  // Multiply a by 2
    $b *= 2;  // Multiply b by 2
    $c *= 2;  // Multiply c by 2
} else {
    $a = abs($a);  // Replace a with its absolute value
    $b = abs($b);  // Replace b with its absolute value
    $c = abs($c);  // Replace c with its absolute value
}

// Print the results
echo "a: $a, b: $b, c: $c";
?>


<?php
// 70.
// File: NextOverlap.php

// Declare initial hours and minutes
$m = 10;  // hours
$n = 15;  // minutes

// Convert hours and minutes to total minutes past midnight
$timeInMinutes = $m * 60 + $n;

// Function to calculate the angular difference between the hour and minute hands
function getAngleDifference($time) {
    $minutes = $time % 60;
    $hours = ($time / 60) % 12;

    $minuteAngle = $minutes * 6;
    $hourAngle = $hours * 30 + $minutes * 0.5;

    $angle = abs($minuteAngle - $hourAngle);
    return min($angle, 360 - $angle);
}

// Simulate the passage of time minute by minute
$elapsed = 0;
while (true) {
    // Check the angle difference
    if (getAngleDifference($timeInMinutes + $elapsed) < 0.5) { // 0.5 degrees tolerance for overlap
        break;
    }
    $elapsed++;
}

// Output the result
echo "The next overlap after $m hours and $n minutes will occur in $elapsed minutes.";
?>




<?php
// 78.
// File: SeriesSum.php

function calculateSeriesSum($a, $n) {
    $sum = 0;
    $currentTerm = 1 / $a;

    for ($i = 0; $i <= $n; $i++) {
        $sum += $currentTerm;
        $currentTerm /= ($a * $a);  // Square the denominator for next term
    }

    return $sum;
}

// Example values
$a = 2;  // Base value of a
$n = 3;  // Exponent n

// Calculate the sum
$seriesSum = calculateSeriesSum($a, $n);

// Print the result
echo "The sum of the series for a = $a and n = $n is: $seriesSum\n";
?>




<?php
// 98.
// File: SeriesCalculation.php

function calculateSeriesSum($max_k) {
    $a = [1];  // Initialize a_1
    $b = [1];  // Initialize b_1
    $sum = 0;  // Initialize sum of the series

    for ($k = 1; $k <= $max_k; $k++) {
        if ($k > 1) { // Compute a_k and b_k for k > 1
            $a[$k - 1] = 3 * $b[$k - 2] + 2 * $a[$k - 2];
            $b[$k - 1] = 2 * $a[$k - 2] + $b[$k - 2];
        }

        $akSquared = $a[$k - 1] * $a[$k - 1];
        $bkSquared = $b[$k - 1] * $b[$k - 1];
        $denominator = 1 + $akSquared + $bkSquared;

        // Calculate term for current k
        $term = pow(2, $k) / ($denominator * gmp_fact($k)); // Using GMP for factorial
        $sum += $term;
    }

    return $sum;
}

// Maximum k value
$max_k = 10;  // Adjust as needed, keep in mind that factorials grow very fast!

// Calculate the sum
$seriesSum = calculateSeriesSum($max_k);

// Print the result
echo "The sum of the series for k up to $max_k is: " . $seriesSum . "\n";
?>





<?php
// 115.
// File: SumSeries.php

function calculateSum($n) {
    $sum = 0;

    for ($k = 1; $k <= $n; $k++) {
        $term = 1 / pow((2 * $k + 1), 2);
        $sum += $term;
    }

    return $sum;
}

// Example value for n
$n = 10;  // You can change this to any natural number

// Calculate the sum
$seriesSum = calculateSum($n);

// Print the result
echo "The sum of the series for n = $n is: $seriesSum\n";
?>






<?php
// 326.
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





<?php
// 339
// File: FindDuplicatePairs.php

function hasDuplicatePairs($array) {
    $pairCounts = [];  // Associative array to keep track of pair counts

    $length = count($array);
    for ($i = 0; $i < $length; $i++) {
        for ($j = $i + 1; $j < $length; $j++) {
            $x = $array[$i];
            $y = $array[$j];

            // Ensure pairs are considered the same regardless of order
            if ($x > $y) {
                $temp = $x;
                $x = $y;
                $y = $temp;
            }

            // Create a unique key for each pair
            $key = "$x-$y";

            // Update the count for this pair
            if (!isset($pairCounts[$key])) {
                $pairCounts[$key] = 0;
            }
            $pairCounts[$key]++;
        }
    }

    // Check for any pair count greater than 1
    foreach ($pairCounts as $count) {
        if ($count > 1) {
            return true;  // Found a duplicate pair
        }
    }

    return false;  // No duplicate pairs found
}

// Example sequence of integers
$numbers = [4, 5, 6, 4, 5, 6];

// Check if there are duplicate pairs
if (hasDuplicatePairs($numbers)) {
    echo "There are duplicate pairs in the sequence.\n";
} else {
    echo "There are no duplicate pairs in the sequence.\n";
}
?>
