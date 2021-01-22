package com.tabuyos.awesomeorm.common.enums;

/**
 * <p>Description: </p>
 * <pre>
 *   <b>project: </b><i>awesome-orm</i>
 *   <b>package: </b><i>com.tabuyos.awesomeorm.common.enums</i>
 *   <b>class: </b><i>DBType</i>
 *   comment here.
 * </pre>
 *
 * @author <pre><b>username: </b><i><a href="http://www.tabuyos.com">Tabuyos</a></i></pre>
 * <pre><b>site: </b><i><a href="http://www.tabuyos.com">http://www.tabuyos.com</a></i></pre>
 * <pre><b>email: </b><i>tabuyos@outlook.com</i></pre>
 * <pre><b>description: </b><i>
 *   <pre>
 *     Talk is cheap, show me the code.
 *   </pre>
 * </i></pre>
 * @version 0.1.0-SNAPSHOT
 * @since 0.1.0-SNAPSHOT - 1/22/21 2:03 PM
 */
public enum DbType {


  /**
   * MYSQL
   */
  MYSQL("mysql", "MySql数据库"),
  /**
   * MARIADB
   */
  MARIADB("mariadb", "MariaDB数据库"),
  /**
   * ORACLE
   */
  ORACLE("oracle", "Oracle11g及以下数据库(高版本推荐使用ORACLE_NEW)"),
  /**
   * oracle12c new pagination
   */
  ORACLE_12C("oracle12c", "Oracle12c+数据库"),
  /**
   * DB2
   */
  DB2("db2", "DB2数据库"),
  /**
   * H2
   */
  H2("h2", "H2数据库"),
  /**
   * HSQL
   */
  HSQL("hsql", "HSQL数据库"),
  /**
   * SQLITE
   */
  SQLITE("sqlite", "SQLite数据库"),
  /**
   * POSTGRE
   */
  POSTGRE_SQL("postgresql", "Postgre数据库"),
  /**
   * SQLSERVER2005
   */
  SQL_SERVER2005("sqlserver2005", "SQLServer2005数据库"),
  /**
   * SQLSERVER
   */
  SQL_SERVER("sqlserver", "SQLServer数据库"),
  /**
   * DM
   */
  DM("dm", "达梦数据库"),
  /**
   * xugu
   */
  XU_GU("xugu", "虚谷数据库"),
  /**
   * Kingbase
   */
  KINGBASE_ES("kingbasees", "人大金仓数据库"),
  /**
   * Phoenix
   */
  PHOENIX("phoenix", "Phoenix HBase数据库"),
  /**
   * Gauss
   */
  GAUSS("zenith", "Gauss 数据库"),
  /**
   * ClickHouse
   */
  CLICK_HOUSE("clickhouse", "clickhouse 数据库"),
  /**
   * GBase
   */
  GBASE("gbase", "南大通用数据库"),
  /**
   * Oscar
   */
  OSCAR("oscar", "神通数据库"),
  /**
   * Sybase
   */
  SYBASE("sybase", "Sybase ASE 数据库"),
  /**
   * OceanBase
   */
  OCEAN_BASE("oceanbase", "OceanBase 数据库"),
  /**
   * Firebird
   */
  FIREBIRD("Firebird", "Firebird 数据库"),
  /**
   * UNKONWN DB
   */
  OTHER("other", "其他数据库");

  /**
   * 数据库名称
   */
  private final String db;
  /**
   * 描述
   */
  private final String desc;

  DbType(String db, String desc) {
    this.db = db;
    this.desc = desc;
  }

  /**
   * 获取数据库类型
   *
   * @param dbType 数据库类型字符串
   */
  public static DbType getDbType(String dbType) {
    for (DbType type : DbType.values()) {
      if (type.db.equalsIgnoreCase(dbType)) {
        return type;
      }
    }
    return OTHER;
  }

  public String getDb() {
    return db;
  }

  public String getDesc() {
    return desc;
  }
}
