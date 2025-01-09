import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.multiStepTaskCreationProcess
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to planning"

TrueTestScripts.navigate("planning")

"Step 2: Create a task through multiple steps and adjust settings."

multiStepTaskCreationProcess.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button Save -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button Save - Navigate to page genericpet-v1.png')

"Step 4: Click on button CreateTaskMultiStep2 -> Navigate to page 'dynamic#pet-v1/*/step1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button CreateTaskMultiStep2 - Navigate to page dynamicpet-v1step1.png')

"Step 5: Click on item Info -> Navigate to page 'informational#info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/item_Info'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on item Info - Navigate to page informationalinfo.png')

"Step 6: Click on item Profile -> Navigate to page 'user profile#profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational/item_Profile'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on item Profile - Navigate to page user profileprofile.png')

"Step 7: Click on item Team -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_Team'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on item Team - Navigate to page .png')

"Step 8: Click on item PetV1 -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_PetV1'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on item PetV1 - Navigate to page genericpet-v1.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Create and Verify Multi Step Task with Navigation to Different Sections_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}