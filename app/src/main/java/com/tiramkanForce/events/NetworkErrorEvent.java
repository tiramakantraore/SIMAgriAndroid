package com.tiramkanForce.events;

import com.tiramkanForce.core.ApiError;


/**
 * The event that is posted when a network error event occurs.
 * TODO: Consume this event in the {@link com.tiramkanForce.ui.BootstrapActivity} and
 * show a dialog that something went wrong.
 */
public class NetworkErrorEvent {
    private ApiError cause;

    public NetworkErrorEvent(ApiError cause) {
        this.cause = cause;
    }

    public ApiError getCause() {
        return cause;
    }
}
