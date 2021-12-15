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
selenium.open("https://katalon-test.s3.amazonaws.com/aut/html/form.html")
/* "This is a comment." */
selenium.click("id=first-name")
selenium.type("id=first-name", "Alex")
selenium.type("id=last-name", "Smith")
selenium.click("name=gender")
selenium.click("id=dob")
selenium.click("//tr[4]/td[3]")
selenium.click("id=address")
selenium.type("id=address", ("123456 Wakanda").toString())
selenium.click("id=email")
selenium.type("id=email", ("alex@wakanda.gov").toString())
selenium.click("id=password")
selenium.type("id=password", "secret")
selenium.click("id=company")
selenium.type("id=company", "Dora")
selenium.select("id=role", "label=Manager")
selenium.click("id=role")
selenium.addSelection("id=expectation", "label=Nice manager/leader")
selenium.click("//select[@id='expectation']/option[2]")
selenium.addSelection("id=expectation", "label=Excellent colleagues")
selenium.click("//select[@id='expectation']/option[3]")
selenium.addSelection("id=expectation", "label=Good teamwork")
selenium.click("//select[@id='expectation']/option[4]")
selenium.click("//input[@value='']")
selenium.click("xpath=(//input[@value=''])[2]")
selenium.click("id=comment")
selenium.type("id=comment", ("Added by Alex.").toString())
selenium.click("id=submit")
