package teste;

import org.junit.Test;

import apoio.PageObjects;

public class CasoTeste extends PageObjects {
	
	
		@Test	
		public void fakeName() throws InterruptedException {
			
			fakenameSite();
			siteGmail();
			
			fakenameSiteWithBR();
			siteGmail();
			
			fakenameSiteWithCanada();
			siteGmail();
		
		}
	
	}


