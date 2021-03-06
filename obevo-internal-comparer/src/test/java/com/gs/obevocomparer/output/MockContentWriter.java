/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.gs.obevocomparer.output;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MockContentWriter implements CatoContentWriter {

    final List<CatoContentRow> rows = new ArrayList<CatoContentRow>();

    public List<CatoContentRow> getRows() {
        return this.rows;
    }

    public void writeRow(CatoContentRow row) throws IOException {
        this.rows.add(row);
    }

    @Override
    public void openContent(CatoContentMetadata contentMetadata) {
    }

    @Override
    public void closeContent() throws IOException {
    }

    @Override
    public void closeWriter() throws IOException {
    }
}
