package com.vectorcast.plugins.vectorcastcoverage;

import java.io.Serializable;

/**
 * Holds the configuration details for {@link hudson.model.HealthReport} generation
 *
 * @author Stephen Connolly
 * @since 1.7
 */
public class VectorCASTHealthReportThresholds implements Serializable {
    private float minStatement;
    private float maxStatement;
    private float minBranch;
    private float maxBranch;
    private float minBasisPath;
    private float maxBasisPath;
    private float minMCDC;
    private float maxMCDC;
    private float minFunction;
    private float maxFunction;

    private float minFunctionCall;
    private float maxFunctionCall;

    public VectorCASTHealthReportThresholds() {
    }

    public VectorCASTHealthReportThresholds(float minStatement, float maxStatement, float minBranch, float maxBranch, float minBasisPath, float maxBasisPath, float minMCDC, float maxMCDC, float minFunction, float maxFunction, float minFunctionCall, float maxFunctionCall) {
        this.minStatement = minStatement;
        this.maxStatement = maxStatement;
        this.minBranch = minBranch;
        this.maxBranch = maxBranch;
        this.minBasisPath = minBasisPath;
        this.maxBasisPath = maxBasisPath;
        this.minMCDC = minMCDC;
        this.maxMCDC = maxMCDC;
        this.minFunction = minFunction;
        this.maxFunction = maxFunction;
        this.minFunctionCall = minFunctionCall;
        this.maxFunctionCall = maxFunctionCall;
        ensureValid();
    }

    private float applyRange(float min , float value, float max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public void ensureValid() {
        maxStatement = applyRange(0, maxStatement, 100);
        minStatement = applyRange(0, minStatement, maxStatement);
        maxBranch = applyRange(0, maxBranch, 100);
        minBranch = applyRange(0, minBranch, maxBranch);
        maxBasisPath = applyRange(0, maxBasisPath, 100);
        minBasisPath = applyRange(0, minBasisPath, maxBasisPath);
        maxMCDC = applyRange(0, maxMCDC, 100);
        minMCDC = applyRange(0, minMCDC, maxMCDC);
        maxFunction = applyRange(0, maxFunction, 100);
        minFunction = applyRange(0, minFunction, maxFunction);
        maxFunctionCall = applyRange(0, maxFunctionCall, 100);
        minFunctionCall = applyRange(0, minFunctionCall, maxFunctionCall);
    }

    public float getMinStatement() {
        return minStatement;
    }

    public void setMinStatement(float minStatement) {
        this.minStatement = minStatement;
    }

    public float getMaxStatement() {
        return maxStatement;
    }

    public void setMaxStatement(float maxStatement) {
        this.maxStatement = maxStatement;
    }

    public float getMinBranch() {
        return minBranch;
    }

    public void setMinBranch(float minBranch) {
        this.minBranch = minBranch;
    }

    public float getMaxBranch() {
        return maxBranch;
    }

    public void setMaxBranch(float maxBranch) {
        this.maxBranch = maxBranch;
    }

    public float getMinBasisPath() {
        return minBasisPath;
    }

    public void setMinBasisPath(float minBasisPath) {
        this.minBasisPath = minBasisPath;
    }

    public float getMaxBasisPath() {
        return maxBasisPath;
    }

    public void setMaxBasisPath(float maxBasisPath) {
        this.maxBasisPath = maxBasisPath;
    }

    public float getMinMCDC() {
        return minMCDC;
    }

    public void setMinMCDC(float minMCDC) {
        this.minMCDC = minMCDC;
    }

    public float getMaxMCDC() {
        return maxMCDC;
    }

    public void setMaxMCDC(float maxMCDC) {
        this.maxMCDC = maxMCDC;
    }
    
    public void setMinFunction(float minFunction) {
        this.minFunction = minFunction;
    }

    public float getMinFunction() {
        return minFunction;
    }

    public void setMaxFunction(float maxFunction) {
        this.maxFunction = maxFunction;
    }

    public float getMaxFunction() {
        return maxFunction;
    }
    
    public void setMinFunctionCall(float minFunctionCall) {
        this.minFunctionCall = minFunctionCall;
    }

    public float getMinFunctionCall() {
        return minFunctionCall;
    }

    public void setMaxFunctionCall(float maxFunctionCall) {
        this.maxFunctionCall = maxFunctionCall;
    }

    public float getMaxFunctionCall() {
        return maxFunctionCall;
    }

}
