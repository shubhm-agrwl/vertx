package com.shubham.vertx_intro;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class EventBusSenderVerticle extends AbstractVerticle {

  public void start(Future<Void> startFuture) {

    System.out.println("Event Bus Sender for Cluster initialising");

    vertx.eventBus().publish("anAddress", "Clustered message publish");

    // Will be sent to atmost one of the handlers registered to the address.
    vertx.eventBus().send("anAddress", "message send");

  }

}
