/**
 * Copyright (c) 2013-2019 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.locationtech.geowave.test.TestUtils;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface NamespaceOverride {

  /** @return the namespace to associate the store with */
  public String value() default TestUtils.TEST_NAMESPACE;
}