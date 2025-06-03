<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>

<body>

    <a href="index.jsp" class="btn btn-outline-primary mt-3">Back</a>

    <div class="container d-flex justify-content-center align-items-center mt-3">
        <table class="table table-success table-striped">
            <tbody>
                <tr>
                    <th scope="col">Product ID</th>
                    <td>${productDto.productID}</td>
                </tr>
                <tr>
                    <th scope="col">Product Name</th>
                    <td>${productDto.productName}</td>
                </tr>
                 <tr>
                    <th scope="col">Quantity</th>
                    <td>${productDto.quantity}</td>
                </tr>
                <tr>
                    <th scope="col">Price</th>
                    <td>${productDto.price}</td>
                </tr>
                <tr>
                    <th scope="col">Category</th>
                    <td>${productDto.category}</td>
                </tr>
            </tbody>
        </table>
        </form>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
        integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
        crossorigin="anonymous"></script>
</body>

</html>