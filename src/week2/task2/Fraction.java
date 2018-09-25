package week2.task2;

public class Fraction {
    // TODO: khai báo các thuộc tính
    int Numerator,          // Tử số
        Denominator;        // Mẫu số


    public int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        return (b==0) ? a : gcd(b,a%b);
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.Numerator = numerator;
        this.Denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int tu, mau;
        tu = (this.Numerator*other.Denominator + this.Denominator*other.Numerator);
        mau = this.Denominator*other.Denominator;
        int x = gcd(tu, mau);
        tu = tu/x;
        mau = mau/x;
        Fraction fraction = new Fraction(tu,mau);
        return fraction;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int tu, mau;
        tu = (this.Numerator*other.Denominator - this.Denominator*other.Numerator);
        mau = this.Denominator*other.Denominator;
        int x = gcd(tu, mau);
        tu = tu/x;
        mau = mau/x;
        Fraction fraction = new Fraction(tu,mau);
        return fraction;
    }




    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int tu, mau;
        tu = this.Numerator*other.Numerator;
        mau = this.Denominator*other.Denominator;
        int x = gcd(tu, mau);
        tu = tu/x;
        mau = mau/x;
        Fraction fraction = new Fraction(tu,mau);
        return fraction;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int tu, mau;
        tu = this.Numerator*other.Denominator;
        mau = this.Denominator*other.Numerator;
        int x = gcd(tu, mau);
        tu = tu/x;
        mau = mau/x;
        Fraction fraction = new Fraction(tu,mau);
        return fraction;
    }
    public boolean equals(Object object){
        if (object instanceof Fraction){
            Fraction other = (Fraction) object;
            if (other.Denominator*this.Numerator == other.Numerator*this.Denominator)
                return true;
            else return false;
        }
        return false;
    }
}

