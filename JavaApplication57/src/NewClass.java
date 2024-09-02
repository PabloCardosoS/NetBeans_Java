import javax.swing.*;
import java.awt.*;

public class SimpleMonaLisa extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Configurações básicas
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Desenha o rosto
        g2d.setColor(new Color(255, 220, 185)); // Cor da pele
        g2d.fillOval(100, 100, 200, 250);

        // Desenha os olhos
        g2d.setColor(Color.WHITE);
        g2d.fillOval(145, 160, 40, 20);
        g2d.fillOval(215, 160, 40, 20);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(160, 165, 10, 10);
        g2d.fillOval(230, 165, 10, 10);

        // Desenha a boca
        g2d.setColor(Color.RED);
        g2d.drawArc(145, 210, 100, 50, 0, -180);

        // Desenha o cabelo
        g2d.setColor(Color.BLACK);
        g2d.fillArc(90, 50, 220, 150, 0, -180);

        // Desenha o corpo
        g2d.setColor(new Color(139, 69, 19)); // Cor do vestido
        g2d.fillRect(100, 350, 200, 300);

        // Desenha os braços
        g2d.setColor(new Color(255, 220, 185)); // Cor da pele
        g2d.fillRect(50, 350, 50, 200);
        g2d.fillRect(300, 350, 50, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Mona Lisa");
        SimpleMonaLisa panel = new SimpleMonaLisa();
        frame.add(panel);
        frame.setSize(400, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}