package com.ustglobal.atmmachine;

public class Machine {
	
	void slot(AtM a) {
		a.validateCard();
		a.getInfo();
	}

}
