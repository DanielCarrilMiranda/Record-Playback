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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.es/?_set_bev_on_new_domain=1713255224_ODNhNDAzNDcyOGRi')

WebUI.setText(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/input_Destino_query'), 
    city)

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/div_Madrid, Espaa'))

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/div_2'))

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/div_5'))

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/div_Aade viajeros'))

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/path'))

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/path'))

WebUI.click(findTestObject('Object Repository/AirBnb/Page_Airbnb  Alquileres vacacionales, cabaa_90b4dc/span_Viajeros_t1dqvypu atm_9s_1ulexfb atm_v_d91365'))

WebUI.verifyTextPresent(expectedResoult, false)

WebUI.closeBrowser()

