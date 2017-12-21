package zhangshengqin.bwie.com.fen.presenter;

import java.util.List;

import zhangshengqin.bwie.com.fen.bean.Leftbean;
import zhangshengqin.bwie.com.fen.model.Imodel;
import zhangshengqin.bwie.com.fen.model.Onselectleft;
import zhangshengqin.bwie.com.fen.model.model;
import zhangshengqin.bwie.com.fen.view.Iview;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class LeftPresenter {
    Imodel imodel;
    Iview iview;

    public LeftPresenter(Iview iview) {
        this.iview = iview;
        imodel = new model();

    }

    public void getLeftOk(String url) {
        imodel.RequestLeft(url, new Onselectleft() {
            @Override
            public void dataLeftSuccess(List<Leftbean.DataBean> list) {
                iview.showLeft(list);

            }
        });

    }

}
