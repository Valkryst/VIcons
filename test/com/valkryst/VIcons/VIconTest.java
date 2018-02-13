package com.valkryst.VIcons;

import javafx.scene.image.Image;
import org.junit.Assert;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class VIconTest {
    @Test(expected=NullPointerException.class)
    public void testLoadAsFXImage_withNullIconType() {
        final Image image = VIcon.loadAsFXImage(null);
        Assert.assertNotNull(image);
    }

    @Test
    public void testLoadAsBufferedImage_withValidIconType() throws IOException {
        final BufferedImage image = VIcon.loadAsBufferedImage(VIconType.BUTTON_ACCEPT);
        Assert.assertNotNull(image);
    }

    @Test(expected=NullPointerException.class)
    public void testLoadAsBufferedImage_withNullIconType() throws IOException {
        VIcon.loadAsBufferedImage(null);
    }

    @Test
    public void testLoadAsBufferedImage_withAllIconTypes() throws IOException {
        for (final VIconType type : VIconType.values()) {
            final BufferedImage image = VIcon.loadAsBufferedImage(type);
            Assert.assertNotNull(image);
        }
    }
}
