import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
    //наследование класса JComponent
public class JImageDisplay extends JComponent {
    //управление изображением
    private BufferedImage image;
    //новые значения длины и ширины изображения и тип изображения
    public JImageDisplay(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Dimension imageDimension = new Dimension(width, height);
        //метод, который включает компонент в пользовательский интерфейс
        super.setPreferredSize(imageDimension);
    }
    //отрисовка
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
    //установка всех пикселей изображения в черный цвет
    public void clearImage() {
        for (int i=0;i<image.getWidth();i++)
            for (int j=0;j<image.getHeight();j++)
                image.setRGB(i,j,0);
    }
    //установка пикселя в нужный цвет
    public void drawPixel(int x, int y, int rgbColor) {
        image.setRGB(x,y,rgbColor);
    }
}
