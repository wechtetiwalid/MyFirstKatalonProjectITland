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

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('test2_OR/Page_The Internet/a_Form Authentication'))

WebUI.setText(findTestObject('test2_OR/Page_The Internet/input_Username_username'), 'tomsmith')

WebUI.setText(findTestObject('test2_OR/Page_The Internet/input_Password_password'), 'SuperSecretPasswor')

WebUI.click(findTestObject('test2_OR/Page_The Internet/i_Login'))

not_run: WebUI.verifyElementText(findTestObject('test2_OR/Page_The Internet/h2_Secure Area'), 'Secure Area', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('test2_OR/Page_The Internet/div_You logged into a secure area'), 'class', 
    'flash error', 5)

WebUI.closeBrowser()

