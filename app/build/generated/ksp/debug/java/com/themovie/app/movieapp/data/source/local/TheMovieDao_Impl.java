package com.themovie.app.movieapp.data.source.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TheMovieDao_Impl implements TheMovieDao {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final EntityUpsertionAdapter<LocalMovie> __upsertionAdapterOfLocalMovie;

  public TheMovieDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM theMovie WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM theMovie";
        return _query;
      }
    };
    this.__upsertionAdapterOfLocalMovie = new EntityUpsertionAdapter<LocalMovie>(new EntityInsertionAdapter<LocalMovie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT INTO `theMovie` (`id`,`title`,`poster`,`year`,`country`,`imdbRating`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LocalMovie entity) {
        statement.bindString(1, entity.getId());
        statement.bindString(2, entity.getTitle());
        if (entity.getPoster() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPoster());
        }
        if (entity.getYear() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getYear());
        }
        if (entity.getCountry() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCountry());
        }
        if (entity.getImdbRating() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImdbRating());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<LocalMovie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE `theMovie` SET `id` = ?,`title` = ?,`poster` = ?,`year` = ?,`country` = ?,`imdbRating` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LocalMovie entity) {
        statement.bindString(1, entity.getId());
        statement.bindString(2, entity.getTitle());
        if (entity.getPoster() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPoster());
        }
        if (entity.getYear() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getYear());
        }
        if (entity.getCountry() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCountry());
        }
        if (entity.getImdbRating() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImdbRating());
        }
        statement.bindString(7, entity.getId());
      }
    });
  }

  @Override
  public Object deleteById(final String taskId, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
        int _argIndex = 1;
        _stmt.bindString(_argIndex, taskId);
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object upsert(final LocalMovie task, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfLocalMovie.upsert(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object upsertAll(final List<LocalMovie> tasks,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfLocalMovie.upsert(tasks);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public PagingSource<Integer, LocalMovie> observeAllPaging() {
    final String _sql = "SELECT * FROM theMovie";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<LocalMovie>(_statement, __db, "theMovie") {
      @Override
      @NonNull
      protected List<LocalMovie> convertRows(@NonNull final Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
        final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(cursor, "poster");
        final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(cursor, "year");
        final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(cursor, "country");
        final int _cursorIndexOfImdbRating = CursorUtil.getColumnIndexOrThrow(cursor, "imdbRating");
        final List<LocalMovie> _result = new ArrayList<LocalMovie>(cursor.getCount());
        while (cursor.moveToNext()) {
          final LocalMovie _item;
          final String _tmpId;
          _tmpId = cursor.getString(_cursorIndexOfId);
          final String _tmpTitle;
          _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          final String _tmpPoster;
          if (cursor.isNull(_cursorIndexOfPoster)) {
            _tmpPoster = null;
          } else {
            _tmpPoster = cursor.getString(_cursorIndexOfPoster);
          }
          final String _tmpYear;
          if (cursor.isNull(_cursorIndexOfYear)) {
            _tmpYear = null;
          } else {
            _tmpYear = cursor.getString(_cursorIndexOfYear);
          }
          final String _tmpCountry;
          if (cursor.isNull(_cursorIndexOfCountry)) {
            _tmpCountry = null;
          } else {
            _tmpCountry = cursor.getString(_cursorIndexOfCountry);
          }
          final String _tmpImdbRating;
          if (cursor.isNull(_cursorIndexOfImdbRating)) {
            _tmpImdbRating = null;
          } else {
            _tmpImdbRating = cursor.getString(_cursorIndexOfImdbRating);
          }
          _item = new LocalMovie(_tmpId,_tmpTitle,_tmpPoster,_tmpYear,_tmpCountry,_tmpImdbRating);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Flow<LocalMovie> observeById(final String taskId) {
    final String _sql = "SELECT * FROM theMovie WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, taskId);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"theMovie"}, new Callable<LocalMovie>() {
      @Override
      @NonNull
      public LocalMovie call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfImdbRating = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbRating");
          final LocalMovie _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpImdbRating;
            if (_cursor.isNull(_cursorIndexOfImdbRating)) {
              _tmpImdbRating = null;
            } else {
              _tmpImdbRating = _cursor.getString(_cursorIndexOfImdbRating);
            }
            _result = new LocalMovie(_tmpId,_tmpTitle,_tmpPoster,_tmpYear,_tmpCountry,_tmpImdbRating);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAll(final Continuation<? super List<LocalMovie>> $completion) {
    final String _sql = "SELECT * FROM theMovie";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<LocalMovie>>() {
      @Override
      @NonNull
      public List<LocalMovie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfImdbRating = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbRating");
          final List<LocalMovie> _result = new ArrayList<LocalMovie>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final LocalMovie _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpImdbRating;
            if (_cursor.isNull(_cursorIndexOfImdbRating)) {
              _tmpImdbRating = null;
            } else {
              _tmpImdbRating = _cursor.getString(_cursorIndexOfImdbRating);
            }
            _item = new LocalMovie(_tmpId,_tmpTitle,_tmpPoster,_tmpYear,_tmpCountry,_tmpImdbRating);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final String taskId, final Continuation<? super LocalMovie> $completion) {
    final String _sql = "SELECT * FROM theMovie WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, taskId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<LocalMovie>() {
      @Override
      @Nullable
      public LocalMovie call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfImdbRating = CursorUtil.getColumnIndexOrThrow(_cursor, "imdbRating");
          final LocalMovie _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPoster;
            if (_cursor.isNull(_cursorIndexOfPoster)) {
              _tmpPoster = null;
            } else {
              _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpImdbRating;
            if (_cursor.isNull(_cursorIndexOfImdbRating)) {
              _tmpImdbRating = null;
            } else {
              _tmpImdbRating = _cursor.getString(_cursorIndexOfImdbRating);
            }
            _result = new LocalMovie(_tmpId,_tmpTitle,_tmpPoster,_tmpYear,_tmpCountry,_tmpImdbRating);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
