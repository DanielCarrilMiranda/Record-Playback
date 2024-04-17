import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('http://demoaut.katalon.com/')

WebUI.maximizeWindow()

String titulo = WebUI.getWindowTitle()

println(titulo)

int currentTab = WebUI.getWindowIndex()

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = (JavascriptExecutor)driver

js.executeScript('window.open();')
//Switch to window index 1 and navigate to wiki
WebUI.switchToWindowIndex(currentTab + 1)
WebUI.navigateToUrl('https://www.wikipedia.org/')

WebUI.getWindowIndex()

WebUI.delay(3)

WebUI.switchToWindowTitle('CURA Healthcare Service')
WebUI.delay(3)

WebUI.switchToWindowUrl('https://www.wikipedia.org/')
WebUI.delay(3)
//Close window by title
WebUI.closeWindowTitle('CURA Healthcare Service')
WebUI.delay(3)
WebUI.closeWindowIndex(0)

WebUI.closeBrowser()

