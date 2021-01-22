package com.tabuyos.awesomeorm.annotation;

import com.tabuyos.awesomeorm.common.enums.KeyType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Description: </p>
 * <pre>
 *   <b>project: </b><i>awesome-orm</i>
 *   <b>package: </b><i>com.tabuyos.awesomeorm.annotation</i>
 *   <b>class: </b><i>PrimeryKey</i>
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
 * @since 0.1.0-SNAPSHOT - 1/22/21 11:21 AM
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Column
public @interface PrimaryKey {

  /**
   * table's primary key
   *
   * @return table's primary key
   */
  String value() default "";

  /**
   * primary key type
   *
   * @return primary key type
   */
  KeyType type() default KeyType.NONE;
}
