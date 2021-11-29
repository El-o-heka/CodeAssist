package com.tyron.builder.project.api;

import com.tyron.builder.model.ProjectSettings;
import com.tyron.builder.project.api.FileManager;

import org.jetbrains.kotlin.com.intellij.openapi.util.UserDataHolderEx;

import java.io.IOException;
import java.util.List;

public interface Project extends UserDataHolderEx {

    ProjectSettings getSettings();

    FileManager getFileManager();

    List<Module> getModules();

    /**
     * Start parsing the project contents such as manifest data, project settings, etc.
     *
     * Implementations may throw an IOException if something went wrong during parsing
     */
    void open() throws IOException;
}