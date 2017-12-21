package zhangshengqin.bwie.com.fen.model;

import java.util.HashMap;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhangshengqin.bwie.com.fen.app.ApiServer;
import zhangshengqin.bwie.com.fen.bean.Leftbean;
import zhangshengqin.bwie.com.fen.bean.Rightbean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class model implements Imodel{
    @Override
    public void RequestLeft(String url, final Onselectleft onselect) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiServer apiServer = retrofit.create(ApiServer.class);
        Observable<Leftbean> daes = apiServer.getDaes();
        daes.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Leftbean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Leftbean leftbean) {
                        List<Leftbean.DataBean> data = leftbean.getData();
                        onselect.dataLeftSuccess(data);

                    }
                });

    }

    @Override
    public void RequestRight(String url, int cid, final Onsekectright onsekectright) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cid", cid);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiServer apiServer = retrofit.create(ApiServer.class);
        Observable<Rightbean> dass = apiServer.getDass("product/getProductCatagory", map);
        dass.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Rightbean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Rightbean rightbean) {
                        List<Rightbean.DataBean> datas = rightbean.getData();
                        onsekectright.dataRightSuccessd(datas);
                    }
                });


    }
}
