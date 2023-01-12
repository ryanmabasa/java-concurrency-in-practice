package org.example.chapter02;

import org.example.NotThreadSafe;

import java.math.BigInteger;

@NotThreadSafe
public class UnsafeCountingFactorizer implements Servlet {
    /*
    * While the increment operation, ++count,
        may look like a single action because of its compact syntax, it is not atomic, which
        means that it does not execute as a single, indivisible operation. Instead, it is a
        shorthand for a sequence of three discrete operations: fetch the current value, add
        one to it, and write the new value back. This is an example of a read-modify-write
    * */
    private long count = 0;

    public long getCount() {
        return count;
    }

    public void service(ServletRequest req, ServletResponse resp) {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        ++count;
        encodeIntoResponse(resp, factors);
    }

    private BigInteger[] factor(BigInteger i) {
        BigInteger[] bigIntegers = new BigInteger[0];
        return bigIntegers;
    }

    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }

    private BigInteger extractFromRequest(ServletRequest req) {
        BigInteger o = null;
        return o;
    }
}