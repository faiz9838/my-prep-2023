const express = require("express");

const app = express();

const port = 3000;

app.use((req, res, next) => {
  res.header("Access-Control-Allow-Origin", "React app URL");
  res.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
  res.header("Access-Control-Allow-Headers", "Content-Type");
  next();
});
app.get("/api/jokes", (req, res) => {
  const jokes = [
    {
      id: 1,
      content:
        "What do you call people who pretend to be Irish on St. Patrick's Day? Counterfitz",
    },
    {
      id: 2,
      content:
        "What did one wall say to the other wall? I`ll meet you at the corner.",
    },
    {
      id: 3,
      content:
        "I thought about starting a business selling halos... ...but the cost of overheads was too high.",
    },
    {
      id: 4,
      content:
        "What happens if you pass gas in church? You have to sit in your own pew.",
    },
    {
      id: 5,
      content: "What's a dog's favorite mode of transportation? A waggin'",
    },
    {
      id: 6,
      content:
        "Why couldn't the melons be together? Everyone knows melons cantaloupe.",
    },
  ];

  res.send(jokes);
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
