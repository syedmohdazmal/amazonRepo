package com.amazon.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	private WebElement btnAccount;

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement txtMobile;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement btnContinue;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement btnSignin;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement btnCheckCart;
	
	@FindBy(xpath="//a[@id='nav-orders']")
	private WebElement btnReturnOrder;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_0']")
	private WebElement btnFresh;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_1']")
	private WebElement btnAmazonPay;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_2']\"")
	private WebElement btnGiftCard;
	
	@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_buy_again']")
	private WebElement btnBuyAgain;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_4']")
	private WebElement btnHealthHouseHold;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_5']")
	private WebElement btnGiftIdea;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_6']")
	private WebElement btnHomeImprovement;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_7']")
	private WebElement btnAmazonBasics;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	private WebElement lstAccountsSignout;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement btnSignOut;
	
	
	

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	public void clickAccountButton() {
		btnAccount.click();
	}

	public void setMobileNumber() {
		txtMobile.sendKeys("9701195395");
	}
	public void clickContinueButton() {
		btnContinue.click();
	}
	public void setPassword()
	{
		txtPassword.sendKeys("asjadhahil12");
	}
	public void clickSigninButton()
	{
		btnSignin.click();
	}
	public void clickChekCartButton()
	{
		btnCheckCart.click();
	}
	public void clickReturnOrderButton()
	{
		btnReturnOrder.click();
	}
	public void clickFreshButton()
	{
		btnFresh.click();
	}
	public void clickAmazonPayButton()
	{
		btnAmazonPay.click();
	}
	public void clickGiftCardButton()
	{
		btnGiftCard.click();
	}
	public void clickPayAgainButton()
	{
		btnBuyAgain.click();
	}
	public void clickHealthHouseHoldButton()
	{
		btnHealthHouseHold.click();
	}
	public void clickGiftIdeaButton()
	{
		btnGiftIdea.click();
	}
	public void clickHomeImprovementButton()
	{
		btnHomeImprovement.click();
	}
	public void clickAmazonBasicsButton()
	{
		btnAmazonBasics.click();
		
	}
	public void moveOverOnAccountsListOption()throws Exception
	{
		Actions act=new Actions(driver);
		act.moveToElement(lstAccountsSignout).perform();
		Thread.sleep(3000);
		
		btnSignOut.click();
		
	}


}
