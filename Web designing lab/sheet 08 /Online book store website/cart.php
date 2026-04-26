<?php
session_start();
$conn = new mysqli("localhost", "root", "", "bookstore");

if (isset($_GET['id'])) {
    $id = $_GET['id'];
    $result = $conn->query("SELECT * FROM books WHERE id=$id");
    $book = $result->fetch_assoc();
    $_SESSION['cart'][] = $book;
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Your Cart</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>🛒 Shopping Cart</h1>
    <ul>
        <?php if(!empty($_SESSION['cart'])) {
            foreach($_SESSION['cart'] as $item) { ?>
                <li><?php echo $item['title']; ?> - $<?php echo $item['price']; ?></li>
        <?php }} else { echo "<p>Your cart is empty.</p>"; } ?>
    </ul>
    <a class="btn" href="checkout.php">Proceed to Checkout</a>
</body>
</html>
