package org.tnsindia.Dl1;

import java.math.MathContext;

//Class2
public class Students {
	
	//2.DI in the forms of objects
	MathContext math;
	
	//MathCheat m=new MathCheat();
	public void cheating() {
		math.MathCheat();
	}
	//DI using setters
	public void setMath(MathContext math) {
		this.math = math;
	}

}