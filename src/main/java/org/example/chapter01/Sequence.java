package org.example.chapter01;

import org.example.GuardedBy;
import org.example.ThreadSafe;

@ThreadSafe
public class Sequence {
        @GuardedBy("this") private int value;

        public synchronized int getNext() {
            return value++;
        }

}
