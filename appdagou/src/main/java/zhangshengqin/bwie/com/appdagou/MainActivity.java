package zhangshengqin.bwie.com.appdagou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import zhangshengqin.bwie.com.appdagou.bean.GoodsShowBean;
import zhangshengqin.bwie.com.appdagou.presenter.NewsPresenter;
import zhangshengqin.bwie.com.appdagou.view.IView;

public class MainActivity extends AppCompatActivity implements IView{

    @BindView(R.id.my_image_view)
    SimpleDraweeView myImageView;
    @BindView(R.id.goods_title)
    TextView goodsTitle;
    @BindView(R.id.goods_price)
    TextView goodsPrice;
    private NewsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        presenter = new NewsPresenter();
        presenter.attachView(this);
        //http://120.27.23.105/product/getProductDetail?pid=75&source=android
        Map<String, String> map = new HashMap<>();
        map.put("pid", "75");
        presenter.getData(map, "goods");

    }

    @Override
    public void OnSuccess(Object o, String tag) {
        if (tag.equals("goods")) {
            if (o != null) {
                GoodsShowBean data = (GoodsShowBean) o;
                //Log.e("Gp", "OnSuccess: " + data.toString());

                myImageView.setImageURI(data.getImages().split("\\|")[0]);
                goodsTitle.setText(data.getTitle());
                goodsPrice.setText("￥ "+data.getPrice());
            }
        }
    }

    @Override
    public void OnFailed(Exception e, String tag) {

    }

    @OnClick({R.id.btn_addcart, R.id.btn_shopping})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_addcart:
                Toast.makeText(MainActivity.this,"添加成功",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_shopping:
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}
