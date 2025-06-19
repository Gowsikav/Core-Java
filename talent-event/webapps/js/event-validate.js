document.querySelector("#talentForm").addEventListener("submit", function (e) {
    if (!validateForm()) {
        e.preventDefault();
    }
});

function validateForm() {
    let name = document.querySelector("#name").value;
    let age = document.querySelector("#age").value;
    let contact = document.querySelector("#contact").value;
    let talent = document.querySelector("#talent").value;
    let description = document.querySelector("#description").value;

    document.querySelectorAll(".error").forEach((err) => (err.textContent = ""));

    let isValid = true;

    if (name !== name.trim()) {
        document.querySelector("#nameError").textContent = "No spaces allowed at the beginning or end.";
        isValid = false;
    } else {
        name = name.trim();
    }

    if (name === "") {
        document.querySelector("#nameError").textContent = "Name is required";
        isValid = false;
    } else {
        let namePattern = /^[A-Za-z ]+$/;

        if (!namePattern.test(name)) {
            document.querySelector("#nameError").textContent = "Name must contain only letters and spaces.";
            isValid = false;
        }
        if (name.length < 3 || name.length > 25) {
            document.querySelector("#nameError").textContent = "Name length should be between 3 and 25 ";
            isValid = false;
        }
    }

    if (age === "") {
        document.querySelector("#ageError").textContent = "Age is required";
        isValid = false;
    }

    if (contact !== contact.trim()) {
        document.querySelector("#contactError").textContent = "No spaces allowed at the beginning or end.";
        isValid = false;
    } else {
        contact = contact.trim();
    }
    if (contact === "") {
        document.querySelector("#contactError").textContent = "Contact is required";
        isValid = false;
    } else {
        const phonePattern = /^[0-9]{10}$/;
        if (!phonePattern.test(contact)) {
            document.querySelector("#contactError").textContent = "Enter a valid 10-digit phone number.";
            isValid = false;
        }
    }

    if (talent === "") {
        document.querySelector("#talentError").textContent = "Talent Type is required";
        isValid = false;
    }

    if (description !== description.trim()) {
        document.querySelector("#descriptionError").textContent = "No spaces allowed at the beginning or end.";
        isValid = false;
    } else {
        description = description.trim();
    }
    if (description === "") {
        document.querySelector("#descriptionError").textContent = "Description/Title is required";
        isValid = false;
    } else {
        if (description.length < 5 || description.length > 200) {
            document.querySelector("#descriptionError").textContent = "Description should be between 5 and 200 characters.";
            isValid = false;
        }
    }
    return isValid;
}
