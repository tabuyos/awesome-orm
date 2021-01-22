package com.tabuyos.awesomeorm.annotation.test;

import com.tabuyos.awesomeorm.annotation.Column;
import com.tabuyos.awesomeorm.annotation.Table;
import com.tabuyos.awesomeorm.annotation.entity.Model;
import com.tabuyos.awesomeorm.common.enums.DbType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>Description: </p>
 * <pre>
 *   <b>project: </b><i>awesome-orm</i>
 *   <b>package: </b><i>com.tabuyos.awesomeorm.test</i>
 *   <b>class: </b><i>AnnotationTest</i>
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
 * @since 0.1.0 - 1/22/21 1:32 PM
 */
public class AnnotationTest {

  @BeforeEach
  void setUp() {
    System.out.println("=============================== before ===============================");
  }

  @AfterEach
  void tearDown() {
    System.out.println("=============================== after ================================");
  }

  @Test
  void testAnnotation() {
    String value = Model.class.getAnnotation(Table.class)
                              .value();
    System.out.println(value);
    Field[] fields = Model.class.getDeclaredFields();
    for (Field field : fields) {
      Annotation[] annotations = field.getAnnotations();
      for (Annotation annotation : annotations) {
        Annotation[] annotations1 = annotation.annotationType()
                                              .getAnnotations();
        for (Annotation annotation1 : annotations1) {
          System.out.println(annotation1);
        }
      }
      System.out.println("=========================");
    }
  }

  @Test
  void testEquals() {
    Model model1 = new Model();
    model1.setAge("12");
    model1.setName("tabuyos");
    Model model2 = new Model();
    model2.setAge("12");
    model2.setName("tabuyos");
    // 比较地址
    System.out.println(model1 == model2);
    // 重写后比较的是age
    System.out.println(model1.equals(model2));
    System.out.println(model1.hashCode());
    System.out.println(model2.hashCode());
    HashSet<Model> hashSet = new HashSet<>();
    hashSet.add(model1);
    hashSet.add(model2);
    System.out.println(hashSet);
  }
}
