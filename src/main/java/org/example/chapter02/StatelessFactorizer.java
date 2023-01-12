package org.example.chapter02;

import org.example.ThreadSafe;

import java.math.BigInteger;

@ThreadSafe
public class StatelessFactorizer implements Servlet {
    public void service(ServletRequest req, ServletResponse resp) {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
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