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

"Step 2: Click on item Profile -> Navigate to page 'user profile#profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/item_Profile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on item Profile - Navigate to page user profileprofile.png')

"Step 3: Click on span ClearButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_ClearButton'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on span ClearButton.png')

"Step 4: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_profile/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Enter input value in input FirstName.png')

"Step 5: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on input LastName.png')

"Step 6: Click on fieldset AvatarPhoto"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/fieldset_AvatarPhoto'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on fieldset AvatarPhoto.png')

"Step 7: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_profile/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Enter input value in input LastName.png')

"Step 8: Click on kendo Component"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/kendo_Component'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on kendo Component.png')

"Step 9: Click on span ClearEmailButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_ClearEmailButton'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on span ClearEmailButton.png')

"Step 10: Enter input value in input EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_profile/input_EmailAddress'), input_EmailAddress)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Enter input value in input EmailAddress.png')

"Step 11: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on input Phone.png')

"Step 12: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_profile/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Enter input value in input Phone.png')

"Step 13: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on input Country.png')

"Step 14: Click on span ClearButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_ClearButton2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on span ClearButton2.png')

"Step 15: Click on kendo Switch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/kendo_Switch'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on kendo Switch.png')

"Step 16: Click on label OrganicTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/label_OrganicTeam'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on label OrganicTeam.png')

"Step 17: Click on button SaveChanges"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/button_SaveChanges'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on button SaveChanges.png')

"Step 18: Click on item PetV1 -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_PetV1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on item PetV1 - Navigate to page genericpet-v1.png')

"Step 19: Click on kendo DropdownList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/kendo_DropdownList'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on kendo DropdownList.png')

"Step 20: Click on item teamOptions (Team2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_generic/item_teamOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/item_teamOptions', ['item_teamOptions__0C39296123Ca': item_teamOptions__0C39296123Ca, 'item_teamOptions_internalRoleOptionName': item_teamOptions_internalRoleOptionName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on item teamOptions Team2.png')

"Step 21: Choose a team from dropdown and select a project"

selectTeamAndProjectOptions.execute(data_path_0, Integer.valueOf(index_0))

"Step 22: Click on input MultiSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_MultiSelect'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on input MultiSelect.png')

"Step 23: Click on item teamOptions (Option1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_generic/item_teamOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/item_teamOptions', ['item_teamOptions__0C39296123Ca': item_teamOptions__0C39296123Ca_1, 'item_teamOptions_internalRoleOptionName': item_teamOptions_internalRoleOptionName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on item teamOptions Option1.png')

"Step 24: Select option with input value from select MultiSelectNative"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_generic/select_MultiSelectNative'), select_MultiSelectNative)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Select option with input value from select MultiSelectNative.png')

"Step 25: Select option with input value from select MultiSelectNative"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_generic/select_MultiSelectNative'), select_MultiSelectNative_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Select option with input value from select MultiSelectNative.png')

"Step 26: Click on input NativeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_NativeInput'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on input NativeInput.png')

"Step 27: Enter input value in input NativeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_NativeInput'), input_NativeInput)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Enter input value in input NativeInput.png')

"Step 28: Click on button CreateTask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTask'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on button CreateTask.png')

"Step 29: Click on input CreateTask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_CreateTask'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on input CreateTask.png')

"Step 30: Enter input value in input CreateTask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_CreateTask'), input_CreateTask)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Enter input value in input CreateTask.png')

"Step 31: Click on textarea Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/textarea_Description'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on textarea Description.png')

"Step 32: Enter input value in textarea Description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/textarea_Description2'), textarea_Description2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Enter input value in textarea Description2.png')

"Step 33: Click on button Create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_Create'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on button Create.png')

"Step 34: Click on button ViewDetail -> Navigate to page 'api endpoint#pet-v1/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_ViewDetail'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on button ViewDetail - Navigate to page api endpointpet-v1.png')

"Step 35: Adjust div sliderTracks by input value (SliderTrack)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks"
TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks', ['div_sliderTracks_divNthChild': div_sliderTracks_divNthChild]), Double.valueOf(div_sliderTracks))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Adjust div sliderTracks by input value SliderTrack.png')

"Step 36: Click on kendo DrawerContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/kendo_DrawerContainer'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Click on kendo DrawerContainer.png')

"Step 37: Click on div TaskDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/div_TaskDetails'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 37-Click on div TaskDetails.png')

"Step 38: Adjust div sliderTracks by input value (SliderTrack2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks"
TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTracks', ['div_sliderTracks_divNthChild': div_sliderTracks_divNthChild_1]), Double.valueOf(div_sliderTracks_1))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 38-Adjust div sliderTracks by input value SliderTrack2.png')

"Step 39: Click on kendo DrawerContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/kendo_DrawerContainer'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 39-Click on kendo DrawerContainer.png')

"Step 40: Click on button Save -> Navigate to page 'generic#pet-v1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pet-v1/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 40-Click on button Save - Navigate to page genericpet-v1.png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Update User Profile and Create New Task in Pet Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}