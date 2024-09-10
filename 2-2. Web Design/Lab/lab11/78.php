<?php
// 78. a бодит тоо, n натурал тоо өгөгдөв. Илэрхийллүүдийн утгыг ол:
// а. a^n;
// б. a(a+1)...(a+n-1);
// в. (1/a)+(1/(a(a+1)))+...+(1/(a(a+1)...(a+n)));
// г. (1/a)+(1/(a^2))+(1/(a^4))...+(1/(a^(2^n)));
// д. a(a-n)(a-2n)...(a-n^2);

function power($a, $n) {
    return pow($a, $n);
}

function productSequence($a, $n) {
    $result = 1;
    for ($i = 0; $i < $n; $i++) {
        $result *= ($a + $i);
    }
    return $result;
}

function sumOfFractions($a, $n) {
    $sum = 0;
    for ($i = 0; $i <= $n; $i++) {
        $product = 1;
        for ($j = 0; $j <= $i; $j++) {
            $product *= ($a + $j);
        }
        $sum += 1 / $product;
    }
    return $sum;
}

function sumOfPowers($a, $n) {
    $sum = 0;
    for ($i = 0; $i <= $n; $i++) {
        $sum += 1 / pow($a, pow(2, $i));
    }
    return $sum;
}

function productSequenceWithDecreasingTerms($a, $n) {
    $result = $a;
    for ($i = 1; $i <= $n; $i++) {
        $result *= ($a - $i * $n);
    }
    return $result;
}

// Example usage:
$a = 3; // Example value for a
$n = 4; // Example value for n

echo "a^n: " . power($a, $n) . "\n";
echo "a(a+1)...(a+n-1): " . productSequence($a, $n) . "\n";
echo "(1/a)+(1/(a(a+1)))+...+(1/(a(a+1)...(a+n))): " . sumOfFractions($a, $n) . "\n";
echo "(1/a)+(1/(a^2))+(1/(a^4))+...+(1/(a^(2^n))): " . sumOfPowers($a, $n) . "\n";
echo "a(a-n)(a-2n)...(a-n^2): " . productSequenceWithDecreasingTerms($a, $n) . "\n";

?>
