package zhangshengqin.bwie.com.appdagou.bean;

/**
 * Created by 额头发 on 2017/12/21.
 */

public class ChildBean {
    private String title;
    private String images;
    private double price;
    private int num;
    private boolean childCb;
    private boolean btn;


    public ChildBean(String title, String images, double price, int num, boolean childCb, boolean btn) {
        this.title = title;
        this.images = images;
        this.price = price;
        this.num = num;
        this.childCb = childCb;
        this.btn = btn;
    }

    public boolean isBtn() {
        return btn;
    }

    public void setBtn(boolean btn) {
        this.btn = btn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isChildCb() {
        return childCb;
    }

    public void setChildCb(boolean childCb) {
        this.childCb = childCb;
    }

    @Override
    public String toString() {
        return "ChildBean{" +
                "title='" + title + '\'' +
                ", images='" + images + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", childCb=" + childCb +
                '}';
    }
}
