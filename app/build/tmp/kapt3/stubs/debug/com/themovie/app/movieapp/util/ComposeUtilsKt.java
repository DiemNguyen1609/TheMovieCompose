package com.themovie.app.movieapp.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0002\b\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0002\b\fH\u0007\"\u0013\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0011"}, d2 = {"primaryDarkColor", "Landroidx/compose/ui/graphics/Color;", "getPrimaryDarkColor", "()J", "J", "LoadingContent", "", "loading", "", "empty", "emptyContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onRefresh", "modifier", "Landroidx/compose/ui/Modifier;", "content", "app_debug"})
public final class ComposeUtilsKt {
    private static final long primaryDarkColor = 0L;
    
    public static final long getPrimaryDarkColor() {
        return 0L;
    }
    
    /**
     * Display an initial empty state or swipe to refresh content.
     *
     * @param loading (state) when true, display a loading spinner over [content]
     * @param empty (state) when true, display [emptyContent]
     * @param emptyContent (slot) the content to display for the empty state
     * @param onRefresh (event) event to request refresh
     * @param modifier the modifier to apply to this layout.
     * @param content (slot) the main content to show
     */
    @androidx.compose.runtime.Composable()
    public static final void LoadingContent(boolean loading, boolean empty, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> emptyContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
}