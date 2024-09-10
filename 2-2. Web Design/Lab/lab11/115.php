<?php
// n натурал тоо өгөгдөв. Дараах нийлбэрүүдийг ол:
// а. Sum[1/k,{k,1,n}]
// б. Sum[Divide[1,Power[k,5]],{k,1,n}]
// в. Sum[Divide[1,Power[\(40)2k+1\(41),2]],{k,1,n}]
// г. Sum[Divide[Power[\(40)-1\(41),k],\(40)2k+1\(41)k],{k,1,n}]
// д. Sum[Divide[Power[\(40)-1\(41),k+1],k\(40)k+1\(41)],{k,1,n}]
// е. Sum[Divide[\(40)-1\(41)\(40)k+1\(41),k!],{k,1,n}]
// ж. Sum[Divide[k!,Divide[1,2]+Divide[1,3]+... Divide[1,k+1]],{k,1,n}]

function harmonicSum($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $sum += 1 / $k;
    }
    return $sum;
}

function sumInversePowersOfFive($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $sum += 1 / pow($k, 5);
    }
    return $sum;
}

function sumInverseOddSquares($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $sum += 1 / pow((2 * $k + 1), 2);
    }
    return $sum;
}

function alternatingSumInverseOddProducts($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $sum += pow(-1, $k) / ((2 * $k + 1) * $k);
    }
    return $sum;
}

function alternatingSumInverseProducts($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $sum += pow(-1, $k + 1) / ($k * ($k + 1));
    }
    return $sum;
}

function alternatingSumFactorials($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $sum += pow(-1, $k) * (2 * $k + 1) / factorial($k);
    }
    return $sum;
}

function sumFactorialsWithInnerSum($n) {
    $sum = 0;
    for ($k = 1; $k <= $n; $k++) {
        $innerSum = 0;
        for ($j = 2; $j <= $k + 1; $j++) {
            $innerSum += 1 / $j;
        }
        $sum += factorial($k) * $innerSum;
    }
    return $sum;
}

function factorial($n) {
    if ($n == 0 || $n == 1) {
        return 1;
    }
    return $n * factorial($n - 1);
}

// Example usage:
$n = 10; // Example value for n

echo "a: " . harmonicSum($n) . "\n";
echo "b: " . sumInversePowersOfFive($n) . "\n";
echo "c: " . sumInverseOddSquares($n) . "\n";
echo "d: " . alternatingSumInverseOddProducts($n) . "\n";
echo "e: " . alternatingSumInverseProducts($n) . "\n";
echo "f: " . alternatingSumFactorials($n) . "\n";
echo "g: " . sumFactorialsWithInnerSum($n) . "\n";

?>
