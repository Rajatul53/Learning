var reviews = [2.5, 3, 4.5, 3, 5.5, 7, 9];
var total = 0;
for (var i = 0; i < reviews.length; i++) {
    total += reviews[i];
}
console.log("total = ".concat(total));
console.log("Average rating = " + total / reviews.length);
