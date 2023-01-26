package org.example.chapter02;

import org.example.ThreadSafe;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

@ThreadSafe
public class CountingFactorizer implements Servlet {
    //Where practical, use existing thread-safe objects, like AtomicLong, to
    //manage your class’s state. It is simpler to reason about the possible
    //states and state transitions for existing thread-safe objects than it is for
    //arbitrary state variables, and this makes it easier to maintain and verify
    //thread safety.
    private final AtomicLong count = new AtomicLong(0);
    public long getCount() { return count.get(); }
    public void service(ServletRequest req, ServletResponse resp) {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        count.incrementAndGet();
        encodeIntoResponse(resp, factors);
    }

    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }

    private BigInteger[] factor(BigInteger i) {
        BigInteger[] bigIntegers = new BigInteger[0];
        return bigIntegers;
    }

    private BigInteger extractFromRequest(ServletRequest req) {
        return null;
    }
}