import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectTeamAndProjectOptions
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

"Step 2: Click on item PetV1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/item_PetV1'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on item PetV1.png')

"Step 3: Choose a team from dropdown and select a project"

selectTeamAndProjectOptions.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on div FilterTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/div_FilterTasks'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on div FilterTasks.png')

"Step 5: Select option with input value from select MultiSelectNative"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_generic/select_MultiSelectNative'), select_MultiSelectNative)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Select option with input value from select MultiSelectNative.png')

"Step 6: Click on input NativeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_NativeInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input NativeInput.png')

"Step 7: Enter input value in input NativeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_NativeInput'), input_NativeInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input NativeInput.png')

"Step 8: Click on input SearchTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_SearchTasks'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on input SearchTasks.png')

"Step 9: Enter input value in input SearchTasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_SearchTasks'), input_SearchTasks)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in input SearchTasks.png')

"Step 10: Click on button CreateTaskMultiStep -> Navigate to page 'dynamic#pet-v1/*/step1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button CreateTaskMultiStep - Navigate to page dynamicpet-v1step1.png')

"Step 11: Click on input TaskName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/input_TaskName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on input TaskName.png')

"Step 12: Enter input value in input TaskName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic/input_TaskName'), input_TaskName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in input TaskName.png')

"Step 13: Click on button NextToStep -> Navigate to page 'form submission#pet-v1/*/step2'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/button_NextToStep'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button NextToStep - Navigate to page form submissionpet-v1step2.png')

"Step 14: Click on textarea TaskDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_submission/textarea_TaskDescription'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on textarea TaskDescription.png')

"Step 15: Enter input value in textarea TaskDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_form_submission/textarea_TaskDescription'), textarea_TaskDescription)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in textarea TaskDescription.png')

"Step 16: Click on button NextToStep -> Navigate to page 'api endpoint#pet-v1/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/step2?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_submission/button_NextToStep'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button NextToStep - Navigate to page api endpointpet-v1.png')

"Step 17: Click on input Option2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/input_Option2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input Option2.png')

"Step 18: Click on dropdownlist kendo (Dropdownlist)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/dropdownlist_kendo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/dropdownlist_kendo', ['dropdownlist_kendo_internalHasText': dropdownlist_kendo_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on dropdownlist kendo Dropdownlist.png')

"Step 19: Click on item selectOptions (Select1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/item_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/item_selectOptions', ['item_selectOptions_d1592D32': item_selectOptions_d1592D32, 'item_selectOptions_internalRoleOptionName': item_selectOptions_internalRoleOptionName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on item selectOptions Select1.png')

"Step 20: Click on kendo ChipOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/kendo_ChipOption'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on kendo ChipOption.png')

"Step 21: Click on input Checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/input_Checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on input Checkbox.png')

"Step 22: Click on dropdownlist kendo (DropdownlistSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/dropdownlist_kendo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/dropdownlist_kendo', ['dropdownlist_kendo_internalHasText': dropdownlist_kendo_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on dropdownlist kendo DropdownlistSelect.png')

"Step 23: Click on item selectOptions (Select2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/item_selectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/item_selectOptions', ['item_selectOptions_d1592D32': item_selectOptions_d1592D32_1, 'item_selectOptions_internalRoleOptionName': item_selectOptions_internalRoleOptionName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on item selectOptions Select2.png')

"Step 24: Click on label Option2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/label_Option2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on label Option2.png')

"Step 25: Click on button DoneViewDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_DoneViewDetail'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on button DoneViewDetail.png')

"Step 26: Adjust div sliderTracks by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks"
TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks', ['div_sliderTracks_divNthChild': div_sliderTracks_divNthChild]), Double.valueOf(div_sliderTracks))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Adjust div sliderTracks by input value SliderTrack.png')

"Step 27: Adjust div sliderTracks by input value (SliderTrack2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks"
TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks', ['div_sliderTracks_divNthChild': div_sliderTracks_divNthChild_1]), Double.valueOf(div_sliderTracks_1))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Adjust div sliderTracks by input value SliderTrack2.png')

"Step 28: Adjust div sliderTracks by input value (SliderTrack3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks"
TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks', ['div_sliderTracks_divNthChild': div_sliderTracks_divNthChild_2]), Double.valueOf(div_sliderTracks_2))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Adjust div sliderTracks by input value SliderTrack3.png')

"Step 29: Click on button Save -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on button Save - Navigate to page genericpet-v1.png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Create Multi Step Task with Custom Parameters in Pet Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}