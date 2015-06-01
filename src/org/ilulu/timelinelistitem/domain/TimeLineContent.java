package org.ilulu.timelinelistitem.domain;

/**
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * ┃　　　┃   神兽保佑
 * ┃　　　┃   代码无BUG！
 * ┃　　　┗━━━┓
 * ┃　　　　　　　┣┓
 * ┃　　　　　　　┏┛
 * ┗┓┓┏━┳┓┏┛
 * ┃┫┫　┃┫┫
 * ┗┻┛　┗┻┛
 * Created by leelucifer on 15/5/29.
 */
public class TimeLineContent {
    public String title;
    public String content;
    public String warningLevel;
    public int pointColorId;

    public TimeLineContent(){

    }

    public TimeLineContent(String title,String content,String warningLevel,int pointColorId){
        this.title=title;
        this.content=content;
        this.warningLevel=warningLevel;
        this.pointColorId=pointColorId;
    }
}
