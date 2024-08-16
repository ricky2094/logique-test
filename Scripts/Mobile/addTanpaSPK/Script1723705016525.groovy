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

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/buttonTanpaSpk'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/txtSeller'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/android.widget.TextView - Lainnya'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/addTanpaSPK/txtNopol'), 'B 3654 EWR', 0)

Mobile.setText(findTestObject('Object Repository/Mobile/addTanpaSPK/txtNoRangka'), 'gwre658', 0)

Mobile.setText(findTestObject('Object Repository/Mobile/addTanpaSPK/txtNoMesin'), 'mjkh4344', 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/txtMerk'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/android.widget.TextView - HONDA'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/txtDocumentModel'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/android.widget.TextView - ACCORD VTi'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/txtModelFisik'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/android.widget.TextView - CIVIC GENIO'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/addTanpaSPK/txtTahun'), '2023', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Mobile/addTanpaSPK/buttonSave'), 0)

Mobile.verifyElementVisible(findTestObject('Mobile/addTanpaSPK/activeHistory'), 0)

