/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql

/**
  * Catalyst is a library for manipulating relational query plans.  All classes in catalyst are
  * considered an internal API to Spark SQL and are subject to change between minor releases.
  */
package object catalyst {

    /**
      * A JVM-global lock that should be used to prevent thread safety issues when using things in
      * scala.reflect.*.  Note that Scala Reflection API is made thread-safe in 2.11, but not yet for
      * 2.10.* builds.  See SI-6240 for more details.
      */
    protected[sql] object ScalaReflectionLock

}
