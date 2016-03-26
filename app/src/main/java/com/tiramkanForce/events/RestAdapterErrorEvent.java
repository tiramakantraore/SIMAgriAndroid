package com.tiramkanForce.events;


import com.tiramkanForce.core.ApiError;

/**
 * Error that is posted when a non-network error event occurs in the {@link retrofit.Retrofit}
 */
public class RestAdapterErrorEvent {
    private ApiError cause;

    public RestAdapterErrorEvent(ApiError cause) {
        this.cause = cause;
    }

    public ApiError getCause() {
        return cause;
    }
}
