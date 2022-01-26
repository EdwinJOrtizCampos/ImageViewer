package model;

import java.io.InputStream;
/**
 *
 * @author edwin
 */
public interface Image {
    String name();
    InputStream stream();
    Image next();
    Image prev();
}
