package edu.sdust.moon.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 排除此事件在某些QQ的某一个群，群成员或好友上运行的注释,只能用于Method上
 */
@Target (ElementType.METHOD)
public @interface ExcludeInMethod {
    long[] values();
}
