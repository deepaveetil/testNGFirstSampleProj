package testCases;

import org.testng.annotations.Test;

import SampleJenkinsmvnGit.SampleJenkinsmvnGitIntegration.App;

public class LoginTest {

	App app = null;

	@Test
	public void Login() {

		app = new App();

		app.simpleMethod();

	}

	@Test
	public void register() {
		System.out.println("This is register case");
	}
}
