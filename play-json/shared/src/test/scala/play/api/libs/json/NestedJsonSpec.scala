/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.api.libs.json

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

final class NestedJsonSpec extends AnyWordSpec with Matchers {
  "play-json parsing" should {
    "work for deeply nested json" in {
      val json = createNested(60000, "{\"a\":", "42", "}")
      val parsed = Json.parse(json)
      parsed must not be null
    }
  }

  private def createNested(nesting: Int, open: String, middle: String, close: String): String = {
    val sb = new StringBuilder(2 * nesting)
    (0 until nesting).map { _ =>
      sb.append(open)
    }
    sb.append(middle)
    (0 until nesting).map { _ =>
      sb.append(close)
    }
    sb.toString()
  }
}
