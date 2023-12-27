export class Shape{

    constructor(private _X:number,private _Y:number){
    }

    public getInfo():string{
        return `x =$(this._X) ,y=$(this._Y)`;
    }
}