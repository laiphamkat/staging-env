package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

public class saveTaskDetailsInPetV1 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button DoneViewDetail"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_DoneViewDetail'))
        
        "Step 2: Adjust div sliderTrack by input value (SliderTrack)"
        
        TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(data['div_sliderTrack']))
        
        "Step 3: Adjust div sliderTrack by input value (SliderTrack)"
        
        TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(data['div_sliderTrack_1']))
        
        "Step 4: Adjust div sliderTrack by input value (SliderTrack2)"
        
        TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_api_endpoint/div_sliderTrack'), Double.valueOf(data['div_sliderTrack_2']))
        
        "Step 5: Click on button Save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_api_endpoint/button_Save'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_sliderTrack'] = testData.getValue('div_sliderTrack', rowIndex)
        data['div_sliderTrack_1'] = testData.getValue('div_sliderTrack_1', rowIndex)
        data['div_sliderTrack_2'] = testData.getValue('div_sliderTrack_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_sliderTrack'] = 'default_data'
        data['div_sliderTrack_1'] = 'default_data'
        data['div_sliderTrack_2'] = 'default_data'
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

