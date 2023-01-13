package org.example

import com.bertramlabs.plugins.hcl4j.HCLParser
import org.junit.jupiter.api.Test
import java.io.InputStream

class HclParserTest {

    @Test
    fun `should parse object without error`() {
        "/dev.tfvars".asResource().use {
            HCLParser().parse(it)
        }
    }

    private fun String.asResource(): InputStream? =
        object {}.javaClass.getResourceAsStream(this)
}