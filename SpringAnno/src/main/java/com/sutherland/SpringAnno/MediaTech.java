package com.sutherland.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class MediaTech implements MobileProcessor{

	public void process() {
		System.out.println("2nd Best CPU");
		
	}

}
