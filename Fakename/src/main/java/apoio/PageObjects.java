package apoio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class PageObjects {

	private String phoneNumber;
	private String nome;
	private String firstName;
	private String lastName;

	public void fakenameSite() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.fakenamegenerator.com");
		driver.manage().window().maximize();
		
		Select select = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/div/form/ul/li[6]/select")));
		select.selectByValue("as");
		driver.findElement(By.id("genbtn")).click();
		Thread.sleep(2000);
		phoneNumber = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/dl[3]"))
				.getText();
		phoneNumber = phoneNumber.replaceAll("Phone", "");
		phoneNumber = phoneNumber.replaceAll(" ", "");
		System.out.println(phoneNumber);
		nome = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/h3"))
				.getText();
		System.out.println(nome);

		String fullName = nome;
		int idx = fullName.lastIndexOf(' ');
		if (idx == -1)
			throw new IllegalArgumentException("Only a single name: " + fullName);
		firstName = fullName.substring(0, idx);
		lastName = fullName.substring(idx + 1);

		System.out.println(firstName);
		System.out.println(lastName);

		Thread.sleep(3000);

		driver.close();

	}

	public void siteGmail() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys(firstName);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/input"))
				.sendKeys(lastName);

		driver.findElement(By.id("username")).sendKeys(lastName + "fakename");
		;

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input"))
				.sendKeys(lastName + "123@");

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[3]/div[1]/div[3]/div/div/div[1]/div/div[1]/input"))
				.sendKeys(lastName + "123@");

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/span/span"))
				.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("phoneNumberId")).sendKeys(phoneNumber);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Assert.assertEquals("Digite um número de telefone", "Digite um número de telefone");

		Thread.sleep(3000);

		driver.quit();
	}

	public void fakenameSiteWithBR() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.fakenamegenerator.com");
		driver.manage().window().maximize();
		Select select = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/div/form/ul/li[6]/select")));
		select.selectByValue("br");
		driver.findElement(By.id("genbtn")).click();
		phoneNumber = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/dl[3]"))
				.getText();
		phoneNumber = phoneNumber.replaceAll("Phone", "");
		phoneNumber = phoneNumber.replaceAll(" ", "");
		System.out.println(phoneNumber);
		nome = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/h3"))
				.getText();
		System.out.println(nome);

		String fullName = nome;
		int idx = fullName.lastIndexOf(' ');
		if (idx == -1)
			throw new IllegalArgumentException("Only a single name: " + fullName);
		firstName = fullName.substring(0, idx);
		lastName = fullName.substring(idx + 1);

		System.out.println(firstName);
		System.out.println(lastName);

		Thread.sleep(3000);

		driver.close();

	}

	public void fakenameSiteWithCanada() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.fakenamegenerator.com");
		driver.manage().window().maximize();
		Select select = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/div/form/ul/li[6]/select")));
		select.selectByValue("ca");
		driver.findElement(By.id("genbtn")).click();
		phoneNumber = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/dl[3]"))
				.getText();
		phoneNumber = phoneNumber.replaceAll("Phone", "");
		phoneNumber = phoneNumber.replaceAll(" ", "");
		System.out.println(phoneNumber);
		nome = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/h3"))
				.getText();
		System.out.println(nome);

		String fullName = nome;
		int idx = fullName.lastIndexOf(' ');
		if (idx == -1)
			throw new IllegalArgumentException("Only a single name: " + fullName);
		firstName = fullName.substring(0, idx);
		lastName = fullName.substring(idx + 1);

		System.out.println(firstName);
		System.out.println(lastName);

		Thread.sleep(3000);

		driver.close();

	}

}
