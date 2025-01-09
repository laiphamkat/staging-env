import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.adjustSliderAndSaveChanges
import truetest.common.createNewTaskWithDetails
import truetest.common.selectProjectAndInputDetails
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

"Step 3: Select project and input details using dropdowns and search."

selectProjectAndInputDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on input SearchTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_SearchTasks'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on input SearchTasks.png')

"Step 5: Enter input value in input SearchTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_SearchTasks'), input_SearchTasks)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Enter input value in input SearchTasks.png')

"Step 6: Click on button CreateTaskMultiStep -> Navigate to page 'dynamic#pet-v1/*/step1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button CreateTaskMultiStep - Navigate to page dynamicpet-v1step1.png')

"Step 7: Click on input TaskName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/input_TaskName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on input TaskName.png')

"Step 8: Create a new task by entering name and description."

createNewTaskWithDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 9: Click on label Option2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/label_Option2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on label Option2.png')

"Step 10: Adjust slider value and save the changes made."

adjustSliderAndSaveChanges.execute(data_path_2, Integer.valueOf(index_2))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Create Multi Step Task with Project Details and Search Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}