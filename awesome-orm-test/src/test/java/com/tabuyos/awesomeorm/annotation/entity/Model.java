package com.tabuyos.awesomeorm.annotation.entity;

import com.tabuyos.awesomeorm.annotation.Column;
import com.tabuyos.awesomeorm.annotation.PrimaryKey;
import com.tabuyos.awesomeorm.annotation.Table;

/**
 * <p>Description: </p>
 * <pre>
 *   <b>project: </b><i>awesome-orm</i>
 *   <b>package: </b><i>com.tabuyos.awesomeorm.annotation.entity</i>
 *   <b>class: </b><i>Model</i>
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
 * @version 0.1.0
 * @since 0.1.0 - 1/22/21 1:33 PM
 */
@Table("model")
public class Model {
  @PrimaryKey("id")
  private long id;
  @Column
  private String name;
  @Column
  private String age;
  @Column
  private String pass;
}
