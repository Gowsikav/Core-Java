<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous" />
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg p-3 text-white fs-5 fw-bold" style="background:rgb(48 164 234 / 58%) !important;">
            <div class="container-fluid">
                <img class="navbar-brand"
                    src="data:image/png;base64,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"
                    alt="product icon" height="100" />
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
                            <a class="nav-link active" href="product.jsp">Product</a>
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
    <section class="bg-">
        <p class="h3 text-center pt-3">Product Details</p>
        <p class="text-center pt-3 text-danger">${message}</p>
        <div class="container d-grid" style="place-items: center; min-height: 50vh;">
            <div class="col-md-6 col-lg-5">
                <form class="p-3 fs-5" action="product" method="POST">
                    <div class="mb-3">
                        <label for="name" class="form-label">Product Name</label>
                        <input type="text" class="form-control" id="name" name="productName">
                    </div>
                    <div class="mb-3">
                        <label for="type" class="form-label">Product type</label>
                        <select class="form-select form-select-lg mb-3" id="type" name="type">
                            <option selected>Open this select menu</option>
                            <option value="Electronics">Electronics</option>
                            <option value="Clothing">Clothing</option>
                            <option value="Home Appliances">Home Appliances</option>
                            <option value="Books">Books</option>
                            <option value="Furniture">Furniture</option>
                            <option value="Beauty & Personal Care">Beauty & Personal Care</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="incomingPrice" class="form-label">Incoming Price</label>
                        <input type="number" class="form-control" id="incomingPrice" name="incomingPrice">
                    </div>
                    <div class="mb-3">
                        <label for="sellingPrice" class="form-label">Selling Price</label>
                        <input type="number" class="form-control" id="sellingPrice" name="sellingPrice">
                    </div>
                    <div class="mb-3">
                        <label for="mrp" class="form-label">Market Price</label>
                        <input type="number" class="form-control" id="mrp" name="marketPrice">
                    </div>
                    <div class="mb-3">
                        <label for="description" class="form-label">Description</label>
                        <input type="text" class="form-control" id="description" name="description">
                    </div>
                    <div class="mb-3">
                        <label for="brand" class="form-label">Brand</label>
                        <input type="text" class="form-control" id="brand" name="brand">
                    </div>
                    <div class="mb-3">
                        <label for="quantity" class="form-label">Quantity</label>
                        <input type="number" class="form-control" id="quantity" name="quantity">
                    </div>
                    <div class="mb-3">
                        <label for="color" class="form-label">Product Color</label>
                        <select class="form-select form-select-lg mb-3" id="color" name="color">
                            <option selected>Open this select menu</option>
                            <option value="Red">Red</option>
                            <option value="Green">Green</option>
                            <option value="Yellow">Yellow</option>
                            <option value="Black">Black</option>
                            <option value="White">White</option>
                            <option value="Blue">Blue</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="weight" class="form-label">Weight(in grams)</label>
                        <input type="number" class="form-control" id="weight" name="weight">
                    </div>
                    <div class="mb-3">
                        <label for="manufDate" class="form-label">Manufacturing Date</label>
                        <input type="date" class="form-control" id="manufDate" name="manufacturingDate">
                    </div>
                    <div class="mb-3">
                        <label for="warranty" class="form-label">Warranty</label>
                        <select class="form-select form-select-lg mb-3" id="warranty" name="warranty">
                            <option selected>Open this select menu</option>
                            <option value="no-warranty">No Warranty</option>
                            <option value="6-months">6 Months</option>
                            <option value="1-year">1 Year</option>
                            <option value="2-years">2 Years</option>
                            <option value="3-years">3 Years</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label class="form-label d-block">Return Policy</label>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="returnYes" name="returnPolicy"
                                value="yes">
                            <label class="form-check-label" for="returnYes">Yes</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="returnNo" name="returnPolicy"
                                value="no">
                            <label class="form-check-label" for="returnNo">No</label>
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>

    </section>

    <footer class="text-dark p-2" style="background:rgb(48 164 234 / 58%) !important;">
        <div class="container text-center text-md-start">
            <div class="row text-center">
                <div class="col-md-6 mb-2">
                    <h5 class="text-uppercase">Product App</h5>
                    <p>Bringing you the best service since 2020.</p>
                </div>
                <div class="col-md-4 mb-2">
                    <h5 class="text-uppercase">Contact</h5>
                    <p>Email: contact@product.com</p>
                    <p>Phone: +1 234 567 890</p>
                </div>
            </div>
        </div>

        <div class="text-center mb-2">
            &copy; 2025 Product App. All rights reserved.
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