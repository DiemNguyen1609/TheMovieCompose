package com.themovie.app.movieapp.presentation.base.paging;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000 \u0013*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0013B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/themovie/app/movieapp/presentation/base/paging/BasePagingSource;", "Value", "", "Landroidx/paging/PagingSource;", "", "pageSize", "(I)V", "getFirstPage", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "", "Companion", "app_debug"})
public abstract class BasePagingSource<Value extends java.lang.Object> extends androidx.paging.PagingSource<java.lang.Integer, Value> {
    private final int pageSize = 0;
    public static final int DEFAULT_FIRST_PAGE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.themovie.app.movieapp.presentation.base.paging.BasePagingSource.Companion Companion = null;
    
    public BasePagingSource(int pageSize) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadData(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends Value>> $completion);
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, Value> state) {
        return null;
    }
    
    public int getFirstPage() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/themovie/app/movieapp/presentation/base/paging/BasePagingSource$Companion;", "", "()V", "DEFAULT_FIRST_PAGE", "", "getDefaultPageConfig", "Landroidx/paging/PagingConfig;", "pageSize", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.paging.PagingConfig getDefaultPageConfig(int pageSize) {
            return null;
        }
    }
}