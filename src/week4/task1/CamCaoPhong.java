package week4.task1;

/**
 * Class QuaTao kế thừa (is_a) từ Class QuaCam, mang các thuộc tính của QuaCam
 * Gồm 2 thuộc tính là hangLoai(loại cam) và hanSudung(hạn sử dụng)
 * @author NgxHien
 */
public class CamCaoPhong extends QuaCam{
    private String hangLoai;
    private String hanSuDung;
    /**
     * Getter, setter
     */
    public void setHangLoai(String HangLoai){
        hangLoai = HangLoai;
    }
    public void setHanSuDung(String HanSuDung){
        hanSuDung = HanSuDung;
    }

    /**
     * @return trả về thông tin của Cam Cao Phong
     */
    public String gethangLoai(){
        return hangLoai;
    }
    public String getHanSuDung(){
        return hanSuDung;
    }
}




