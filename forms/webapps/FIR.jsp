<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>FIR Form</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <header>
      <nav class="navbar navbar-expand-lg bg-primary-subtle text-success">
        <div class="container-fluid">
          <img
            class="navbar-brand"
            src="data:image/png;base64,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"
            alt="forms icon"
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
                <a class="nav-link" aria-current="page" href="index.jsp"
                  >Home</a
                >
              </li>
              <li class="nav-item">
                <a class="nav-link" href="Donation.jsp">Donation</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" href="FIR.jsp">FIR</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="License.jsp">License</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="FeedBack.jsp">FeedBack</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="Laboratory.jsp">Laboratory</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input
                class="form-control me-2"
                type="search"
                placeholder="Search"
                aria-label="Search"
              />
              <button class="btn btn-outline-success" type="submit">
                Search
              </button>
            </form>
          </div>
        </div>
      </nav>
    </header>

    <main class="container my-3 col-md-6">
      <h2 class="fs-1 text-center">FIR Form</h2>
      <p class="fs-6 text-center text-danger">${message}</p>
      <form action="FIR" method="POST">
        <div class="mb-3">
          <label for="number" class="form-label">FIR Number</label>
          <input
            type="text"
            class="form-control"
            id="number"
            name="firNumber"
          />
        </div>
        <div class="mb-3 col-auto">
          <label for="date" class="form-label">FIR Date</label>
          <input
            type="date"
            class="form-control"
            id="date"
            name="firDate"
          />
        </div>
        <div class="mb-3">
          <label for="station" class="form-label">Police Station</label>
          <input type="text" class="form-control" name="policeStation" id="station" />
        </div>

        <div class="mb-3">
          <label for="CompliantName" class="form-label">Complainant Name</label>
          <input type="text" class="form-control" id="CompliantName" name="complainantName" />
        </div>

        <div class="mb-3">
          <label for="details" class="form-label">Incident Details</label>
          <input type="text" class="form-control" id="details" name="details" />
        </div>

        <input type="submit" class="bg-success text-white" value="Submit FIR" />
      </form>
    </main>

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
