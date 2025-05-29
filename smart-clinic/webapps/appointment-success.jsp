<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Appointment</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>

<body>

    <a href="index.jsp" class="btn btn-outline-primary mt-3">Back</a>

    <div class="container d-flex justify-content-center align-items-center mt-3">
        <table class="table table-success table-striped">
            <tbody>
                <tr>
                    <th scope="col">Patient Name</th>
                    <td>${appointmentDto.patientName}</td>
                </tr>
                <tr>
                    <th scope="col">Date</th>
                    <td>${appointmentDto.date}</td>
                </tr>
                <tr>
                    <th scope="col">TimeSlot</th>
                    <td>${appointmentDto.timeSlot}</td>
                </tr>

                <tr>
                    <th scope="col">Doctor Name</th>
                    <td>${appointmentDto.doctorName}</td>
                </tr>
            </tbody>
        </table>
        </form>
    </div>

    <footer class="text-center text-lg-start mt-4 border-top fixed-bottom" style="background-color: rgb(50 181 192) !important;">
        <div class="container py-4">
            <div class="row">

                <div class="col-lg-6 col-md-12 mb-4 mb-md-0 text-start">
                    <h5 class="text-uppercase">Smart Clinic App</h5>
                    <p class="mb-0">
                        Empowering healthcare through seamless digital experiences book appointments, track your health,
                        and connect with your doctor securely.
                    </p>
                </div>

                <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                    <h6 class="text-uppercase">Contact</h6>
                    <p class="mb-0">Email: support@smartclinic.com</p>
                    <p>Phone: +1 (555) 123-4567</p>
                </div>
            </div>
        </div>

        <div class="text-center py-3 text-muted">
            &copy; 2025 Smart Clinic. All rights reserved.
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