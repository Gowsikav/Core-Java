<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Room Booking</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
            crossorigin="anonymous"
    />
</head>

<body>
<header>
    <nav
            class="navbar navbar-expand-lg p-3 text-white fs-5 fw-bold" style="background:rgb(48 164 234 / 58%) !important;"
    >
        <div class="container-fluid">
            <img
                    class="navbar-brand"
     src="data:image/png;base64,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"                    alt="product icon"
                    height="100"
            />
            <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
            >
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="room-book.jsp">Book Room</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input
                            class="form-control me-2"
                            type="search"
                            placeholder="Search"
                            aria-label="Search"
                    />
                    <button
                            class="btn btn-outline-success bg-success text-white"
                            type="submit"
                    >
                        Search
                    </button>
                </form>
            </div>
        </div>
    </nav>
</header>
<section>
    <p class="h1 text-center pt-3">Welcome to Room Booking</p>
</section>

<footer class="text-dark fixed-bottom p-2" style="background:rgb(48 164 234 / 58%) !important;">
    <div class="container text-center text-md-start">
        <div class="row text-center">
            <div class="col-md-6 mb-2">
                <h5 class="text-uppercase">Room Booking App</h5>
                <p>Bringing you the best service since 2020.</p>
            </div>
            <div class="col-md-4 mb-2">
                <h5 class="text-uppercase">Contact</h5>
                <p>Email: contact@room.com</p>
                <p>Phone: +91 6730027930</p>
            </div>
        </div>
    </div>

    <div class="text-center mb-2">
        &copy; 2025 Room Book App. All rights reserved.
    </div>
</footer>

<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"
></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
        integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
        crossorigin="anonymous"
></script>
</body>
</html>
