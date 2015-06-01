package org.ilulu.timelinelistitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import org.ilulu.timelinelistitem.domain.TimeLineContent;
import org.ilulu.timelinelistitem.point.TimePoint;

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
public class TimeLineAdapter extends BaseAdapter {

    private Context context;
    private List<TimeLineContent> result;
    private LayoutInflater layoutInflater;

    public TimeLineAdapter(Context context,List<TimeLineContent> result){
        this.context=context;
        this.result=result;
        this.layoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return result.size();
    }

    @Override
    public Object getItem(int position) {
        return result.get(position);
    }

    @Override
    public long getItemId(int position) {
        long id=position;
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.time_line_item,null);
            viewHolder=new ViewHolder();
            convertView.setTag(viewHolder);
            viewHolder.titleView=(TextView)convertView.findViewById(R.id.title_textView);
            viewHolder.contentView=(TextView)convertView.findViewById(R.id.content_textView);
            viewHolder.point=(TimePoint)convertView.findViewById(R.id.time_line_point);
        }else {
            viewHolder=(ViewHolder)convertView.getTag();
        }
        TimeLineContent timeLine=result.get(position);

        viewHolder.titleView.setText(timeLine.title);
        viewHolder.contentView.setText(timeLine.content+timeLine.warningLevel);
        return convertView;
    }

    static class ViewHolder{
        public TimePoint point;
        public TextView titleView,contentView;
    }
}
