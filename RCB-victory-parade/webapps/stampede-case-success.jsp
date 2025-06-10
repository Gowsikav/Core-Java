<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Stampede Case</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous" />
</head>

<body>
 <a href="index.jsp" class="btn btn-outline-primary mt-3">Back</a>
 <p class="text-center pt-3 text-success">${message}</p>
    <div class="container d-flex justify-content-center align-items-center mt-3 w-50">
       
        <table class="table table-info table-striped table-border border-black">
            <tbody>
                <tr>
                    <th scope="col">Event Name</th>
                    <td>${stampedeCaseDto.event}</td>
                </tr>
                <tr>
                    <th scope="col">Location</th>
                    <td>${stampedeCaseDto.location}</td>
                </tr>
                 <tr>
                    <th scope="col">No of Death Count</th>
                    <td>${stampedeCaseDto.deathsCount}</td>
                </tr>
                <tr>
                    <th scope="col">No of Injuries Count</th>
                    <td>${stampedeCaseDto.injuriesCount}</td>
                </tr>
                
            </tbody>
        </table>
        </form>
    </div>

<footer class="text-dark p-2 fixed-bottom" style="background:rgb(48 164 234 / 58%) !important;">
    <div class="container text-center text-md-start">
        <div class="row text-center">
            <div class="col-md-6 mb-2">
                <h5 class="text-uppercase">RCB Victory Parade</h5>
                <p>Ee Sala Cup Namdu</p>

            </div>
            <div class="col-md-4 mb-2">
                <h5 class="text-uppercase">Contact</h5>
                <p>Email: contact@parade.com</p>
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