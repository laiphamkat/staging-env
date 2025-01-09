package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

public class selectPetAndConfigureOptions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on item PetV1 -> Navigate to page 'generic#pet-v1'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/item_PetV1'))
        
        "Step 2: Click on kendo DropdownList"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/kendo_DropdownList'))
        
        "Step 3: Click on item optionsList (OptionsList)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_generic/item_optionsList"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/item_optionsList', ['item_optionsList_internalRoleOptionName': data['item_optionsList_internalRoleOptionName']]))
        
        "Step 4: Select option with input value from select SelectProject"
        
        TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_generic/select_SelectProject'), data['select_SelectProject'])
        
        "Step 5: Click on input multiSelect (MultiSelect)"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/input_multiSelect'))
        
        "Step 6: Click on item optionsList (OptionsList2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_generic/item_optionsList"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/item_optionsList', ['item_optionsList_internalRoleOptionName': data['item_optionsList_internalRoleOptionName_1']]))
        
        "Step 7: Select option with input value from select MultiSelectNative"
        
        TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_generic/select_MultiSelectNative'), data['select_MultiSelectNative'])
        
        "Step 8: Click on input NativeInput"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_NativeInput'))
        
        "Step 9: Enter input value in input NativeInput2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_generic/input_NativeInput'), data['input_NativeInput2'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_NativeInput2'] = testData.getValue('input_NativeInput2', rowIndex)
        data['item_optionsList_internalRoleOptionName'] = testData.getValue('item_optionsList_internalRoleOptionName', rowIndex)
        data['item_optionsList_internalRoleOptionName_1'] = testData.getValue('item_optionsList_internalRoleOptionName_1', rowIndex)
        data['select_MultiSelectNative'] = testData.getValue('select_MultiSelectNative', rowIndex)
        data['select_SelectProject'] = testData.getValue('select_SelectProject', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_NativeInput2'] = 'default_data'
        data['item_optionsList_internalRoleOptionName'] = 'default_data'
        data['item_optionsList_internalRoleOptionName_1'] = 'default_data'
        data['select_MultiSelectNative'] = 'default_data'
        data['select_SelectProject'] = 'default_data'
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

