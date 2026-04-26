<?php
$conn = new mysqli("localhost", "root", "", "bookstore");
if ($conn->connect_error) { die("Connection failed: " . $conn->connect_error); }
$result = $conn->query("SELECT * FROM books");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Online Bookstore</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <h1>📚 Welcome to Our Bookstore</h1>
        <nav>
            <a href="index.php">Home</a> | 
            <a href="cart.php">Cart</a>
        </nav>
    </header>
    <main>
        <div class="book-list">
            <?php while($row = $result->fetch_assoc()) { ?>
                <div class="book">
                    <img src="images/<?php echo $row['image']; ?>" alt="<?php echo $row['title']; ?>">
                    <h2><?php echo $row['title']; ?></h2>
                    <p>by <?php echo $row['author']; ?></p>
                    <p class="price">$<?php echo $row['price']; ?></p>
                    <a class="btn" href="cart.php?id=<?php echo $row['id']; ?>">Add to Cart</a>
                </div>
            <?php } ?>
        </div>
    </main>
</body>
</html>
