package control;

import java.io.File;
import model.Image;
import persistence.FileImageLoader;
/**
 *
 * @author edwin
 */
public class Main {
    public static void main(String[] args) {
        File prueba = new File("D:\\ULPGC\\IS2\\recursos\\prueba.jpg");
        FileImageLoader imageLoader = new FileImageLoader(prueba);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
