package zhangshengqin.bwie.com.fen.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import zhangshengqin.bwie.com.fen.R;
import zhangshengqin.bwie.com.fen.bean.Rightbean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class MyRightAdapter extends RecyclerView.Adapter{
    List<Rightbean.DataBean> lists;
    Context context;

    public MyRightAdapter(List<Rightbean.DataBean> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.right, parent, false);
        return new Myviewright(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {



        Myviewright myviewright = (Myviewright) holder;
        Rightbean.DataBean dataBean = lists.get(position);

        myviewright.textright.setText(lists.get(position).getName());
        List<Rightbean.DataBean.ListBean> list = dataBean.getList();
        myviewright.recycler_grid.setLayoutManager(new GridLayoutManager(context, 4));
        myviewright.recycler_grid.setAdapter(new Adaptergrid(list, context));

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class Myviewright extends RecyclerView.ViewHolder {


        private final TextView textright;
        private final RecyclerView recycler_grid;

        public Myviewright(View itemView) {
            super(itemView);
            textright = itemView.findViewById(R.id.textright);
            recycler_grid = itemView.findViewById(R.id.recycler_grid);


        }
    }
}
