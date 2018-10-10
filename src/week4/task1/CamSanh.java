package week4.task1;
/**
 * TODO: Class QuaTao kế thừa (is_a) từ Class HoaQua, mang các thuộc tính của QuaCam
 * @author NgxHien
 */
public class CamSanh extends QuaCam{
    protected String XuatKhau;
    protected String ViCam;
    /**
     * Getter, setter
     */
    public void setXuatKhau(String xuatKhau){
        XuatKhau = xuatKhau;
    }
    public void setViCam(String viCam){
        ViCam = viCam;
    }

    /**
     * @return trả về thông tin của Cam Sành
     */
    public String getXuatKhau(){
        return XuatKhau;
    }
    public String getViCam(){
        return ViCam;
    }
}
