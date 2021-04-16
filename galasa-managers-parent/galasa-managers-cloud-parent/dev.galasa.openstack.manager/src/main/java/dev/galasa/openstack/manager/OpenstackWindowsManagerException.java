package dev.galasa.openstack.manager;

import dev.galasa.windows.WindowsManagerException;

public class OpenstackWindowsManagerException extends WindowsManagerException {
    private static final long serialVersionUID = 1L;

    public OpenstackWindowsManagerException() {
    }

    public OpenstackWindowsManagerException(String message) {
        super(message);
    }

    public OpenstackWindowsManagerException(Throwable cause) {
        super(cause);
    }

    public OpenstackWindowsManagerException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenstackWindowsManagerException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
