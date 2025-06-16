document.querySelector("#formValid").addEventListener("submit",function(e)
{
  if(validateId())
  {
    e.preventDefault();
  }

})

function validateId() {
  const brandId = document.querySelector("#laptopId").value.trim();

  if (brandId === "") {
    document.querySelector("#laptopIdError").textContent = "Brand ID should not be empty";
    return true;
  }

  if (isNaN(brandId)) {
    document.querySelector("#laptopIdError").textContent = "Brand ID should be a number";
    return true;
  }

  if (brandId<=0) {
    document.querySelector("#laptopIdError").textContent = "Brand ID should be a greater than 0";
    return true;
  }
  document.querySelector("#laptopIdError").textContent = "";
  return false;
}
