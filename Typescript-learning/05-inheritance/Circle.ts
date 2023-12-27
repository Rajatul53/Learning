import { Shape } from "./Shape";

export class Circle extends Shape{

    constructor( _X:number,  _Y:number, private _r: number ){
        super(_X,_Y);
    }

    public getInfo(): string {
        return super.getInfo +`r=$(this.r)`;
    }
}