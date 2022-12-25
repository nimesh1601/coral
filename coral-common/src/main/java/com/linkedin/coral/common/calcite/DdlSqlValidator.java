/**
 * Copyright 2022 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.coral.common.calcite;

import org.apache.calcite.sql.SqlNode;


public interface DdlSqlValidator {

  void validate(SqlNode ddlSqlNode);
}