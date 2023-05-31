package org.example.chapter04;

import org.example.Immutable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/*In Java, immutability refers to the state of an object that cannot be
changed after it is created. In the Point class, the x and y variables are declared as final, which means their values cannot be modified once they are assigned in the constructor.

Since there are no methods in the Point class that modify its state,
once a Point object is created, its x and y values cannot be changed. This makes it safe to share Point objects across multiple threads without the risk of data corruption or inconsistent state.

In a multi-threaded environment, thread safety ensures that concurrent
access to shared resources or data structures does not lead to unexpected results or race conditions. Immutable objects, such as the Point class you provided, are inherently thread-safe because they cannot be modified once created.*/
@Immutable
public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
