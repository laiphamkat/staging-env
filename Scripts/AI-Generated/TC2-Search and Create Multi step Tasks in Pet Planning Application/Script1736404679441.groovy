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

"Step 2: Click on html Generic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/html_Generic'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on html Generic.png')

"Step 3: Select pet options and enter details in the form."

selectPetOptionsAndInputDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on input SearchTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_SearchTasks'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on input SearchTasks.png')

"Step 5: Enter input value in input SearchTasks2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_SearchTasks'), input_SearchTasks2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Enter input value in input SearchTasks2.png')

"Step 6: Click on button CreateTaskMultiStep3 -> Navigate to page 'dynamic#pet-v1/*/step1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep3'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button CreateTaskMultiStep3 - Navigate to page dynamicpet-v1step1.png')

"Step 7: Click on input TaskName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/input_TaskName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on input TaskName.png')

"Step 8: Input task details and proceed to form submission."

inputTaskDetailsAndSubmitForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 9: Click on label Option2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/label_Option2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on label Option2.png')

"Step 10: Click on button DoneViewDetail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_DoneViewDetail2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on button DoneViewDetail2.png')

"Step 11: Adjust div sliderTracks by input value (SliderTrack2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks'), Double.valueOf(div_sliderTracks))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Adjust div sliderTracks by input value SliderTrack2.png')

"Step 12: Adjust div sliderTracks by input value (SliderTrack3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks'), Double.valueOf(div_sliderTracks_1))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Adjust div sliderTracks by input value SliderTrack3.png')

"Step 13: Adjust div sliderTracks by input value (SliderTrack4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks'), Double.valueOf(div_sliderTracks_2))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Adjust div sliderTracks by input value SliderTrack4.png')

"Step 14: Click on button Save2 -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on button Save2 - Navigate to page genericpet-v1.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Search and Create Multi step Tasks in Pet Planning Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}