
let prism;

document.addEventListener("DOMContentLoaded", () => {
  prism = document.querySelector(".rec-prism");

  // Attach form submit handlers
  document.querySelectorAll("form").forEach(form => {
    form.addEventListener("submit", async function (event) {
      event.preventDefault();

      if (!form.checkValidity()) {
        return false;
      }

      const formData = new FormData(form);
      const username = formData.get("username") || formData.get("name");
      const mobile = formData.get("mobile");
      const profile = formData.get("profile") || "";

      // Get source page name from the heading
      const heading = form.closest(".face")?.querySelector("h2")?.innerText || "";
      const sourcePage = heading.split(" ").pop().toLowerCase(); // Assumes last word is the page name (e.g., Client, DSA)

      const data = { username, mobile, profile, sourcePage };

      try {
        const response = await fetch("http://localhost:8080/api/forms/submit", {
          method: "POST",
          headers: {
            "Content-Type": "application/json"
          },
          body: JSON.stringify(data)
        });

        if (response.ok) {
          showThankYou();
          form.reset();
        } else {
          alert("Submission failed.");
        }
      } catch (error) {
        console.error("Submission error:", error);
        alert("Server error. Try again.");
      }

      return false;
    });
  });
});

// Prism rotation functions
function showSignup() {
  prism.style.transform = "translateZ(-100px) rotateY(-90deg)";
}
function showLogin() {
  prism.style.transform = "translateZ(-100px)";
}
function showForgotPassword() {
  prism.style.transform = "translateZ(-100px) rotateY(-180deg)";
}
function showSubscribe() {
  prism.style.transform = "translateZ(-100px) rotateX(-90deg)";
}
function showContactUs() {
  prism.style.transform = "translateZ(-100px) rotateY(90deg)";
}
function showThankYou() {
  prism.style.transform = "translateZ(-100px) rotateX(90deg)";
}

