package org.testng_democlass;

import org.testng.annotations.Test;

public class GroupsofGroups_Demo_Class {
	
	@Test(groups="Social Media")
	private void Twiter() {
		System.out.println("Twitter New Videos");

	}
	@Test(groups="Social Media")
	private void Instagram() {
		System.out.println("Insta Page Following");

	}
	@Test(groups="Music")
	private void WynkMusic() {
		System.out.println("Tamil Caller tune");

	}
	@Test(groups="Music")
	private void Playmusic() {
		System.out.println("Love songs");

	}

}