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

CustomKeywords.'example.MyKeyy.AppLogin'()

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/ddlHealthcare Center'), '1')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/cbReadmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cbMedicare'))
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cbMedicaid'))

        WebUI.delay(0)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cbNone'))
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtVisitDate'), '02/09/2022')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtComment'), 'Im so sick')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btnBookAppointment'))

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Appointment Confirmation'), 3)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btnGotoHomepage'))
}

CustomKeywords.'example.MyKeyy.Congrats'('youu')

WebUI.closeBrowser()
