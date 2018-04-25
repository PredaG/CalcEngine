package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;


    public double getLeftVal() {return  leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() { return result;}



public MathEquation (char opCode){
        this.opCode = opCode;
}
public MathEquation (char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
}
public MathEquation(){}

    public void execute() {
        switch (opCode) {
            case 'a':
                result = getLeftVal() + getRightVal();
                break;
            case 's':
                result = getLeftVal() - getRightVal();
                break;
            case 'd':
                result = getRightVal() != 0.0d ? getLeftVal() / getRightVal() : 0.0d;
                break;
//                if(val2 != 0.0d)
//                result = val1 / val2;
//            else
//                result = 0.0d;
            case 'm':
                result = getLeftVal() * getRightVal();
                break;
            default:
                System.out.println("Error - invalid opCode");

                result = 0.0d;
                break;
        }
    }




}
