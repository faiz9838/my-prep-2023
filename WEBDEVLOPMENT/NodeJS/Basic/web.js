const { log } = require("console");
const http = require("http");

http
  .createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/plain" });
    res.end("Server based web application");
  })
  .listen(5000, () => {
    console.log("Server is ready");
  });
