package com.demo.recyclerxulc;

public class FunctionItem {

    public String name;
    public boolean isSelect = false;
    public String imageUrl = "";
    public String background = "";
    public boolean isTitle = false;
    public int subItemCount = 0;
    public boolean isVisible = false;//按钮显示状态  默认不显示
    public String id = "";
    public String parentId = "";
    public boolean isShow = false;//条目显示状态 默认不显示

    public FunctionItem(String name, boolean isTitle, String id, boolean isShow) {
        this.name = name;
        this.isTitle = isTitle;
        this.id = id;
        this.isShow = isShow;
    }

    public FunctionItem(boolean isShow, boolean isTitle, String name, String parentId) {
        this.isShow = isShow;
        this.isTitle = isTitle;
        this.name = name;
        this.parentId = parentId;
    }

    public FunctionItem(String name, boolean isTitle, String id) {
        this.name = name;
        this.isTitle = isTitle;
        this.id = id;
    }

    public FunctionItem(String name, boolean isSelect, String imageUrl, String background) {
        this.name = name;
        this.isSelect = isSelect;
        this.imageUrl = imageUrl;
        this.background = background;
    }

    public FunctionItem(String name, boolean isTitle, int subItemCount) {
        this.name = name;
        this.isTitle = isTitle;
        this.subItemCount = subItemCount;
    }

    public FunctionItem(String name, boolean isTitle) {
        this.name = name;
        this.isTitle = isTitle;
    }

}
