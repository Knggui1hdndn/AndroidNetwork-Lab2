<?php

// Read the GET parameters
$width = $_GET['width'];
$length = $_GET['length'];

$chuvi = ($length + $width) * 2;
$dientich = $length * $width;

$response = "Chu vi: " . $chuvi . " ; Diện tích: " . $dientich;

echo $response;
?>
