<?php

// Read the GET parameters
$name = $_GET['name'];
$score = $_GET['score'];
 
$response = "Name: " . $name . " ; Score: " . $score;
echo $response;
?>
