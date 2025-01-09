import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createMultiStepTaskAndNavigate
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

"Step 2: Create a multi-step task and navigate through steps"

createMultiStepTaskAndNavigate.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Adjust div sliderTrack by input value SliderTrack.png')

"Step 4: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack_1))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Adjust div sliderTrack by input value SliderTrack.png')

"Step 5: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack_2))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Adjust div sliderTrack by input value SliderTrack.png')

"Step 6: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack_3))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Adjust div sliderTrack by input value SliderTrack.png')

"Step 7: Adjust div sliderTrack by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(div_sliderTrack_4))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Adjust div sliderTrack by input value SliderTrack.png')

"Step 8: Click on button Save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on button Save - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Create Multi Step Task with Multiple Slider Adjustments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}