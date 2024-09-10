<?php
// a_1, ..., a_n бүхэл тоонууд өгөгдөв (уг дараалалд давтагдсан тоо байж болно)
// а. Дараалалд ганц удаа орсон бүх тоог ол.
// б. Уг дараалалд ядаж нэг удаа орсон бүх тоог ол.
// в. Дарааллын ялгаатай гишүүдийн тоог ол.
// г. Дараалалд яг нэг удаа орсон гишүүдийн тоог ол.
// д. Уг дараалалд нэгээс олон удаа орсон тоо хэд байгааг ол.
// е. Дараалалд давтагдсан орсон хос тоо байгаа эсэхийг тодорхойл.


function analyzeSequence($sequence) {
    $occurrences = array_count_values($sequence);

    // a. Find all the numbers that appear once in the sequence.
    $appearOnce = array_keys(array_filter($occurrences, function($count) {
        return $count == 1;
    }));

    // b. Find all the numbers that appear in the sequence at least once.
    $appearAtLeastOnce = array_keys($occurrences);

    // c. Find the number of distinct terms of the sequence.
    $numDistinctTerms = count($appearAtLeastOnce);

    // d. Find the number of members in the queue exactly once.
    $numAppearOnce = count($appearOnce);

    // e. Find how many numbers appear in the sequence more than once.
    $numAppearMoreThanOnce = count(array_filter($occurrences, function($count) {
        return $count > 1;
    }));

    // f. Determine if there are repeated pairs of numbers in the sequence.
    $repeatedPairs = false;
    $pairs = [];
    for ($i = 0; $i < count($sequence) - 1; $i++) {
        $pair = [$sequence[$i], $sequence[$i + 1]];
        if (in_array($pair, $pairs)) {
            $repeatedPairs = true;
            break;
        }
        $pairs[] = $pair;
    }

    return [
        'appearOnce' => $appearOnce,
        'appearAtLeastOnce' => $appearAtLeastOnce,
        'numDistinctTerms' => $numDistinctTerms,
        'numAppearOnce' => $numAppearOnce,
        'numAppearMoreThanOnce' => $numAppearMoreThanOnce,
        'repeatedPairs' => $repeatedPairs
    ];
}

// Example usage:
$sequence = [1, 2, 2, 3, 4, 4, 4, 5, 1, 3];

$analysis = analyzeSequence($sequence);

echo "Numbers that appear once: " . implode(", ", $analysis['appearOnce']) . "\n";
echo "Numbers that appear at least once: " . implode(", ", $analysis['appearAtLeastOnce']) . "\n";
echo "Number of distinct terms: " . $analysis['numDistinctTerms'] . "\n";
echo "Number of members that appear exactly once: " . $analysis['numAppearOnce'] . "\n";
echo "Number of numbers that appear more than once: " . $analysis['numAppearMoreThanOnce'] . "\n";
echo "Are there repeated pairs of numbers? " . ($analysis['repeatedPairs'] ? "Yes" : "No") . "\n";

?>

?>
