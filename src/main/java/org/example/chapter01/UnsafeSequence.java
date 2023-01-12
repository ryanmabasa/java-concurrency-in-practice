package org.example.chapter01;

import org.example.NotThreadSafe;

/*
* Because threads share the same memory address space and run concurrently,
they can access or modify variables that other threads might be using. This is a
tremendous convenience, because it makes data sharing much easier than would
other inter-thread communications mechanisms. But it is also a significant risk:
threads can be confused by having data change unexpectedly.
* */
@NotThreadSafe
public class UnsafeSequence {
    private int value;
    /** Returns a unique value. */
    public int getNext() {
        return value++;
    }
}
