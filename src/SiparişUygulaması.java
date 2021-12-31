import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;


public class SiparişUygulaması extends JFrame {
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JCheckBox cCheckBox;
    private JButton gösterButton;
    private JLabel diller_alanı;
    private JPanel panel1;
    private JLabel Menü;
    private JCheckBox iskender50TLCheckBox;
    private JCheckBox beyti40TLCheckBox;
    private JCheckBox salata15TLCheckBox;
    private JCheckBox ayran5TLCheckBox;
    private JButton siparişleriGösterButton;


    public void siparişleriGöster(){

        String message = "";
        int tutar = 0;

        if(siparişler.isEmpty())
            message = "Siparişiniz bulunmamaktadır";
                    else{
                        message += "Siparişler\n";


                        for(Map.Entry<String,Integer> entry : siparişler.entrySet()){

                            message += entry.getKey() + "\n";
                            tutar += entry.getValue();
                        }
                        message += "Toplam Tutar : " + tutar;
        }

                    JOptionPane.showMessageDialog(this, message);

    }

    public SiparişUygulaması() {

        add(panel1);
        setSize(400, 200);
        setTitle("İlk Swing Form");



        siparişleriGösterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (iskender50TLCheckBox.isSelected()){
                    siparişler.put("İskender", 50);
                }
                else
                    siparişler.remove("İskender");

                if (beyti40TLCheckBox.isSelected()){
                    siparişler.put("Beyti", 40);
                }
                else
                    siparişler.remove("Beyti");


                if (salata15TLCheckBox.isSelected()){
                    siparişler.put("Salata", 15);
                }
                else
                    siparişler.remove("Salata");


                if (ayran5TLCheckBox.isSelected()){
                    siparişler.put("Ayran", 5);
                }
                else
                    siparişler.remove("Ayran");


                siparişleriGöster();
            }
        });
    }

    Map<String, Integer> siparişler = new LinkedHashMap<String, Integer>();

        public static void main (String[]args){

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    SiparişUygulaması SU = new SiparişUygulaması();
                    SU.setVisible(true);

                }
            });


        }

    }


