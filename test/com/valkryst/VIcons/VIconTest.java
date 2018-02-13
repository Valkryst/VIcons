package com.valkryst.VIcons;

import org.junit.Assert;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class VIconTest {
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
