import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createMultiStepTaskInPetV1
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

"Step 2: Create a multi-step task and navigate through the steps."

createMultiStepTaskInPetV1.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Adjust div sliderTrack by input value SliderTrack.png')

"Step 4: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack_1))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Adjust div sliderTrack by input value SliderTrack.png')

"Step 5: Click on button Save -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button Save - Navigate to page genericpet-v1.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Create and Save Multi Step Task in Planning Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}