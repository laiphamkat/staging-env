package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

public class selectTeamAndProjectOptions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on kendo DropdownList"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/kendo_DropdownList'))
        
        "Step 2: Click on item teamOptions (Team22)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_generic/item_teamOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/item_teamOptions', ['item_teamOptions__0C39296123Ca': data['item_teamOptions__0C39296123Ca'], 'item_teamOptions_internalRoleOptionName': data['item_teamOptions_internalRoleOptionName']]))
        
        "Step 3: Select option with input value from select SelectProject"
        
        TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_generic/select_SelectProject'), data['select_SelectProject'])
        
        "Step 4: Click on input MultiSelect2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_MultiSelect2'))
        
        "Step 5: Click on item teamOptions (Option2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_generic/item_teamOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/item_teamOptions', ['item_teamOptions__0C39296123Ca': data['item_teamOptions__0C39296123Ca_1'], 'item_teamOptions_internalRoleOptionName': data['item_teamOptions_internalRoleOptionName_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['item_teamOptions__0C39296123Ca'] = testData.getValue('item_teamOptions__0C39296123Ca', rowIndex)
        data['item_teamOptions__0C39296123Ca_1'] = testData.getValue('item_teamOptions__0C39296123Ca_1', rowIndex)
        data['item_teamOptions_internalRoleOptionName'] = testData.getValue('item_teamOptions_internalRoleOptionName', rowIndex)
        data['item_teamOptions_internalRoleOptionName_1'] = testData.getValue('item_teamOptions_internalRoleOptionName_1', rowIndex)
        data['select_SelectProject'] = testData.getValue('select_SelectProject', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['item_teamOptions__0C39296123Ca'] = 'default_data'
        data['item_teamOptions__0C39296123Ca_1'] = 'default_data'
        data['item_teamOptions_internalRoleOptionName'] = 'default_data'
        data['item_teamOptions_internalRoleOptionName_1'] = 'default_data'
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

