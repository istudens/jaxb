package com.sun.xml.bind.v2.runtime;

import java.lang.reflect.Method;

import com.sun.xml.bind.v2.runtime.unmarshaller.UnmarshallingContext;
import com.sun.xml.bind.v2.runtime.unmarshaller.Loader;

/**
 * This class is a simple container for caching lifecycle methods that are
 * discovered during construction of (@link JAXBContext}.
 * 
 * @see JaxBeanInfo#lcm
 * @see Loader#fireBeforeUnmarshal(JaxBeanInfo, Object, UnmarshallingContext.State)
 * @see Loader#fireAfterUnmarshal(JaxBeanInfo, Object, UnmarshallingContext.State) 
 * @see XMLSerializer#fireMarshalEvent(Object, Method)
 */
public final class LifecycleMethods {
    private Method beforeUnmarshal;
    private Method afterUnmarshal;
    private Method beforeMarshal;
    private Method afterMarshal;

    public Method getAfterMarshal() {
        return afterMarshal;
    }

    public void setAfterMarshal(Method afterMarshal) {
        this.afterMarshal = afterMarshal;
    }

    public Method getAfterUnmarshal() {
        return afterUnmarshal;
    }

    public void setAfterUnmarshal(Method afterUnmarshal) {
        this.afterUnmarshal = afterUnmarshal;
    }

    public Method getBeforeMarshal() {
        return beforeMarshal;
    }

    public void setBeforeMarshal(Method beforeMarshal) {
        this.beforeMarshal = beforeMarshal;
    }

    public Method getBeforeUnmarshal() {
        return beforeUnmarshal;
    }

    public void setBeforeUnmarshal(Method beforeUnmarshal) {
        this.beforeUnmarshal = beforeUnmarshal;
    }
}