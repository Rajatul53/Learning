let reviews: number[] = [2.5, 3, 4.5, 3, 5.5, 7, 9];

let total: number = 0;
for (let i = 0; i < reviews.length; i++) {
    total += reviews[i];
}
console.log(`total = ${total}`);
console.log("Average rating = " + total / reviews.length);