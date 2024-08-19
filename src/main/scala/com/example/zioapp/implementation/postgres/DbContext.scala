package com.example.zioapp
package implementation
package postgres

import com.example.quill.CustomQuillNamingStrategy
import io.getquill.PostgresZioJdbcContext

lazy val DbContext = new PostgresZioJdbcContext(CustomQuillNamingStrategy)
