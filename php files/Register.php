<?php
    $con = mysqli_connect("mysql11.000webhost.com", "a7083098_user", "abcd1234", "a7083098_data");
    
    $name = $_POST["name"];
    $age = $_POST["age"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $userPoints = $_POST["userPoints"];
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, age, password, userPoints) VALUES (?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "sissi", $name, $username, $age, $password, $userPoints);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>