#!/usr/bin/perl
# Simple :content generator

$total=1000;

while ($count++<$total){
    $aboutme=rand(10000);
    $ac_interest=rand(1000);
    $p_interest=rand(1000);
    $hobbies=rand(1000);
    print '{"elements":{"aboutme":{"value":"'.$aboutme.'"},"academicinterests":{"value":"'.$ac_interest.'"},"personalinterests":{"value":"'.$p_interest.'"},"hobbies":{"value":"'.$hobbies.'"}}}'."\n";
}
