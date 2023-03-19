package tugaskalkulatorbalok;

/**
 *
 * @author HP
 */
public class PersegiPanjang implements BangunDatar{
    double panjang, lebar, luas, keliling;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double HitungLuas() {
        luas = panjang*lebar;
        return luas;
    }

    @Override
    public double HitungKeliling() {
        keliling = 2*(panjang + lebar);
        return keliling;
    }
    
}
