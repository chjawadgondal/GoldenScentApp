package app.desing.com.mytestapplication.modal;

public class ListItemModal {

    private String title;
    private String detail;
    private String time;
    private String status;
    private String imgUrl;

    public ListItemModal(String s, String s1, String s2) {
        title = s;
        detail = s1;
        imgUrl = s2;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
