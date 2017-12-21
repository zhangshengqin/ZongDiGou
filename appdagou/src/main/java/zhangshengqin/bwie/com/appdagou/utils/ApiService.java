package zhangshengqin.bwie.com.appdagou.utils;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import zhangshengqin.bwie.com.appdagou.bean.CartBean;
import zhangshengqin.bwie.com.appdagou.bean.GoodsShowBean;
import zhangshengqin.bwie.com.appdagou.bean.MessageBean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public interface ApiService {
    //http://120.27.23.105/product/getProductDetail?pid=75&source=android
    @GET("product/getProductDetail")
    Flowable<MessageBean<GoodsShowBean>> getNews(@QueryMap Map<String, String> map);

    //查询购物车
    //http://120.27.23.105/product/getCarts?uid=3802&source=android
    @GET("product/getCarts")
    Flowable<MessageBean<List<CartBean>>> getCart(@QueryMap Map<String, String> map);

}
