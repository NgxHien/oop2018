package week4.task1;

/**
 * TODO: Class QuaTao kế thừa (is_a) từ Class HoaQua, mang các thuộc tính của HoaQua
 * Muivi: Vị quả cam
 * Mau: Màu quả cam
 * @author NgxHien
 */
public class QuaCam extends Hoaqua{
    protected String Muivi = new String("Chua");
    protected String Mau = new String("Cam");
    public int getGia(){
        return Gia;
    }
    public int getSoluong(){
        return Soluong;
    }
    public String getNguongoc(){
        return Nguongoc;
    }
    public String getMuivi(){
        return Muivi;
    }
    public String getMau() {
        return Mau;
    }
}
