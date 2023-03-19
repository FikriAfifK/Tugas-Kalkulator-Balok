package tugaskalkulatorbalok;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author HP
 */
public class TugasKalkulatorBalok {
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}

class GUI extends JFrame implements ActionListener{
    double panjang, lebar, tinggi;
    JLabel ljudul = new JLabel("Kalkulator Balok");
    JLabel lpanjang = new JLabel("Panjang");
    JTextField tpanjang = new JTextField(5);
    JLabel llebar = new JLabel("Lebar");
    JTextField tlebar = new JTextField(5);
    JLabel ltinggi = new JLabel("Tinggi");
    JTextField ttinggi = new JTextField(5);
    JLabel lresult = new JLabel("Result: ");
    JLabel lluas = new JLabel("");
    JLabel lkeliling = new JLabel("");
    JLabel lvolume = new JLabel("");
    JLabel lluaspermukaan = new JLabel("");
    JButton btnCount = new JButton("Count");
    JButton btnReset = new JButton("Reset");
    
    public GUI(){
        super("Kalkulator Balok");
        btnCount.addActionListener(this);
        btnReset.addActionListener(this);
        
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(tpanjang);
        add(llebar);
        add(tlebar);
        add(ltinggi);
        add(ttinggi);
        add(lresult);
        add(lluas);
        add(lkeliling);
        add(lvolume);
        add(lluaspermukaan);
        add(btnCount);
        add(btnReset);
        
        ljudul.setBounds(150, 10, 150, 10);
        lpanjang.setBounds(50,40,120,20);
	tpanjang.setBounds(130,40,160,20);
        llebar.setBounds(50,80,120,20);
	tlebar.setBounds(130,80,160,20);
        ltinggi.setBounds(50,120,120,20);
	ttinggi.setBounds(130,120,160,20);
        lresult.setBounds(170,150,80,20);
        lluas.setBounds(50,180,300,20);
        lkeliling.setBounds(50,220,300,20);
        lvolume.setBounds(50,260,300,20);
        lluaspermukaan.setBounds(50,300,300,20);
        btnCount.setBounds(110,330,80,20);
	btnReset.setBounds(200,330,80,20);
        
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnCount){
            try{
                // parsing atau mengkonversi nilai bertipe data string menjadi nilai bertipe data double
                panjang = Double.parseDouble(tpanjang.getText());
                lebar = Double.parseDouble(tlebar.getText());
                tinggi = Double.parseDouble(ttinggi.getText());
                Balok balok = new Balok(panjang, lebar, tinggi);
                lluas.setText("Luas Persegi Panjang: "+ balok.HitungLuas());
                lkeliling.setText("Keliling Persegi Panjang: "+ balok.HitungKeliling());
                lvolume.setText("Volume Balok: "+ balok.HitungVolume());
                lluaspermukaan.setText("Luas Permukaan Balok: "+ balok.HitungLuasPermukaan());
            }
            catch(NumberFormatException error){
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
            catch(NullPointerException error){
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
        }
        if(e.getSource()==btnReset){
            tpanjang.setText("");
            tlebar.setText("");
            ttinggi.setText("");
            lluas.setText("");
            lkeliling.setText("");
            lvolume.setText("");
            lluaspermukaan.setText("");
        }
    }
}
