package week4.task1;

/**
 * TODO:
 * Gia: giá cả
 * Soluong: Số lượng quả
 * Nguongoc: Nguồn gốc của quả
 * @author NgxHien
 */
public abstract class Hoaqua {
    Integer Gia, Soluong;
    String Nguongoc;
    void setHoaQua(int gia, int soluong, String nguongoc){
        Gia = gia;
        Soluong = soluong;
        Nguongoc =nguongoc;
    }
    abstract int getGia();

    abstract int getSoluong();

    abstract String getNguongoc();
}
