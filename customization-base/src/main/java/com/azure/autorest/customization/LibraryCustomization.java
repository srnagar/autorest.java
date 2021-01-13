package com.azure.autorest.customization;

import com.azure.autorest.customization.implementation.ls.EclipseLanguageClient;
import com.azure.autorest.customization.implementation.ls.models.SymbolInformation;
import org.slf4j.Logger;

import java.util.Optional;

/**
 * The top level customization for an AutoRest generated client library.
 */
public final class LibraryCustomization {
    private final Logger logger;
    private EclipseLanguageClient languageClient;
    private Editor editor;

    LibraryCustomization(Editor editor, EclipseLanguageClient languageClient, Logger logger) {
        this.editor = editor;
        this.languageClient = languageClient;
        this.logger = logger;
    }

    /**
     * Gets the package level customization for a Java package in the client library.
     *
     * @param packageName the fully qualified name of the package
     * @return the package level customization.
     */
    public PackageCustomization getPackage(String packageName) {
        return new PackageCustomization(editor, languageClient, packageName, logger);
    }

    /**
     * Gets the class level customization for a Java class in the client library.
     *
     * @param packageName the fully qualified name of the package
     * @param className the simple name of the class
     * @return the class level customization
     */
    public ClassCustomization getClass(String packageName, String className) {
        String packagePath = packageName.replace(".", "/");
        Optional<SymbolInformation> classSymbol = languageClient.findWorkspaceSymbol(className)
                .stream().filter(si -> si.getLocation().getUri().toString().endsWith(packagePath + "/" + className + ".java"))
                .findFirst();
        if (!classSymbol.isPresent()) {
            throw new IllegalArgumentException(className + " does not exist in package " + packageName);
        }
        return new ClassCustomization(editor, languageClient, packageName, className, classSymbol.get(), logger);
    }

    /**
     * Gets the raw editor containing the current files being edited and eventually emitted to the disk.
     * @return the raw editor
     */
    public Editor getRawEditor() {
        return editor;
    }
}
