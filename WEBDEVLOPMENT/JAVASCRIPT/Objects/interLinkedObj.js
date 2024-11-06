function marry(man, woman) {
  woman.husband = man;
  man.wife = woman;

  return {
    father: man,
    mother: woman,
  };
}

let family = marry({ father: "Faiz Ahmad" }, { mother: "Shaikh Tahoora" });
console.log(family.father, family.mother);
