<?php
 $a=$_POST['a'];
 $b=$_POST['b'];
 $c=$_POST['c'];
 $delta=pow($b, 2)-4 * $a * $c;
 $rs=""
 if($a==0){
 	if (b==0) {
 		$rs="Vo so nghiem"
  	}else{
  		$x1=-$c/$b
  		$rs="PT co nghiem duy nhat: " .$x1
    }
 }else{
 	if ($delta<0) {
       $rs="PT vo nghiem" 
	}else{
	if ($delta==0) {
		$x1=((-$b+sqrt($delta))/(2 * $a));
		$x2=((-$b-sqrt($delta))/(2 * $a));
		$rs="PT co hai nghiem phan biet : x1= ".$x1."; x2= ".$x2
	}
 }
}
echo "Ket qua" .$rs;
?>
