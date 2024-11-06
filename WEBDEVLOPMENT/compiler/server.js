const express = require("express");
const bodyParser = require("body-parser");
// Serve static files from the "public" directory

const app = express();
const port = 3000; // Change this to your desired port

// Middleware to parse JSON bodies
app.use(bodyParser.json());
app.use(express.static("public"));

// POST endpoint to execute code
app.post("/execute", (req, res) => {
  // Extract language and code from the request body
  const { language, code } = req.body;

  let output = "";

  try {
    switch (language) {
      case "cpp":
        // Execute C++ code
        output = executeCppCode(code);
        break;
      case "java":
        // Execute Java code
        output = executeJavaCode(code);
        break;
      case "python":
        // Execute Python code
        output = executePythonCode(code);
        break;
      default:
        throw new Error("Unsupported language");
    }
  } catch (error) {
    // Handle any errors that occur during code execution
    output = error.message;
  }

  // Send the output as JSON response
  res.json({ output });
});

// Start the server
app.listen(port, () => {
  console.log(`Server is listening at http://localhost:${port}`);
});

// Functions to execute code in respective languages (placeholders)
function executeCppCode(code) {
  // Here you would compile and execute C++ code and return the output
  // For demonstration, we'll just return a dummy output
  return "C++ code execution output";
}

function executeJavaCode(code) {
  // Here you would compile and execute Java code and return the output
  // For demonstration, we'll just return a dummy output
  return "Java code execution output";
}

function executePythonCode(code) {
  // Here you would execute Python code and return the output
  // For demonstration, we'll just return a dummy output
  return "Python code execution output";
}
