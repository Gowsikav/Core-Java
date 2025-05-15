<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Furniture</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <header>
      <nav class="navbar navbar-expand-lg bg-primary text-success">
        <div class="container-fluid">
          <img
            class="navbar-brand"
            src="data:image/png;base64,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"
            alt="furniture icon"
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
                <a class="nav-link active" aria-current="page" href="index.jsp"
                  >Home</a
                >
              </li>
              <li class="nav-item">
                <a class="nav-link" href="furniture.jsp">Furniture</a>
              </li>

            </ul>
            <form class="d-flex" role="search">
              <input
                class="form-control me-2"
                type="search"
                placeholder="Search"
                aria-label="Search"
              />
              <button class="btn btn-outline-success text-dark bg-success" type="submit">
                Search
              </button>
            </form>
          </div>
        </div>
      </nav>
    </header>

    <main class="container my-5">
      <h1 class="fs-1 text-center">Welcome to Furniture</h1>
    </main>

    <nav class="navbar fixed-bottom bg-primary text-black">
      <div class="container-fluid justify-content-center">
        <span class="navbar-text">
          &copy; 2025 Furniture details Management App. All rights reserved.
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
