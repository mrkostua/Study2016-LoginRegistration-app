<?php
session_start();    
$conn = new mysqli("mysql11.000webhost.com", "a7083098_user", "abcd1234", "a7083098_data");
$username = $_POST["username"];
$password = $_POST["password"];
$qry = "SELECT * FROM user WHERE username = $username AND password = $password";
$result =  $conn->query($qry);
$response = array();
$response["success"] = false;  
    
while($row = $result->fetch_assoc())
{
	$response["success"] = true;
	$response["userID"] = $row['userid'];
	$_SESSiON["userid"] = $response["userID"];   //Store userId in session
	$response["name"] = $row['name'];
	$response["age"] = $row['age'];
	$response["username"] = $row['username'];
	$response["password"] = $row['password'];
	$response["userPoints"] = $row['userPoints'];
}
echo json_encode($response);
session_destroy();

?>