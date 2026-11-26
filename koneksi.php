<?php
    $host = "localhost";
    $user = "root";
    $pass = "";
    $db = "tiumy";
    $port = '3306';

    $koneksi = mysqli_connect($host, $user, $pass, $db, $port) or die("Koneksi gagal");
