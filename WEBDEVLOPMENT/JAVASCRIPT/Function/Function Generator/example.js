function* add() {
  yield 11;
  yield 2;
}

let gen = add();
console.log(gen.next().value);
