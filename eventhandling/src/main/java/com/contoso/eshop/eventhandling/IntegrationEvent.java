package com.contoso.eshop.eventhandling;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * An Integration Event is an event that can cause side effects to other microservices, Bounded-Contexts or external systems.
 */
public class IntegrationEvent {
  private final UUID id;
  private final LocalDateTime creationDate;

  public IntegrationEvent() {
    this(UUID.randomUUID(), LocalDateTime.now());
  }

  @java.lang.SuppressWarnings("all")
  public IntegrationEvent(final UUID id, final LocalDateTime creationDate) {
    this.id = id;
    this.creationDate = creationDate;
  }

  @java.lang.SuppressWarnings("all")
  public UUID getId() {
    return this.id;
  }

  @java.lang.SuppressWarnings("all")
  public LocalDateTime getCreationDate() {
    return this.creationDate;
  }
}

