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

String projectDir = System.getProperty('user.dir')

String filePath = "$projectDir/Data Files/imagektp.jpeg"

String random12DigitNumber = (Math.abs(new Random().nextLong()) % ((Math.pow(10, 12)) as long)).toString().padLeft(12, '0')

String randomEmail = ('perusahaan' + (Math.abs(new Random().nextInt(100000)) + 1)) + '@xyz.com'

String randomPhoneNumber = '08' + (Math.abs(new Random().nextLong()) % ((Math.pow(10, 11)) as long)).toString().padLeft(
    11, '0')

String ktpNumber = GlobalVariable.noKtp + random12DigitNumber

WebUI.openBrowser(GlobalVariable.registerUrl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNamaDepan'), GlobalVariable.namaDepan)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNamaBelakang'), GlobalVariable.namaBelakang)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputTempatLahir'), GlobalVariable.tempatLahir)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputTanggalLahir'), GlobalVariable.tanggalLahir)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/choosePekerjaan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_pns'))

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNamaPerusahaan'), GlobalVariable.namaPerusahaan)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/txtAreaAlamatPerusahaan'), GlobalVariable.alamatPerusahaan)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNotelPerusahaan'), GlobalVariable.noTelpPerusahaan)

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Register - UC auction/inputTanggalLahir'))

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Register - UC auction/div_2007'))

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Register - UC auction/div_1994'))

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Register - UC auction/div_1'))

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Register - UC auction/span_Select'))

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNomorKTP'), ktpNumber)

WebUI.sendKeys(findTestObject('Web/Register/Page_Register - UC auction/uploadKTP'), filePath)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/checkboxKTP'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputProvinsi'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_Bali'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputKota'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_Badung'))

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/txtAreaDomisili'), GlobalVariable.alamatDomisili)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNoTelepon'), randomPhoneNumber)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputJenisKendaraan'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_mobil'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputKendaraanYangDicari'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_kendaraan_penumpang'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputTujuanPembelian'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_pribadi'))

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputEmail'), randomEmail)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputPassword'), GlobalVariable.password)

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputConfirmPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/buttonSelanjutnya'))

WebUI.verifyElementVisible(findTestObject('Web/Register/Page_Register - UC auction/infoRekening'))

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNorek'), GlobalVariable.noRek)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputPilihBank'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_BCA'))

WebUI.setText(findTestObject('Web/Register/Page_Register - UC auction/inputNamaRekening'), GlobalVariable.namaDepan)

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputSumberDana'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_Gaji'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/inputMetodePembayaran'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/li_Bank_Transfer'))

WebUI.click(findTestObject('Web/Register/Page_Register - UC auction/buttonDaftar'))

WebUI.delay(1)

loginUrl = WebUI.getUrl()

WebUI.verifyMatch(loginUrl, 'https://auction.lelangmobil.dev/login', false)

