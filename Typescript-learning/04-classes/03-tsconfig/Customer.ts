class Customer {


    constructor(private _firstname: string, private _lastname: string) {
    }
    public get lastname(): string {
        return this._lastname;
    }

    public set lastname(value: string) {
        this._lastname = value;
    }

    public get firstname(): string {
        return this._firstname;
    }

    public set firstname(value: string) {
        this._lastname = value;
    }
}

let customer = new Customer("Atul", "Raj");
console.log(customer.firstname + " " + customer.lastname);

