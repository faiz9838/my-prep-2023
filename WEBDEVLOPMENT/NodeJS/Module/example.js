const http = require("http");
const date = require("./mymodule");

const data = date.myDareTime();
http
  .createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write(data);
    console.log("Server is ready..");
    res.end();
  })
  .listen(8080);
