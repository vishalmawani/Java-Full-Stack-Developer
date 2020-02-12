package com.cpg.lab10.exercise1;
import java.lang.Math;
interface PowerOfNum {
	double calculate(double x, double y);

}
class LambdaExpression{
public static void main(String[] args) {
	
	PowerOfNum obj;
	
	obj = (x,y) -> Math.pow(x,y);
	
System.out.println(obj.calculate(2.0, 3.0));
}
}





