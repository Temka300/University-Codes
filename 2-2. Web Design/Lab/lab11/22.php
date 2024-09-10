<?php
//a, b сууриудтай, a-их суурь дахь өнцөг нь α-тай тэнцүү байх адил хажуут трапецийн талбайг ол

function trapezoidArea($a, $b, $alpha) {
    // Convert alpha from degrees to radians
    $alpha = deg2rad($alpha);
    
    // Calculate the height h using the tangent of the angle
    $h = ($a - $b) * tan($alpha);
    
    // Calculate the area of the trapezoid
    $area = 0.5 * ($a + $b) * $h;
    
    return $area;
}

// Example usage:
$a = 10; // Base a
$b = 5;  // Base b
$alpha = 30; // Angle at base a in degrees

$area = trapezoidArea($a, $b, $alpha);
echo "The area of the trapezoid is: " . $area . "\n";
?>
