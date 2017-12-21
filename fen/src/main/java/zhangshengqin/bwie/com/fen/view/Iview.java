package zhangshengqin.bwie.com.fen.view;

import java.util.List;

import zhangshengqin.bwie.com.fen.bean.Leftbean;
import zhangshengqin.bwie.com.fen.bean.Rightbean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public interface Iview {
    void showLeft(List<Leftbean.DataBean> list);
    void shouRight(List<Rightbean.DataBean> lists);
}
