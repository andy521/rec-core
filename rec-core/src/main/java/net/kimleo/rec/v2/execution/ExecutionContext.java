package net.kimleo.rec.v2.execution;

public interface ExecutionContext {
    boolean ready();
    void commit();
}
