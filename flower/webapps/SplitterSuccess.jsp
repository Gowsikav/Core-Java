<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Expense Splitter App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous" />
</head>

<body>
<header>
    <nav class="navbar navbar-expand-lg p-3 text-white fs-5 fw-bold"
         style="background:rgb(48 164 234 / 58%) !important;">
        <div class="container-fluid">
            <img class="navbar-brand"
                 src="images/img.png"
                 alt="RCB icon" height="100" />
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link " aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="Splitter.jsp">Splitter Form</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                    <button class="btn btn-outline-success bg-success text-white" type="submit">
                        Search
                    </button>
                </form>
            </div>
        </div>
    </nav>
</header>
<section>
    <br>
    <br>
<center>
    <h2>Bill Splitting</h2>
    <p>Total Amount: $${totalAmount}</p>
    <p>Number of People: ${people}</p>
    <p>Each person should pay: $${splitAmount}</p>
</center>
</section>

<footer class="text-dark fixed-bottom p-2" style="background:rgb(48 164 234 / 58%) !important;">
    <div class="container text-center text-md-start">
        <div class="row text-center">
            <div class="col-md-6 mb-2">
                <h5 class="text-uppercase">Expense Splitter App</h5>
            </div>
            <div class="col-md-4 mb-2">
                <h5 class="text-uppercase">Contact</h5>
                <p>Email: contact@splitter.com</p>
                <p>Phone: +91 6730027930</p>
            </div>
        </div>
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