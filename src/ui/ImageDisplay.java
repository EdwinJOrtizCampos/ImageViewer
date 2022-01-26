package ui;

import model.Image;
/**
 *
 * @author edwin
 */
public interface ImageDisplay {
    Image current();
    void show(Image image);
}
