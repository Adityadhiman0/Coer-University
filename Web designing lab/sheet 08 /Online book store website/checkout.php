<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Checkout</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>💳 Checkout</h1>
    <form method="post" action="order.php">
        <label>Name:</label><input type="text" name="name" required><br>
        <label>Email:</label><input type="email" name="email" required><br>
        <input class="btn" type="submit" value="Place Order">
    </form>
</body>
</html>
