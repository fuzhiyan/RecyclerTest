package com.baway.fuzhiyan.recyclertest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.baway.fuzhiyan.recyclertest.R;
import com.baway.fuzhiyan.recyclertest.bean.MyBean;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/10.
 * time:
 * author:付智焱
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<MyBean.美女Bean> list = new ArrayList<>();

    public MyAdapter(Context context, List<MyBean.美女Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);

        return new MyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Glide.with(context).load(list.get(position).img).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public ViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.recycler_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {

                        listener.onItemClickListener(getLayoutPosition(), itemView);
                        listener.onItemLongClickListener(getLayoutPosition(), itemView);
                    }
                }
            });


        }
    }
    //定义了一个子条目点击的接口
    public interface OnItemClickListener {


        //点击事件
        void onItemClickListener(int position, View view);

        //长按事件
        void onItemLongClickListener(int position, View view);
    }


    public OnItemClickListener listener;


    //通过构造方法。提供对外的接口
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
