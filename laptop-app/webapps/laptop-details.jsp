<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Laptop App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">

</head>

<body>
<a href="index.jsp" class="btn btn-outline-primary mt-3">Back</a>
    <p class="h1 text-center pt-3">Laptop Details Form</p>
    <p class="text-center pt-3 text-danger">${message}</p>
    <div class="container d-flex justify-content-center align-items-center">
        <div class="col-md-2 col-lg-5">
            <form class="p-3 fs-5" action="laptop" method="POST">
                <div class="mb-3">
                    <label for="brand" class="form-label">Brand</label>
                    <input type="text" class="form-control" id="brand" name="brand" value="${laptopDto.brand}">
                </div>
                <div class="mb-3">
                    <label for="model" class="form-label">Model</label>
                    <input type="text" class="form-control" id="model" name="model" value="${laptopDto.model}">
                </div>
                <div class="mb-3">
                    <label for="price" class="form-label">Price</label>
                    <input type="number" step="any" inputmode="decimal" class="form-control" id="price" name="price" value="${laptopDto.price}">
                </div>

                <div class="mb-3">
                    <label class="form-label">Availability</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="isAvailable" id="availableYes" value="Yes" ${laptopDto.available=="true"?'checked':''}>
                        <label class="form-check-label" for="availableYes">
                            Yes
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="isAvailable" id="availableNo" value="No" ${laptopDto.available=="false"?'checked':''}>
                        <label class="form-check-label" for="availableNo">
                            No
                        </label>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="warranty" class="form-label">Warranty</label>
                    <select class="form-select" id="warranty" name="warranty">
                        <option value="null" selected>Open this select menu</option>
                        <option value="No-warranty">No-Warranty</option>
                        <option value="6Months">6 months</option>
                        <option value="1Year">1 Year</option>
                        <option value="2Years">2 Years</option>

                    </select>
                </div>
                <div class="mb-3">
                    <label for="manufacturedDate" class="form-label">Manufactured Date</label>
                    <input type="date"  class="form-control" id="manufacturedDate" name="manufacturedDate" value="${laptopDto.manufacturedDate}">

                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>


    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
        integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
        crossorigin="anonymous"></script>
</body>

</html>