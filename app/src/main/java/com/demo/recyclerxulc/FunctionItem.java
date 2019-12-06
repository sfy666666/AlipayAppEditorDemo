package com.demo.recyclerxulc;

/**
 * 微应用实例
 */
public class FunctionItem {

    public String name;
    public boolean isSelect = false;
    public String imageUrl = "";      //图片地址
    public String background = "";    //背景色
    public boolean isTitle = false;   //是否是标题
    public int subItemCount = 0;
    public boolean isVisible = false;//按钮显示状态  默认不显示
    public String id = null;        //null表示微应用   非null表示微应用的标题
    public String parentId = null;  //用于判断当前微应用属于哪个标题
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
