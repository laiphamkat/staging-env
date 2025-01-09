package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputTaskDetailsInPetV1 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input TaskName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/input_TaskName'))
        
        "Step 2: Enter input value in input TaskName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_dynamic/input_TaskName'), data['input_TaskName'])
        
        "Step 3: Click on button NextToStep -> Navigate to page 'form submission#pet-v1/*/step2'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic/button_NextToStep'))
        
        "Step 4: Click on textarea TaskDescription"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_submission/textarea_TaskDescription'))
        
        "Step 5: Enter input value in textarea TaskDescription"
        
        WebUI.setText(findTestObject('AI-Generated/Page_form_submission/textarea_TaskDescription'), data['textarea_TaskDescription'])
        
        "Step 6: Click on button NextToStep2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_submission/button_NextToStep2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_TaskName'] = testData.getValue('input_TaskName', rowIndex)
        data['textarea_TaskDescription'] = testData.getValue('textarea_TaskDescription', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_TaskName'] = 'default_data'
        data['textarea_TaskDescription'] = 'default_data'
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

