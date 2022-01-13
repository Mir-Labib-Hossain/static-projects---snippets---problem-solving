 <?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "php_test";
    $conn = mysqli_connect($servername, $username, $password, $dbname);
    if (!$conn) {
        die("Connection failed: " . mysqli_connect_error());
    } else {
        echo "Connected successfully";
    }
    $name = mysqli_real_escape_string($conn, $_REQUEST['name']);
    $mail = mysqli_real_escape_string($conn, $_REQUEST['mail']);
    $sql = "insert into test_table (id,user_name,email) values (4,'$name','$mail')";
    if (mysqli_query($conn, $sql)) {
        echo "Added";
    } else {
        echo "Error" . mysqli_error($conn);
    }
    mysqli_close($conn);
