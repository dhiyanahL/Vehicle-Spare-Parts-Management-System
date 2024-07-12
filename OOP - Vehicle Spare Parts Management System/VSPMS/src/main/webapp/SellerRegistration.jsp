<!-- IT22055262 - LIYAUDEEN D.H - Seller CRUD -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Seller Registration</title>

    <script>
        function validateForm() {
            var emailInput = document.getElementsByName("email")[0];
            var email = emailInput.value.trim();
            var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            var phoneNumber = document.getElementsByName("phone")[0].value.trim();

            var usernameInput = document.getElementsByName("uid")[0];
            var username = usernameInput.value.trim();

            var password = document.getElementsByName("psw")[0].value;
            var confirmPassword = document.getElementsByName("confirmPsw")[0].value;

            //Validate email
            if (!emailRegex.test(email)) {
               emailInput.setCustomValidity("Please enter a valid email address.");
               return false;
            } else {
               emailInput.setCustomValidity("");
            }

            // Validate phone number
            if (phoneNumber.length !== 10) {
                alert("Phone number must be exactly 10 characters long.");
                return false;
            }

            // Validate username
            if (username.length < 5) {
                usernameInput.setCustomValidity("Username must be at least 5 characters long.");
                return false;
            } else {
                usernameInput.setCustomValidity("");
            }

            // Validate passwords
            if (password !== confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }

            // All validations passed
            return true;
        }
    </script>

    <link rel="stylesheet" type="text/css" href="css/SellerRegistration.css" />
</head>
<body>
    <form action="register" method="post" onsubmit="return validateForm()">
        <div class="label">Name</div>
        <input type="text" name="name" placeholder="Name" required><br>
        <div class="label">Email</div>
        <input type="email" name="email" placeholder="abc@gmail.com" required><br>
        <div class="label">Phone Number</div>
        <input type="text" name="phone" placeholder="0781235678" required><br>
        <div class="label">User name</div>
        <input type="text" name="uid" placeholder="Username" required><br>
        <div class="label">Password</div>
        <input type="password" name="psw" placeholder="Password" required><br>
        <div class="label">Confirm Password</div>
        <input type="password" name="confirmPsw" placeholder="Password" required><br>

        <input type="submit" name="submit" value="Create Account">
        <br><br>
        <div class="text">Already have an account?
            <a href="SellerLogin.jsp"><span style="color: white;">Login</span></a>
        </div>
    </form>
</body>
</html>

