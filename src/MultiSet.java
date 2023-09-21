import jdk.jshell.spi.ExecutionControl;

import static jdk.jshell.spi.ExecutionControl.*;

public abstract class MultiSet {
    public abstract boolean add(Object item);

    public abstract void remove();

    public abstract boolean contains();

    public abstract boolean is_empty();

    public abstract int count();

    public abstract int size();
}
