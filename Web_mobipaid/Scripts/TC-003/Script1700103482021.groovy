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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/Home/login')

WebUI.delay(3)
WebUI.authenticate(null, null, null, 0)
WebUI.setText(findTestObject('Object Repository/Page_Login/input_email'), 'purba4928@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_password'), 'aCdrn5rX8dM9b9aWTmhZ7Q==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login please wait'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Sales person                Search e_941074'), 
    'social_media', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_trading_name'), '1212')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'Select', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'public', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_company_desc'), '1212')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_street_no'), 'jalan musfika ')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_city'), 'Medan')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_postal_code'), '20372')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.closeBrowser()

