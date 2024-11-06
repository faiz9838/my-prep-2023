const { log } = require("console");

const addition = async (a, b) => {
  let result = await (a + b);
  return result;
};

addition(10, 20).then((data) => console.log(data));
