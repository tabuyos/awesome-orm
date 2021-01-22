package com.tabuyos.awesomeorm.common.enums;

/**
 * <p>Description: </p>
 * <pre>
 *   <b>project: </b><i>awesome-orm</i>
 *   <b>package: </b><i>com.tabuyos.awesomeorm.common.enums</i>
 *   <b>class: </b><i>KeyType</i>
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
 * @since 0.1.0-SNAPSHOT - 1/22/21 11:26 AM
 */
public enum KeyType {

  /**
   * 数据库ID自增
   */
  AUTO(0),
  /**
   * 该类型为未设置主键类型
   */
  NONE(1),
  /**
   * 用户输入ID
   */
  INPUT(2);

  private final int key;

  KeyType(int key) {
    this.key = key;
  }

  public int getKey() {
    return key;
  }
}
