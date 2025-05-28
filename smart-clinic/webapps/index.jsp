<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SmartClinic</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">

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
                            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Login</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Register</a>
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

    <main class="container-fluid px-4 py-3 ">
        <div class="card w-100" style="min-height: 450px; border:none;">
            <div class="row g-0 h-100">

                <div class="col-md-5">
                    <img src="images/side-image.png" class="img-fluid h-100 w-100 rounded-start object-fit-cover"
                        alt="Doctor and patient illustration">
                </div>

                <div class="col-md-7 d-flex align-items-center">
                    <div class="card-body">
                        <h2 class="card-title">Welcome to Smart Clinic App</h2>
                        <p class="card-text fs-5">
                            The Smart Clinic App streamlines patient care by offering easy appointment
                            booking, real-time health tracking, and secure communication with healthcare providers all
                            in one place.
                        </p>

                        <a href="appointment.jsp" class="btn btn-primary mt-3">Book an Appointment</a>
                    </div>
                </div>
            </div>
        </div>
    </main>

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