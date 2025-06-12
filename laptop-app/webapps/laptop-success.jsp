<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Laptop App</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.css" />
  </head>

  <body>
    <a href="index.jsp" class="btn btn-outline-primary mt-3">Back</a>
    <p class="text-center pt-3 text-success">${message}</p>
    <div
      class="container d-flex justify-content-center align-items-center mt-3 w-50"
    >
      <table class="table table-info table-striped table-border border-black">
        <tbody>
          <tr>
            <th scope="col">Brand</th>
            <td>${laptopDto.brand}</td>
          </tr>
          <tr>
            <th scope="col">Model</th>
            <td>${laptopDto.model}</td>
          </tr>
          <tr>
            <th scope="col">Price</th>
            <td>${laptopDto.price}</td>
          </tr>
          <tr>
            <th scope="col">Availability</th>
            <td>${laptopDto.available}</td>
          </tr>
          <tr>
            <th scope="col">Warranty</th>
            <td>${laptopDto.warranty}</td>
          </tr>
          <tr>
            <th scope="col">Manufactured Date</th>
            <td>${laptopDto.manufacturedDate}</td>
          </tr>
        </tbody>
      </table>
    </div>

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
