package com.themovie.app.movieapp.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"StopTimeoutMillis", "", "WhileUiSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "getWhileUiSubscribed", "()Lkotlinx/coroutines/flow/SharingStarted;", "app_debug"})
public final class CoroutinesUtilsKt {
    private static final long StopTimeoutMillis = 5000L;
    
    /**
     * A [SharingStarted] meant to be used with a [StateFlow] to expose data to the UI.
     *
     * When the UI stops observing, upstream flows stay active for some time to allow the system to
     * come back from a short-lived configuration change (such as rotations). If the UI stops
     * observing for longer, the cache is kept but the upstream flows are stopped. When the UI comes
     * back, the latest value is replayed and the upstream flows are executed again. This is done to
     * save resources when the app is in the background but let users switch between apps quickly.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.SharingStarted WhileUiSubscribed = null;
    
    /**
     * A [SharingStarted] meant to be used with a [StateFlow] to expose data to the UI.
     *
     * When the UI stops observing, upstream flows stay active for some time to allow the system to
     * come back from a short-lived configuration change (such as rotations). If the UI stops
     * observing for longer, the cache is kept but the upstream flows are stopped. When the UI comes
     * back, the latest value is replayed and the upstream flows are executed again. This is done to
     * save resources when the app is in the background but let users switch between apps quickly.
     */
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.flow.SharingStarted getWhileUiSubscribed() {
        return null;
    }
}