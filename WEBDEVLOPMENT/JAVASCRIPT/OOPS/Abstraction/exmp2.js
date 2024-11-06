function vehicle() {
  this.vehicleName = "vehicleName";
}
vehicle.prototype.display = function () {
  return "Vehicle is: " + this.vehicleName;
};

function Bike(vehicleName) {
  this.vehicleName = vehicleName;
}

Bike.prototype = Object.create(vehicle.prototype);
var bike = new Bike("Honda");
console.log(bike.display());
