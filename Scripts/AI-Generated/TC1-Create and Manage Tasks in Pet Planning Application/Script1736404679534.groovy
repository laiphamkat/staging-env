import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.inputTaskDetailsAndSubmitForm
import truetest.common.selectPetOptionsAndInputDetails
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

"Step 2: Select pet options and enter details in the form."

selectPetOptionsAndInputDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button CreateTask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTask'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button CreateTask.png')

"Step 4: Click on input TaskName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_TaskName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input TaskName.png')

"Step 5: Enter input value in input TaskName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_TaskName'), input_TaskName2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input TaskName2.png')

"Step 6: Click on textarea Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/textarea_Description'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on textarea Description.png')

"Step 7: Enter input value in textarea Description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/textarea_Description2'), textarea_Description2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in textarea Description2.png')

"Step 8: Click on button Create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_Create'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button Create.png')

"Step 9: Click on button CreateTaskMultiStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button CreateTaskMultiStep.png')

"Step 10: Input task details and proceed to form submission."

inputTaskDetailsAndSubmitForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on kendo DropdownList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/kendo_DropdownList'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on kendo DropdownList.png')

"Step 12: Click on item Select1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/item_Select1'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on item Select1.png')

"Step 13: Click on input SearchTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/input_SearchTasks'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on input SearchTasks.png')

"Step 14: Click on button DoneViewDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_DoneViewDetail2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button DoneViewDetail.png')

"Step 15: Adjust div sliderTracks by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks'), Double.valueOf(div_sliderTracks))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Adjust div sliderTracks by input value SliderTrack.png')

"Step 16: Click on button Save -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button Save - Navigate to page genericpet-v1.png')

"Step 17: Click on button CreateTaskMultiStep2 -> Navigate to page 'dynamic#pet-v1/*/step1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button CreateTaskMultiStep2 - Navigate to page dynamicpet-v1step1.png')

"Step 18: Click on item Info -> Navigate to page 'informational#info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/item_Info'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on item Info - Navigate to page informationalinfo.png')

"Step 19: Click on item Profile -> Navigate to page 'user profile#profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational/item_Profile'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on item Profile - Navigate to page user profileprofile.png')

"Step 20: Click on item Team -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_Team'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on item Team - Navigate to page .png')

"Step 21: Click on item PetV1 -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_PetV1'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on item PetV1 - Navigate to page genericpet-v1.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Create and Manage Tasks in Pet Planning Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}