class Customer {

    firstname: string;
    lastname: string;
    constructor(firstname: string, lastname: string) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

let customer = new Customer("Atul", "Raj");
console.log(customer.firstname + " " + customer.lastname);
