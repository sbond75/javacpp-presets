// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::NumericScalar<arrow::FloatType>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseFloatScalar extends Scalar {
    static { Loader.load(); }
    /** Default native constructor. */
    public BaseFloatScalar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseFloatScalar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseFloatScalar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BaseFloatScalar position(long position) {
        return (BaseFloatScalar)super.position(position);
    }

}