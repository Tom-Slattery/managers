/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.zosunix;

import dev.galasa.zos.ZosManagerException;

public class ZosUNIXCommandManagerException extends ZosManagerException {
    private static final long serialVersionUID = 1L;

    public ZosUNIXCommandManagerException() {
    }

    public ZosUNIXCommandManagerException(String message) {
        super(message);
    }

    public ZosUNIXCommandManagerException(Throwable cause) {
        super(cause);
    }

    public ZosUNIXCommandManagerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZosUNIXCommandManagerException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
