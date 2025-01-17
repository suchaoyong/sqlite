/*
** 2023-07-21
**
** The author disclaims copyright to this source code.  In place of
** a legal notice, here is a blessing:
**
**    May you do good and not evil.
**    May you find forgiveness for yourself and forgive others.
**    May you share freely, never taking more than you give.
**
*************************************************************************
** This file is part of the JNI bindings for the sqlite3 C API.
*/
package org.sqlite.jni;

/**
   This enum contains all of the core and "extended" result codes used
   by the sqlite3 library. It is provided not for use with the C-style
   API (with which it won't work) but for higher-level code which may
   find it useful to map SQLite result codes to human-readable names.
*/
public enum ResultCode {
  SQLITE_OK(CApi.SQLITE_OK),
  SQLITE_ERROR(CApi.SQLITE_ERROR),
  SQLITE_INTERNAL(CApi.SQLITE_INTERNAL),
  SQLITE_PERM(CApi.SQLITE_PERM),
  SQLITE_ABORT(CApi.SQLITE_ABORT),
  SQLITE_BUSY(CApi.SQLITE_BUSY),
  SQLITE_LOCKED(CApi.SQLITE_LOCKED),
  SQLITE_NOMEM(CApi.SQLITE_NOMEM),
  SQLITE_READONLY(CApi.SQLITE_READONLY),
  SQLITE_INTERRUPT(CApi.SQLITE_INTERRUPT),
  SQLITE_IOERR(CApi.SQLITE_IOERR),
  SQLITE_CORRUPT(CApi.SQLITE_CORRUPT),
  SQLITE_NOTFOUND(CApi.SQLITE_NOTFOUND),
  SQLITE_FULL(CApi.SQLITE_FULL),
  SQLITE_CANTOPEN(CApi.SQLITE_CANTOPEN),
  SQLITE_PROTOCOL(CApi.SQLITE_PROTOCOL),
  SQLITE_EMPTY(CApi.SQLITE_EMPTY),
  SQLITE_SCHEMA(CApi.SQLITE_SCHEMA),
  SQLITE_TOOBIG(CApi.SQLITE_TOOBIG),
  SQLITE_CONSTRAINT(CApi.SQLITE_CONSTRAINT),
  SQLITE_MISMATCH(CApi.SQLITE_MISMATCH),
  SQLITE_MISUSE(CApi.SQLITE_MISUSE),
  SQLITE_NOLFS(CApi.SQLITE_NOLFS),
  SQLITE_AUTH(CApi.SQLITE_AUTH),
  SQLITE_FORMAT(CApi.SQLITE_FORMAT),
  SQLITE_RANGE(CApi.SQLITE_RANGE),
  SQLITE_NOTADB(CApi.SQLITE_NOTADB),
  SQLITE_NOTICE(CApi.SQLITE_NOTICE),
  SQLITE_WARNING(CApi.SQLITE_WARNING),
  SQLITE_ROW(CApi.SQLITE_ROW),
  SQLITE_DONE(CApi.SQLITE_DONE),
  SQLITE_ERROR_MISSING_COLLSEQ(CApi.SQLITE_ERROR_MISSING_COLLSEQ),
  SQLITE_ERROR_RETRY(CApi.SQLITE_ERROR_RETRY),
  SQLITE_ERROR_SNAPSHOT(CApi.SQLITE_ERROR_SNAPSHOT),
  SQLITE_IOERR_READ(CApi.SQLITE_IOERR_READ),
  SQLITE_IOERR_SHORT_READ(CApi.SQLITE_IOERR_SHORT_READ),
  SQLITE_IOERR_WRITE(CApi.SQLITE_IOERR_WRITE),
  SQLITE_IOERR_FSYNC(CApi.SQLITE_IOERR_FSYNC),
  SQLITE_IOERR_DIR_FSYNC(CApi.SQLITE_IOERR_DIR_FSYNC),
  SQLITE_IOERR_TRUNCATE(CApi.SQLITE_IOERR_TRUNCATE),
  SQLITE_IOERR_FSTAT(CApi.SQLITE_IOERR_FSTAT),
  SQLITE_IOERR_UNLOCK(CApi.SQLITE_IOERR_UNLOCK),
  SQLITE_IOERR_RDLOCK(CApi.SQLITE_IOERR_RDLOCK),
  SQLITE_IOERR_DELETE(CApi.SQLITE_IOERR_DELETE),
  SQLITE_IOERR_BLOCKED(CApi.SQLITE_IOERR_BLOCKED),
  SQLITE_IOERR_NOMEM(CApi.SQLITE_IOERR_NOMEM),
  SQLITE_IOERR_ACCESS(CApi.SQLITE_IOERR_ACCESS),
  SQLITE_IOERR_CHECKRESERVEDLOCK(CApi.SQLITE_IOERR_CHECKRESERVEDLOCK),
  SQLITE_IOERR_LOCK(CApi.SQLITE_IOERR_LOCK),
  SQLITE_IOERR_CLOSE(CApi.SQLITE_IOERR_CLOSE),
  SQLITE_IOERR_DIR_CLOSE(CApi.SQLITE_IOERR_DIR_CLOSE),
  SQLITE_IOERR_SHMOPEN(CApi.SQLITE_IOERR_SHMOPEN),
  SQLITE_IOERR_SHMSIZE(CApi.SQLITE_IOERR_SHMSIZE),
  SQLITE_IOERR_SHMLOCK(CApi.SQLITE_IOERR_SHMLOCK),
  SQLITE_IOERR_SHMMAP(CApi.SQLITE_IOERR_SHMMAP),
  SQLITE_IOERR_SEEK(CApi.SQLITE_IOERR_SEEK),
  SQLITE_IOERR_DELETE_NOENT(CApi.SQLITE_IOERR_DELETE_NOENT),
  SQLITE_IOERR_MMAP(CApi.SQLITE_IOERR_MMAP),
  SQLITE_IOERR_GETTEMPPATH(CApi.SQLITE_IOERR_GETTEMPPATH),
  SQLITE_IOERR_CONVPATH(CApi.SQLITE_IOERR_CONVPATH),
  SQLITE_IOERR_VNODE(CApi.SQLITE_IOERR_VNODE),
  SQLITE_IOERR_AUTH(CApi.SQLITE_IOERR_AUTH),
  SQLITE_IOERR_BEGIN_ATOMIC(CApi.SQLITE_IOERR_BEGIN_ATOMIC),
  SQLITE_IOERR_COMMIT_ATOMIC(CApi.SQLITE_IOERR_COMMIT_ATOMIC),
  SQLITE_IOERR_ROLLBACK_ATOMIC(CApi.SQLITE_IOERR_ROLLBACK_ATOMIC),
  SQLITE_IOERR_DATA(CApi.SQLITE_IOERR_DATA),
  SQLITE_IOERR_CORRUPTFS(CApi.SQLITE_IOERR_CORRUPTFS),
  SQLITE_LOCKED_SHAREDCACHE(CApi.SQLITE_LOCKED_SHAREDCACHE),
  SQLITE_LOCKED_VTAB(CApi.SQLITE_LOCKED_VTAB),
  SQLITE_BUSY_RECOVERY(CApi.SQLITE_BUSY_RECOVERY),
  SQLITE_BUSY_SNAPSHOT(CApi.SQLITE_BUSY_SNAPSHOT),
  SQLITE_BUSY_TIMEOUT(CApi.SQLITE_BUSY_TIMEOUT),
  SQLITE_CANTOPEN_NOTEMPDIR(CApi.SQLITE_CANTOPEN_NOTEMPDIR),
  SQLITE_CANTOPEN_ISDIR(CApi.SQLITE_CANTOPEN_ISDIR),
  SQLITE_CANTOPEN_FULLPATH(CApi.SQLITE_CANTOPEN_FULLPATH),
  SQLITE_CANTOPEN_CONVPATH(CApi.SQLITE_CANTOPEN_CONVPATH),
  SQLITE_CANTOPEN_SYMLINK(CApi.SQLITE_CANTOPEN_SYMLINK),
  SQLITE_CORRUPT_VTAB(CApi.SQLITE_CORRUPT_VTAB),
  SQLITE_CORRUPT_SEQUENCE(CApi.SQLITE_CORRUPT_SEQUENCE),
  SQLITE_CORRUPT_INDEX(CApi.SQLITE_CORRUPT_INDEX),
  SQLITE_READONLY_RECOVERY(CApi.SQLITE_READONLY_RECOVERY),
  SQLITE_READONLY_CANTLOCK(CApi.SQLITE_READONLY_CANTLOCK),
  SQLITE_READONLY_ROLLBACK(CApi.SQLITE_READONLY_ROLLBACK),
  SQLITE_READONLY_DBMOVED(CApi.SQLITE_READONLY_DBMOVED),
  SQLITE_READONLY_CANTINIT(CApi.SQLITE_READONLY_CANTINIT),
  SQLITE_READONLY_DIRECTORY(CApi.SQLITE_READONLY_DIRECTORY),
  SQLITE_ABORT_ROLLBACK(CApi.SQLITE_ABORT_ROLLBACK),
  SQLITE_CONSTRAINT_CHECK(CApi.SQLITE_CONSTRAINT_CHECK),
  SQLITE_CONSTRAINT_COMMITHOOK(CApi.SQLITE_CONSTRAINT_COMMITHOOK),
  SQLITE_CONSTRAINT_FOREIGNKEY(CApi.SQLITE_CONSTRAINT_FOREIGNKEY),
  SQLITE_CONSTRAINT_FUNCTION(CApi.SQLITE_CONSTRAINT_FUNCTION),
  SQLITE_CONSTRAINT_NOTNULL(CApi.SQLITE_CONSTRAINT_NOTNULL),
  SQLITE_CONSTRAINT_PRIMARYKEY(CApi.SQLITE_CONSTRAINT_PRIMARYKEY),
  SQLITE_CONSTRAINT_TRIGGER(CApi.SQLITE_CONSTRAINT_TRIGGER),
  SQLITE_CONSTRAINT_UNIQUE(CApi.SQLITE_CONSTRAINT_UNIQUE),
  SQLITE_CONSTRAINT_VTAB(CApi.SQLITE_CONSTRAINT_VTAB),
  SQLITE_CONSTRAINT_ROWID(CApi.SQLITE_CONSTRAINT_ROWID),
  SQLITE_CONSTRAINT_PINNED(CApi.SQLITE_CONSTRAINT_PINNED),
  SQLITE_CONSTRAINT_DATATYPE(CApi.SQLITE_CONSTRAINT_DATATYPE),
  SQLITE_NOTICE_RECOVER_WAL(CApi.SQLITE_NOTICE_RECOVER_WAL),
  SQLITE_NOTICE_RECOVER_ROLLBACK(CApi.SQLITE_NOTICE_RECOVER_ROLLBACK),
  SQLITE_WARNING_AUTOINDEX(CApi.SQLITE_WARNING_AUTOINDEX),
  SQLITE_AUTH_USER(CApi.SQLITE_AUTH_USER),
  SQLITE_OK_LOAD_PERMANENTLY(CApi.SQLITE_OK_LOAD_PERMANENTLY);

  public final int value;

  ResultCode(int rc){
    value = rc;
    ResultCodeMap.set(rc, this);
  }

  /**
     Returns the entry from this enum for the given result code, or
     null if no match is found.
  */
  public static ResultCode getEntryForInt(int rc){
    return ResultCodeMap.get(rc);
  }

  /**
     Internal level of indirection required because we cannot initialize
     static enum members in an enum before the enum constructor is
     invoked.
  */
  private static final class ResultCodeMap {
    private static final java.util.Map<Integer,ResultCode> i2e
      = new java.util.HashMap<>();
    private static void set(int rc, ResultCode e){ i2e.put(rc, e); }
    private static ResultCode get(int rc){ return i2e.get(rc); }
  }

}
