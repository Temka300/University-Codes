<?php
// "m цаг, n минут" болж байгааг илэрхийлэх m, n бүхэл тоонууд өгөгдөв (0 < m ≤ 12, 0 ≤ n < 60). Дараах агшин хүртэл өнгөрөх хамгийн бага хугацааг (минутаар) олно уу:
// а. Хоёр зүү давхцах
// б. Хоёр зүү хоорондоо тэгш өнцөг үүсгэх

// File: NextOverlap.php

function calculateNextOverlap($m, $n) {
    // Calculate the time until the next overlap
    $t = ((60 * $m) - (11 * $n)) / 11;
    // Ensure the time is positive and less than 720 minutes (12 hours)
    if ($t < 0) {
        $t += 720; // Adding 12 hours (720 minutes)
    }
    return $t;
}

function calculateNextRightAngle($m, $n) {
    // Calculate the times until the next right angle
    $angle1 = (($m * 60) - (11 * $n) + 90 * 11) / 11;
    $angle2 = (($m * 60) - (11 * $n) - 90 * 11) / 11;

    // Ensure the times are positive and less than 720 minutes (12 hours)
    if ($angle1 < 0) {
        $angle1 += 720; // Adding 12 hours (720 minutes)
    }
    if ($angle2 < 0) {
        $angle2 += 720; // Adding 12 hours (720 minutes)
    }

    // Return the minimum time until the next right angle
    return min($angle1, $angle2);
}

// Example usage:
$m = 3; // Example hour
$n = 15; // Example minutes

$overlapTime = calculateNextOverlap($m, $n);
$rightAngleTime = calculateNextRightAngle($m, $n);

echo "The minimum time until the next overlap is: $overlapTime minutes\n";
echo "The minimum time until the next right angle is: $rightAngleTime minutes\n";

?>
