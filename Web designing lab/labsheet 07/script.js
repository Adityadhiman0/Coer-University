// script.js
document.getElementById("contactForm").addEventListener("submit", function(event) {
  event.preventDefault(); // prevent page reload

  let name = document.getElementById("name").value.trim();
  let email = document.getElementById("email").value.trim();
  let message = document.getElementById("message").value.trim();

  if (name === "" || email === "" || message === "") {
    alert("Please fill in all fields.");
    return;
  }

  // Basic email validation
  let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
  if (!email.match(emailPattern)) {
    alert("Please enter a valid email address.");
    return;
  }

  alert("Thank you, " + name + "! Your message has been sent.");
  document.getElementById("contactForm").reset();
});
