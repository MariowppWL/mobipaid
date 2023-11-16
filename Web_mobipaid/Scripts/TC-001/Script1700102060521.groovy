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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')


WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/registerku/Page_Register/input_signatory_first_name'), 'Mario') 
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/registerku/Page_Register/input_signatory_last_name'), 'Purba')

WebUI.setText(findTestObject('Object Repository/registerku/Page_Register/input_email'), 'Purba4928@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/registerku/Page_Register/input_password'), 'KsxSIifmzBOBQ5XZKb4i4A==')

WebUI.setText(findTestObject('Object Repository/registerku/Page_Register/input_name'), 'PT Digital Tenun Nusantara')

WebUI.setText(findTestObject('Object Repository/registerku/Page_Register/input_form-control btn-log border-grey int__5c974a'), 
    '81273459046')

WebUI.selectOptionByValue(findTestObject('Object Repository/registerku/Page_Register/select_Your country                        _da403c'), 
    'Your country', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/registerku/Page_Register/select_Your country                        _da403c'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/registerku/Page_Register/input_state'), 'Medan')

WebUI.click(findTestObject('Object Repository/registerku/Page_Register/input_psa-checkbox'))

WebUI.click(findTestObject('Object Repository/registerku/Page_Register/button_Next Step   please wait'))

WebUI.openBrowser('')

WebUI.closeBrowser()

