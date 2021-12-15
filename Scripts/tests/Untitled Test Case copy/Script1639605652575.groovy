import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.expertunisie.com/")
selenium.click("xpath=//li[@id='menu-item-6024']/a/span")
selenium.click("xpath=//a[contains(text(),'Testeur logiciel et automatisation')]")
selenium.click("xpath=//div[@id='Content']/div/div/div/div/div/div[2]/div/div[5]/div/a/span")
selenium.click("name=checkbox-424")
selenium.click("name=your-tva")
selenium.click("name=your-autre")
selenium.click("name=nombre_personnes")
selenium.type("name=nombre_personnes", "10")
selenium.click("name=your-tformation")
selenium.click("name=your-date")
selenium.type("name=your-date", ("2021-12-22").toString())
selenium.click("name=your-name")
selenium.type("name=your-name", "medyas")
selenium.click("name=your-tel")
selenium.type("name=your-tel", "53208494")
selenium.click("name=your-email")
selenium.type("name=your-email", ("test@gmail.com").toString())
selenium.click("name=your-tel")
selenium.type("name=your-tel", "5320855")
selenium.click("name=your-company")
selenium.type("name=your-company", "test")
selenium.click("xpath=//div[@id='wpcf7-f260-p179-o1']/form/p[19]/span/span/span[2]/input")
selenium.click("xpath=//div[@id='wpcf7-f260-p179-o1']/form/p[20]/span/span/span[2]/input")
selenium.click("xpath=//input[@value='Envoyer']")
