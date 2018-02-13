package com.valkryst.VIcons;

import javafx.scene.image.Image;
import lombok.NonNull;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class VIcon {
    /**
     * Loads an icon into an Image object.
     *
     * @param iconType
     *          The type of the icon to load.
     *
     * @return
     *          The icon.
     *
     * @throws NullPointerException
     *          If the iconType is null.
     */
    public static Image loadAsFXImage(final @NonNull VIconType iconType) {
        return new Image(iconType.getFilePath());
    }

    /**
     * Loads an icon into a BufferedImage object.
     *
     * @param iconType
     *          The type of the icon to load.
     *
     * @return
     *          The icon.
     *
     * @throws NullPointerException
     *          If the iconType is null.
     *
     * @throws IOException
     *          If an error occurs when reading the icon file.
     */
    public static BufferedImage loadAsBufferedImage(final @NonNull VIconType iconType) throws IOException {
        final InputStream is = VIcon.class.getResourceAsStream(iconType.getFilePath());
        final BufferedImage image = ImageIO.read(is);
        is.close();
        return image;
    }
}
