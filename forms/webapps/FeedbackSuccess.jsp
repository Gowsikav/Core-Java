<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>FeedBack</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
            crossorigin="anonymous"
    />
  </head>
  <body>
  <a href="index.jsp" class="btn btn-outline-primary position-absolute top-0 start-0 m-2">Back to Home</a>
  <div class="container text-center mt-5 pt-5">
    <div class="card shadow p-4 border-success">
      <h2 class="text-success mb-3">Feedback Submitted Successfully</h2>
      <table class="table table-borderless w-50 mx-auto text-start">
        <tbody>
        <tr>
          <td class="fw-bold">Name:</td>
          <td>${name}</td>
        </tr>
        <tr>
          <td class="fw-bold">Email-ID:</td>
          <td>${email}</td>
        </tr>
        <tr>
          <td class="fw-bold">Ratings</td>
          <td>${rating}</td>
        </tr>
        <tr>
          <td class="fw-bold">Comments:</td>
          <td>${comments}</td>
        </tr>
        </tbody>
      </table>
      <p class="fs-5">Thank you for your feedback! We appreciate your time and input.</p>
    </div>
  </div>

  <nav class="navbar fixed-bottom bg-primary-subtle text-black">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">
          &copy; 2025 Form Management App. All rights reserved.
        </span>
    </div>
  </nav>

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
