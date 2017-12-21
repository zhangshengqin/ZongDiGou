package zhangshengqin.bwie.com.fen.app;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;
import zhangshengqin.bwie.com.fen.bean.Leftbean;
import zhangshengqin.bwie.com.fen.bean.Rightbean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public interface ApiServer {
    @GET("product/getCatagory")
    Observable<Leftbean> getDaes();


    @POST
    Observable<Rightbean> getDass(@Url String url, @QueryMap Map<String, Integer> map);
}
