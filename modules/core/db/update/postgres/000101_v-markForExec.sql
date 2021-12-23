
-- Aufgund des in den automatisch erzeugten Update-Scripts angewendeten keyword "cascade" werden Views ggf. gelöscht.
-- Mit diesem manuell auszuführenden Script werden alle mit 990101_v startenden View-Script durch Löschung
-- in der Tabelle sys_db_changelog für die erneute Ausführung markiert.
DELETE FROM
  public.sys_db_changelog
WHERE
  script_name LIKE '50-sqlcuba/update/postgres/990101_v%'
;