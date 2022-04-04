package org.testng_democlass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo_Class {
	
	@Test(enabled = false)
	private void Domastic() {
		System.out.println("State Player");

	}
	@Test(priority=1)
	private void internationalcricket() {
		System.out.println("indian players");

	}
	@Ignore
	@Test(priority=2)
	private void Ipl() {
		System.out.println("foreign player and indian player");

	}
	
    @Test(priority=-1)
    private void StateFootballTeam() {
		System.out.println("State Football Player");

	}
    
    @Test(priority = -2)
    private void InternationalFootBallTeam() {
		System.out.println("Indian Football Player");

	}
    
    @Test(priority = -3)
    private void FPL() {
		System.out.println("Foreign and Indian Football Player");

	}
	
    

	

}
