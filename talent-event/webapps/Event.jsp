<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Talent Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous" />
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg p-3 text-white fs-5 fw-bold"
            style="background:rgba(219, 112, 231, 0.58) !important;">
            <div class="container-fluid">
                <img class="navbar-brand" src="images/event-icon.png" alt="RCB icon" height="100" />
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
                            <a class="nav-link active" href="Event.jsp">Event Register</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="FindById.jsp">Find Event</a>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                        <button class="btn btn-outline-success text-white" type="submit">
                            Search
                        </button>
                    </form>
                </div>
            </div>
        </nav>
    </header>
    <section>
        <p class="h1 text-center pt-3">Talent Show Register</p>
        <p class="text-center pt-3 text-danger">${failedMessage}</p>
         <p class="text-center pt-3 text-success">${successMessage}</p>
        <div class="container d-grid" style="place-items: center; min-height: 50vh;">
            <div class="col-md-6 col-lg-5">
                <form class="p-3 fs-5" action="talent" method="POST" id="talentForm">
                    <div class="mb-3">
                        <label for="name" class="form-label">Name</label>
                        <input type="text" class="form-control" id="name" name="name" value="${talentEventDto.name}" required>
                        <span class="error text-danger small" id="nameError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="age" class="form-label">Age Group</label>
                        <select class="form-select" aria-label="Default select example" id="age" name="age" required>
                            <option value="" selected>Open this select menu</option>
                            <option value="Under 12">Under 12</option>
                            <option value="13-17">13-17</option>
                            <option value="Above 18">Above 18</option>
                        </select>
                        <span class="error text-danger small" id="ageError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="contact" class="form-label">Contact Number</label>
                        <input type="tel" class="form-control" id="contact" name="contact" value="${talentEventDto.contact}" required>
                        <span class="error text-danger small" id="contactError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="talent" class="form-label">Type of Talent</label>
                        <select class="form-select" aria-label="Default select example" id="talent" name="talent" required>
                            <option value="" selected>Open this select menu</option>
                            <option value="Singing">Singing</option>
                            <option value="Dancing">Dancing</option>
                            <option value="Playing a Musical Instrument">Playing a Musical Instrument</option>
                            <option value="Magic Tricks">Magic Tricks</option>
                            <option value="Stand-up Comedy">Stand-up Comedy</option>
                            <option value="Poetry">Poetry</option>
                            <option value="Acting">Acting</option>
                            <option value="Mime">Mime</option>
                            <option value="Martial Arts Demonstration">Martial Arts Demonstration</option>
                            <option value="Acrobatics">Acrobatics</option>
                            <option value="Painting">Painting</option>
                            <option value="storytelling">Storytelling</option>
                            <option value="fashion">Fashion Walk</option>
                        </select>
                        <span class="error text-danger small" id="talentError"></span>
                    </div>
                    <div class="mb-3">
                        <label for="description" class="form-label">Performance Title or Description:</label>
                        <textarea class="form-control" placeholder="Title/Description" id="description" name="description" 
                            required>${talentEventDto.description}</textarea>
                        <span class="error text-danger small" id="descriptionError"></span>
                    </div>

                    <button type="submit" class="btn btn-primary">Register</button>
                </form>
            </div>
        </div>

    </section>

    <footer class="text-dark p-2" style="background:rgba(219, 112, 231, 0.58) !important;">
        <div class="container text-center text-md-start">
            <div class="row text-center">
                <div class="col-md-6 mb-2">
                    <h5 class="text-uppercase">Event Management</h5>
                    <p>Talent is a flame. Passion is the fire that makes it shine.</p>
                </div>
                <div class="col-md-4 mb-2">
                    <h5 class="text-uppercase">Contact</h5>
                    <p>Email: contact@event.com</p>
                    <p>Phone: +91 9730737930</p>
                </div>
            </div>
        </div>

    </footer>
    <script src="js/event-validate.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
        integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
        crossorigin="anonymous"></script>
</body>

</html>