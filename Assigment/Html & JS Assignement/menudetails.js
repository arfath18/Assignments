// Arrow function menuDetails
const menuDetails = (username, type) => {
    const vegFood = ["Salad", "Paneer Tikka", "Vegetable Biryani", "Dal Makhani"];
    const nonVegFood = ["Chicken Curry", "Fish Fry", "Mutton Biriyani", "Butter Chicken"];

    console.log(`Welcome ${username}`);

    if (type === "veg") {
        console.log("-------------");
        console.log("Veg Food Menu:");
        vegFood.forEach(food => console.log(food));
    } else if (type === "nonveg") {
        console.log("-------------");
        console.log("Non-Veg Food Menu:");
        nonVegFood.forEach(food => console.log(food));
    } else {
        console.log("-------------");
        console.log('Enjoy Fasting');
    }
};
menuDetails('Sri', 'nonveg');
menuDetails('Nitesh', 'veg');
menuDetails('Dhanu', 'other');
