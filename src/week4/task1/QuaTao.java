package week4.task1;

/**
 * TODO: Class QuaTao kế thừa (has_a) từ Class HoaQua, mang các thuộc tính của HoaQua
 * Hinhdang: Hình dáng quả táo
 * Mau:
 * @author NgxHien
 */
public class QuaTao extends Hoaqua{
    private String Muivi = new String("Ngọt");
    private String Mau = new String("Đỏ");
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
    public String getMau(){
        return Mau;
    }
}

