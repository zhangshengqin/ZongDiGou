package zhangshengqin.bwie.com.fen.model;

/**
 * Created by 额头发 on 2017/12/21.
 */

public interface Imodel {
    void RequestLeft(String url,Onselectleft onselect);
    void RequestRight(String url,int cid,Onsekectright onsekectright);
}
