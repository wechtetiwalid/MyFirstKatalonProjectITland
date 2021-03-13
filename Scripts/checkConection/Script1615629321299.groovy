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

WebUI.click(findTestObject('Object Repository/test1_OR/Page_The Internet/a_Form Authentication'))

WebUI.setText(findTestObject('Object Repository/test1_OR/Page_The Internet/input_Username_username'), 'tomsmith')

WebUI.setEncryptedText(findTestObject('Object Repository/test1_OR/Page_The Internet/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.doubleClick(findTestObject('Object Repository/test1_OR/Page_The Internet/em_SuperSecretPassword'))

WebUI.click(findTestObject('Object Repository/test1_OR/Page_The Internet/em_SuperSecretPassword'))

WebUI.click(findTestObject('Object Repository/test1_OR/Page_The Internet/em_SuperSecretPassword'))

WebUI.click(findTestObject('Object Repository/test1_OR/Page_The Internet/em_SuperSecretPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/test1_OR/Page_The Internet/input_Password_password'), 'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')

WebUI.click(findTestObject('Object Repository/test1_OR/Page_The Internet/i_Login'))

WebUI.closeBrowser()

