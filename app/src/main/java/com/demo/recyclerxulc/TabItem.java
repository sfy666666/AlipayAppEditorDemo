package com.demo.recyclerxulc;

import java.util.ArrayList;

/**
 *
 *   微应用标题实例
 */

public class TabItem {
    private String tabName="";
    private ArrayList<FunctionItem> functionItems;

    public TabItem(String tabName, ArrayList<FunctionItem> functionItems) {
        this.tabName = tabName;
        this.functionItems = functionItems;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public ArrayList<FunctionItem> getFunctionItems() {
        return functionItems;
    }

    public void setFunctionItems(ArrayList<FunctionItem> functionItems) {
        this.functionItems = functionItems;
    }
}
