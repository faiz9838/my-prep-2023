// Animate Navbar
gsap.from(".w3-sidebar", {
  duration: 1,
  x: -200,
  opacity: 0,
  ease: "power2.out",
});

// Animate Header
gsap.from("header", { duration: 1, opacity: 0, y: -50, ease: "power2.out" });

// Animate About Section
gsap.from("#about", {
  duration: 1,
  opacity: 0,
  y: -50,
  ease: "power2.out",
  delay: 0.5,
});

// Animate Photos Section
gsap.from("#photos", {
  duration: 1,
  opacity: 0,
  y: -50,
  ease: "power2.out",
  delay: 0.5,
});

// Animate Contact Section
gsap.from("#contact", {
  duration: 1,
  opacity: 0,
  y: -50,
  ease: "power2.out",
  delay: 0.5,
});

//Signup and Login

function validateForm() {
  var name = document.forms["signupForm"]["Name"].value;
  var email = document.forms["signupForm"]["Email"].value;
  var password = document.forms["signupForm"]["Password"].value;

  // Basic validation, you can customize as needed
  if (name === "" || email === "" || password === "") {
    alert("All fields must be filled out");
    return false;
  }

  // Additional validation logic (e.g., email format, password strength)

  // If all validations pass, the form is submitted
  return true;
}

// Add this script in your existing JavaScript or within a <script> tag
function showSignupForm() {
  document.getElementById("signupFormContainer").style.display = "block";
}

function validateAndSignup() {
  var name = document.getElementById("name").value;
  var email = document.getElementById("email").value;
  var password = document.getElementById("password").value;

  // Perform validation here (e.g., check if fields are not empty, validate email, etc.)
  if (name === "" || email === "" || password === "") {
    alert("All fields must be filled out");
    return false;
  }

  // Perform signup logic (e.g., send data to the server)

  // Optionally, you can reset the form after successful signup
  document.getElementById("signupForm").reset();

  // Hide the form after signup
  document.getElementById("signupFormContainer").style.display = "none";

  // Prevent the form from submitting
  return false;
}
