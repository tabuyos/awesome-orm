package com.tabuyos.awesomeorm.annotation.entity;

import com.tabuyos.awesomeorm.annotation.Column;
import com.tabuyos.awesomeorm.annotation.LogicDeleted;
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
  @LogicDeleted
  private String deleted;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getDeleted() {
    return deleted;
  }

  public void setDeleted(String deleted) {
    this.deleted = deleted;
  }

  @Override
  public String toString() {
    return "Model{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age='" + age + '\'' +
        ", pass='" + pass + '\'' +
        ", deleted='" + deleted + '\'' +
        '}';
  }

  // 重写equals, 仅比较age, 相同则认为同一个对象
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Model) {
      return this.age.equals(((Model) obj).getAge());
    } else {
      return false;
    }
  }

  // 重写equals则必须重写hashCode, 见AnnotationTest#testEquals方法中的hashSet测试
  @Override
  public int hashCode() {
    return 12;
  }
}
