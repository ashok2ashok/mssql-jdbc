/*
 * Microsoft JDBC Driver for SQL Server
 * 
 * Copyright(c) Microsoft Corporation All rights reserved.
 * 
 * This program is made available under the terms of the MIT License. See the LICENSE file in the project root for more information.
 */

package com.microsoft.sqlserver.testframework.sqlType;

import java.sql.JDBCType;
import java.util.concurrent.ThreadLocalRandom;

public class SqlTinyInt extends SqlNumber {

    public SqlTinyInt() {
        super("tinyint", JDBCType.TINYINT, 3,	// precision
                0,	// scale
                SqlTypeValue.TINYINT.minValue, SqlTypeValue.TINYINT.maxValue, SqlTypeValue.TINYINT.nullValue);
    }

    public Object createdata() {
        // TODO: include max value
        return new Short((short) ThreadLocalRandom.current().nextInt((short) minvalue, ((short) maxvalue)));
    }
}