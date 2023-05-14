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

response = WS.sendRequest(findTestObject('Get list users'))

'Assert hasil respon status Code expexted result dengan actual result yaitu hasilnya sama 200'
assert response.getStatusCode() == 200

'Verifikasi Data respon indeks ke-0 dengan output sama dengan email george.bluth@reqres.in'
WS.verifyElementPropertyValue(response, 'data[0].email', 'george.bluth@reqres.in')

'Verifikasi Data respon indeks ke-0 dengan output sama dengan nama Depan George'
WS.verifyElementPropertyValue(response, 'data[0].first_name', 'George')

'Verifikasi Data respon indeks ke-0 dengan output sama dengan nama Belakang Bluth'
WS.verifyElementPropertyValue(response, 'data[0].last_name', 'Bluth')

