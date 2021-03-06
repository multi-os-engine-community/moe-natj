/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natj.cxx.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method as a C++ field getter. Static methods will be marked as static field getters.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD
})
public @interface CxxFieldGetter {
    /**
     * Field's name, by default the Java methods name.
     *
     * @return field's name
     */
    String value() default "";
}
