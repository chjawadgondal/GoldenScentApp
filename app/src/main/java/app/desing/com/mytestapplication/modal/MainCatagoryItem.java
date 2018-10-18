package app.desing.com.mytestapplication.modal;

public class MainCatagoryItem {

    private String title;
    private String imgUrl;

    public MainCatagoryItem(String title, String img) {
        this.title = title;
        imgUrl = img;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
