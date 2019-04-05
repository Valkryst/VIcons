package com.valkryst.VIcons;

import lombok.Getter;
import lombok.NonNull;

public enum VIconType {
    BUTTON_ACCEPT("icons/button/Accept.png"),
    BUTTON_CANCEL("icons/button/Cancel.png"),

    FILE_DELETE("icons/file/Delete.png"),
    FILE_EDIT("icons/file/Edit.png"),
    FILE_NEW("icons/file/New.png"),
    FILE_PROCESS("icons/file/Process.png"),

    SETTINGS("icons/misc/Settings.png"),
    UNDO("icons/misc/Undo.png"),
    REDO("icons/misc/Redo.png");

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
     VIconType(final @NonNull String filePath) {
        if (filePath.isEmpty()) {
            throw new IllegalStateException("The filePath of the " + this.name() + " VIconType enum cannot be empty.");
        }

        this.filePath = filePath;
    }
}
