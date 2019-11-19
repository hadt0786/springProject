package com.sutherland.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	
	MobileProcessor cpu;
	
	public void Config()
	{
		System.out.println("Octa core,4 gb Ram,12MP camera");
		cpu.process();
	}

}
