
class Customer {

    private _firstname: string;
    private _lastname: string;
    constructor(_firstname: string, _lastname: string) {
        this._firstname = _firstname;
        this._lastname = _lastname;
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

