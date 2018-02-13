package com.valkryst.VIcons;

import com.sun.istack.internal.NotNull;
import lombok.Getter;

public enum VIconType {
    BUTTON_ACCEPT("icons/button/Accept.png"),
    BUTTON_CANCEL("icons/button/Cancel.png"),

    FILE_DELETE("icons/file/Delete.png"),
    FILE_EDIT("icons/file/Edit.png"),
    FILE_NEW("icons/file/New.png"),
    FILE_PROCESS("icons/file/Process.png"),

    SETTINGS("icons/misc/Settings.png");

    /** The path to the icon. */
    @Getter private final String filePath;

    /**
     * Constructs a new VIconType.
     *
     * @param filePath
     *          The path to the icon.
     *
     * @throws NullPointerException
     *          If the filePath is null.
     */
     VIconType(final @NotNull String filePath) {
        if (filePath.isEmpty()) {
            throw new IllegalStateException("The filePath of the " + this.name() + " VIconType enum cannot be empty.");
        }

        this.filePath = filePath;
    }
}
