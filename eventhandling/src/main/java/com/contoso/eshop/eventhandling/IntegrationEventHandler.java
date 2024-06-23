package com.contoso.eshop.eventhandling;

public interface IntegrationEventHandler<T> {
  void handle(T event);
}

