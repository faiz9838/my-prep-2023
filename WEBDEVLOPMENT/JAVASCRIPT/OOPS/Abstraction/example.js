function person(fname, lname) {
  let firstname = fname;
  let lastname = lname;

  let getDetails_noAccess = function () {
    return `First name is: ${firstname} Last name is: ${lastname}`;
  };

  this.getDetails_Access = function () {
    return `First name is: ${firstname}, Latsname is: ${lastname}`;
  };
}

let person1 = new person("Faiz", "Ahmad");
console.log(person1.getDetails_noAccess);
console.log(person1.getDetails_Access());
