<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Weather App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous" />
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg p-3 text-white fs-5 fw-bold"
            style="background:rgb(48 164 234 / 58%) !important;">
            <div class="container-fluid">
                <img class="navbar-brand" src="images/weather-icon.png" alt="RCB icon" height="100" />
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
                            <a class="nav-link active" href="weather.jsp">Weather Form</a>
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
        <p class="h1 text-center pt-3">Weather Details Form</p>
        <p class="text-center pt-3 text-danger">${message}</p>
        <div class="container d-grid" style="place-items: center; min-height: 50vh;">
            <div class="col-md-6 col-lg-5">
                <form class="p-3 fs-5" action="weather" method="POST">
                    <div class="mb-3">
                        <label for="placeName" class="form-label">Place Name</label>
                        <input type="text" class="form-control" id="placeName" name="placeName">
                    </div>
                    <div class="mb-3">
                        <label for="weather" class="form-label">Weather</label>
                        <input type="text" class="form-control" id="weather" name="weather">
                    </div>
                    <div class="mb-3">
                        <label for="minTemp" class="form-label">Min Temp (&deg;C)</label>
                        <input type="number" step="0.01" inputmode="decimal" class="form-control" id="minTemp" name="minTemp">
                    </div>
                    <div class="mb-3">
                        <label for="maxTemp" class="form-label">Max Temp (&deg;C)</label>
                        <input type="number" step="0.01" inputmode="decimal" class="form-control" id="maxTemp" name="maxTemp">
                    </div>
                    <div class="mb-3">
                        <label for="maxTemp" class="form-label">Cloudy</label>
                        <select class="form-select" id="cloudy" name="cloudy">
                            <option value="Yes">Yes</option>
                            <option value="No">No</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="raining" class="form-label">Raining</label>
                        <select class="form-select" id="raining" name="raining">
                            <option value="Yes">Yes</option>
                            <option value="No">No</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="rain" class="form-label">Rain (mm)</label>
                        <input type="number" step="0.01" inputmode="decimal" class="form-control" id="rain" name="rain">
                    </div>
                    <div class="mb-3">
                        <label for="rain" class="form-label">Humidity (%)</label>
                        <input type="number" class="form-control" id="humidity" name="humidity" max="100" min="0">
                    </div>
                    <div class="mb-3">
                        <label for="windSpeed" class="form-label">Wind Speed (km/h)</label>
                        <input type="number" step="0.01" inputmode="decimal" class="form-control" id="windSpeed" name="windSpeed">
                    </div>
                    <div class="mb-3">
                        <label for="precipitation" class="form-label">Precipitation (%)</label>
                        <input type="number" step="0.01" inputmode="decimal" class="form-control" id="precipitation" name="precipitation" max="100"
                            min="0">
                    </div>
                    <div class="mb-3">
                        <label for="sunRiseTime" class="form-label">Sun Rise Time</label>
                        <input type="time" class="form-control" id="sunRiseTime" name="sunRiseTime" step="1">
                    </div>
                    <div class="mb-3">
                        <label for="sunSetTime" class="form-label">Sun Set Time</label>
                        <input type="time" class="form-control" id="sunSetTime" name="sunSetTime" step="1">
                    </div>
                    <div class="mb-3">
                        <label for="moonRiseTime" class="form-label">Moon Rise Time</label>
                        <input type="time" class="form-control" id="moonRiseTime" name="moonRiseTime" step="1">
                    </div>
                    <div class="mb-3">
                        <label for="moonSetTime" class="form-label">Moon Set Time</label>
                        <input type="time" class="form-control" id="moonSetTime" name="moonSetTime" step="1">
                    </div>
                    <div class="mb-3">
                        <label for="rainStartTime" class="form-label">Rain Start Time</label>
                        <input type="time" class="form-control" id="rainStartTime" name="rainStartTime" step="1">
                    </div>
                    <div class="mb-3">
                        <label for="rainEndTime" class="form-label">Rain End Time</label>
                        <input type="time" class="form-control" id="rainEndTime" name="rainEndTime" step="1">
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
                    <h5 class="text-uppercase">Weather App</h5>
                    <p>Your emotions are like weather patterns: they come and they go</p>
                </div>
                <div class="col-md-4 mb-2">
                    <h5 class="text-uppercase">Contact</h5>
                    <p>Email: contact@weather.com</p>
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