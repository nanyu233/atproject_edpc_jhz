package activetech.edpc.pojo.domain;

public class HspBase64Pic extends HspBase64PicKey {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}