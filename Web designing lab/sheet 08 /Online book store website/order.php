<?php
session_start();
$name = $_POST['name'];
$email = $_POST['email'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Confirmation</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>✅ Thank you, <?php echo $name; ?>!</h1>
    <p>Your order has been placed. A confirmation will be sent to <strong><?php echo $email; ?></strong>.</p>
    <?php unset($_SESSION['cart']); ?>
    <a class="btn" href="index.php">Back to Home</a>
</body>
</html>
