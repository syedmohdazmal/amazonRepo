package com.amazon.login;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.loginPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest{
	WebDriver driver=null;
	LoginPage loginPage=null;
	@BeforeClass
	public void init()throws Exception {
	this.driver=getWebDriver();	
	loginPage=new LoginPage(driver);
	}
	
	@Test(priority=1)
		public void LoginUserPassword()throws Exception{
		//driver.quit();
		loginPage.clickAccountButton();
		Thread.sleep(2000);
		loginPage.setMobileNumber();
		Thread.sleep(2000);
		loginPage.clickContinueButton();
		Thread.sleep(2000);
		loginPage.setPassword();
		Thread.sleep(2000);
		loginPage.clickSigninButton();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void CheckCart()throws Exception
	{
		loginPage.clickChekCartButton();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void ReturnOrderMethod()throws Exception
	{
		loginPage.clickReturnOrderButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void FreshTabTest()throws Exception
	{
		loginPage.clickFreshButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void AmazonPayTest()throws Exception
	{
		loginPage.clickAmazonPayButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void GiftCardsTest()throws Exception
	{
		loginPage.clickGiftCardButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void BuyAgainTest()throws Exception
	{
		loginPage.clickPayAgainButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void HealthHouseHoldsTest()throws Exception
	{
		loginPage.clickHealthHouseHoldButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=9)
	public void GiftIdeaTest()throws Exception
	{
		loginPage.clickGiftIdeaButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=10)
	public void HomeImprovementTest()throws Exception
	{
		loginPage.clickHomeImprovementButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=11)
	public void AmazonBasicsTest()throws Exception
	{
		loginPage.clickAmazonBasicsButton();
		Thread.sleep(2000);
	}
	
	@Test(priority=12)
	public void SignOutTest()throws Exception
	{
		loginPage.moveOverOnAccountsListOption();
		Thread.sleep(2000);
		
	}

}
