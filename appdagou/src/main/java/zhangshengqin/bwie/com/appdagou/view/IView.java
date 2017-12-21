package zhangshengqin.bwie.com.appdagou.view;

/**
 * Created by 额头发 on 2017/12/21.
 */

public interface IView {
    void OnSuccess(Object o, String tag);
    void OnFailed(Exception e, String tag);
}
