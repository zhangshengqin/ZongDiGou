package zhangshengqin.bwie.com.fen.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import zhangshengqin.bwie.com.fen.R;
import zhangshengqin.bwie.com.fen.bean.Rightbean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class Adaptergrid extends RecyclerView.Adapter{
    List<Rightbean.DataBean.ListBean> list1=new ArrayList<>();
    Context context;

    public Adaptergrid(List<Rightbean.DataBean.ListBean> list1, Context context) {
        this.list1 = list1;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid, parent, false);
        return new MyGriviewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyGriviewHolder myGriviewHolder = (MyGriviewHolder) holder;
        myGriviewHolder.textView.setText(list1.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    class MyGriviewHolder extends RecyclerView.ViewHolder {


        private final TextView textView;

        public MyGriviewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.gridtext);


        }
    }
}
