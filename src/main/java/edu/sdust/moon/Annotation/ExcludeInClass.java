package edu.sdust.moon.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 排除此事件在某些QQ上运行的注释,只能用于Class上
 */
@Target (ElementType.TYPE)
public @interface ExcludeInClass {
    long[] values();
}