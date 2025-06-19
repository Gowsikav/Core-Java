document.querySelector("#eventId").addEventListener("submit", function (e) {
    if (!validateId()) {
        e.preventDefault();
    }
});

function validateId() {
    let eventId = document.querySelector("#eventId").value.trim();
    let errorSpan = document.querySelector("#idError");
    errorSpan.textContent = "";

    let isValid = true;

    if (eventId !== document.querySelector("#eventId").value) {
        errorSpan.textContent = "No spaces allowed at the beginning or end.";
        isValid = false;
    }

    if (!/^\d+$/.test(eventId)) {
        errorSpan.textContent = "Only numeric characters allowed.";
        isValid = false;
    }

    return isValid;
}
