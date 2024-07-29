package org.huzi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//annotation表示注解


//@Retention (RetentionPolicy.RUNTIME)是Java注解中的一个元注解，用于指定被注解的元素在什么时候有效。
@Retention(RetentionPolicy.RUNTIME)
//Target表示即该注解可以声明在哪些目标元素之前，也可理解为注释类型的程序元素的种类。
/**
 * ElementType.PACKAGE：该注解只能声明在一个包名前。
 * ElementType.ANNOTATION_TYPE：该注解只能声明在一个注解类型前。
 * ElementType.TYPE：该注解只能声明在一个类前。
 * ElementType.CONSTRUCTOR：该注解只能声明在一个类的构造方法前。
 * ElementType.LOCAL_VARIABLE：该注解只能声明在一个局部变量前。
 * ElementType.METHOD：该注解只能声明在一个类的方法前。
 * ElementType.PARAMETER：该注解只能声明在一个方法参数前。
 * ElementType.FIELD：该注解只能声明在一个类的字段前。
 */
@Target({ElementType.FIELD})
public @interface Column {
    /**
     * 列名
     *
     * @return 列名
     */
    String name();
}
