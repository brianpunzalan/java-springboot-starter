package com.starter.springboot.app.builders;

public interface Builder<T, P> {
  public T build(P parameters) throws Exception;
}
