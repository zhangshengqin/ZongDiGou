package zhangshengqin.bwie.com.appdagou.model;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import zhangshengqin.bwie.com.appdagou.bean.CartBean;
import zhangshengqin.bwie.com.appdagou.bean.GoodsShowBean;
import zhangshengqin.bwie.com.appdagou.bean.MessageBean;
import zhangshengqin.bwie.com.appdagou.presenter.NewsPresenter;
import zhangshengqin.bwie.com.appdagou.utils.RetrofitUtils;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class Model implements IModel{
    private NewsPresenter presenter;
    public Model(NewsPresenter presenter) {
        this.presenter = presenter;
    }



    @Override
    public void getData(Map<String, String> map, String tag) {
        if(tag.equals("cart")){
            Flowable<MessageBean<List<CartBean>>> flowable = RetrofitUtils.getInstance().getApiService().getCart(map);
            presenter.get2(flowable,tag);
        }else if(tag.equals("goods")){
            Flowable<MessageBean<GoodsShowBean>> flowable = RetrofitUtils.getInstance().getApiService().getNews(map);
            presenter.get(flowable,tag);
        }

    }
}
