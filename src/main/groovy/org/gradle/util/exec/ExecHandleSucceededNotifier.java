package org.gradle.util.exec;

/**
 * @author Tom Eyckmans
 */
public class ExecHandleSucceededNotifier extends ExecHandleNotifier {
    public ExecHandleSucceededNotifier(final ExecHandle execHandle) {
        super(execHandle);
    }

    protected boolean notifyListener(ExecHandle execHandle, ExecHandleListener listener) {
        listener.executionFinished(execHandle);
        return true;
    }
}
