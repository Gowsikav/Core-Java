<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <style>
        .input-color {
            border: 2px solid rgb(127, 209, 241);
        }

        .form-style {
            width: 100%;
            max-width: 400px;
            border: 2px solid;
            border-color: rgba(14, 147, 184, 0.893);
        }
    </style>
</head>

<body>
<header>
    <nav class="navbar navbar-expand-lg" style="background-color: rgb(50 181 192) !important;">
        <div class="container-fluid">
            <img class="navbar-brand" src="images/smartclinic-icon.png" alt="SmartClinic icon" height="100">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="index.jsp">Home</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link active" href="#">Register</a>
                    </li>

                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                    <button class="btn btn-outline-success text-light bg-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</header>

<div class="container d-flex justify-content-center align-items-center mt-3">
    <form class="form-style p-4 rounded shadow" action="register" method="POST">
        <h3 class="text-center mb-4">Registration Form</h3>
        <p class="text-center mb-4 text-danger">${message}</p>

        <div class="mb-3">
            <label for="name" class="form-label">Full Name</label>
            <input type="text" class="input-color form-control" id="name" name="fullName">
        </div>
        <div class="mb-3">
            <label for="date" class="form-label">Date of Birth</label>
            <input type="date" class="input-color form-control" id="date" name="date">
        </div>
        <div class="mb-3">
            <label for="phone" class="form-label">Phone Number</label>
            <input type="tel" class="input-color form-control" id="phone" name="phoneNumber">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email-ID</label>
            <input type="email" class="input-color form-control" id="email" name="email">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="input-color form-control" id="password" name="password">
        </div>
        <div class="mb-3">
            <label for="conf-password" class="form-label">Confirm Password</label>
            <input type="password" class="input-color form-control" id="conf-password" name="confirmPassword">
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="input-color form-control" id="address" name="address">
        </div>

        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>

<footer class="text-center text-lg-start mt-4 border-top" style="background-color: rgb(50 181 192) !important;">
    <div class="container py-4">
        <div class="row">

            <div class="col-lg-6 col-md-12 mb-4 mb-md-0 text-start">
                <h5 class="text-uppercase">Smart Clinic App</h5>
                <p class="mb-0">
                    Empowering healthcare through seamless digital experiences book appointments, track your health,
                    and connect with your doctor securely.
                </p>
            </div>

            <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                <h6 class="text-uppercase">Contact</h6>
                <p class="mb-0">Email: support@smartclinic.com</p>
                <p>Phone: +1 (555) 123-4567</p>
            </div>
        </div>
    </div>

    <div class="text-center py-3 text-muted">
        &copy; 2025 Smart Clinic. All rights reserved.
    </div>
</footer>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
        integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
        crossorigin="anonymous"></script>
</body>

</html>