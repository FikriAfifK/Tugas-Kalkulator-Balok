package tugaskalkulatorbalok;

/**
 *
 * @author HP
 */
public class Balok extends PersegiPanjang implements BangunRuang {
   double tinggi, volume, luaspermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double HitungVolume() {
        volume = super.luas*tinggi;
        return volume;
    }

    @Override
    public double HitungLuasPermukaan() {
        luaspermukaan = 2*((super.luas)+(super.lebar*tinggi)+(super.panjang*tinggi));
        return luaspermukaan;
    }
}
