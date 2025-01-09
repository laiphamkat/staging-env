package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

public class createMultiStepTaskAndNavigate {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on item PetV1 -> Navigate to page 'generic#pet-v1'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/item_PetV1'))
        
        "Step 2: Click on button CreateTaskMultiStep2 -> Navigate to page 'dynamic#pet-v1/*/step1'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_CreateTaskMultiStep2'))
        
        "Step 3: Click on button NextToStep -> Navigate to page 'form submission#pet-v1/*/step2'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/button_NextToStep'))
        
        "Step 4: Click on button NextToStep -> Navigate to page 'api endpoint#pet-v1/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_submission/button_NextToStep'))
        
        "Step 5: Click on kendo ChipOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/kendo_ChipOption'))
        
        "Step 6: Click on button DoneViewDetail"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_DoneViewDetail'))
        
        "Step 7: Adjust div sliderTrack by input value (SliderTrack)"
        
        TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(data['div_sliderTrack']))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_sliderTrack'] = testData.getValue('div_sliderTrack', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_sliderTrack'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

