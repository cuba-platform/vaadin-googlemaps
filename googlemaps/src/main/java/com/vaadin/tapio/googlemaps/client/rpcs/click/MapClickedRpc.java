package com.vaadin.tapio.googlemaps.client.rpcs.click;

import com.vaadin.shared.communication.ServerRpc;
import com.vaadin.tapio.googlemaps.client.base.LatLon;

/**
 * An RPC from client to server that is called when a marker has been clicked in
 * Google Maps.
 */
public interface MapClickedRpc extends ServerRpc {
    void mapClicked(LatLon position);
}