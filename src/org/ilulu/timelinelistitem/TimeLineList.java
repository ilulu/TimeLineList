package org.ilulu.timelinelistitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.ilulu.timelinelistitem.domain.TimeLineContent;

import java.util.List;

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
public class TimeLineList extends ListView {


    public TimeLineList(Context context) {
        super(context);
    }

    public TimeLineList(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimeLineList(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void prepareData(Context context, List<TimeLineContent> result){
        TimeLineAdapter timeLineAdapter=new TimeLineAdapter(context,result);
        setAdapter(timeLineAdapter);

        this.setDivider(null);
    }
}
