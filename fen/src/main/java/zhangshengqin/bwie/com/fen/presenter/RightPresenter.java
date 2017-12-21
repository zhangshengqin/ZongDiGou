package zhangshengqin.bwie.com.fen.presenter;

import java.util.List;

import zhangshengqin.bwie.com.fen.bean.Rightbean;
import zhangshengqin.bwie.com.fen.model.Imodel;
import zhangshengqin.bwie.com.fen.model.Onsekectright;
import zhangshengqin.bwie.com.fen.model.model;
import zhangshengqin.bwie.com.fen.view.Iview;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class RightPresenter {
    Iview iview;
    Imodel imodel;

    public RightPresenter(Iview iview) {
        this.iview = iview;
        imodel = new model();
    }

    public void getRightOk(String url, int cid) {
        imodel.RequestRight(url, cid, new Onsekectright() {
            @Override
            public void dataRightSuccessd(List<Rightbean.DataBean> lists) {
                iview.shouRight(lists);
            }
        });


    }

}
