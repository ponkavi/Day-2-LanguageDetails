package org.english;

import org.tamil.Tamil;
import org.telgu.Telugu;

public class English implements Tamil,Telugu  {

	private void english() {
System.out.println("Englisl : 25");
	}

	@Override
	public void teluguLanguage() {
System.out.println("Telugu Lan : 10");		
	}

	@Override
	public void kanadaLanguage() {
		System.out.println("Kanada Language : 20");
	}

	@Override
	public void tamilLanguage() {
	System.out.println("Tamil Language : 50");

	
	}

	@Override
	public void hindiLanguage() {
		System.out.println("Hindi Language : 10");
		
	}
		
	public static void main(String[] args) {
		
		English a = new English();
		
		
		a.tamilLanguage();
		a.teluguLanguage();
		a.kanadaLanguage();
		a.hindiLanguage();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


