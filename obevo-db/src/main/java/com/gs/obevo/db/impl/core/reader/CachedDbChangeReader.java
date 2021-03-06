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
package com.gs.obevo.db.impl.core.reader;

import com.gs.obevo.api.appdata.Change;
import com.gs.obevo.db.api.platform.DbDeployerAppContext;
import org.eclipse.collections.api.block.function.Function0;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.map.ConcurrentMutableMap;
import org.eclipse.collections.impl.map.mutable.ConcurrentHashMap;

/**
 * DbChangeReader implementation that caches an underlying DbChangeReader based on the useBaseline parameter passed in.
 * The caching is here so that the {@link DbDeployerAppContext} can be reused for deployments but only read the file
 * system once to save time. The biggest usecase for this is for unit tests.
 */
public class CachedDbChangeReader implements DbChangeReader {
    private final DbChangeReader dbChangeReader;
    private final ConcurrentMutableMap<Boolean, ImmutableList<Change>> cachedResults = new ConcurrentHashMap<Boolean, ImmutableList<Change>>();

    public CachedDbChangeReader(DbChangeReader dbChangeReader) {
        this.dbChangeReader = dbChangeReader;
    }

    @Override
    public ImmutableList<Change> readChanges(final boolean useBaseline) {
        return cachedResults.getIfAbsentPut(useBaseline, new Function0<ImmutableList<Change>>() {
            @Override
            public ImmutableList<Change> value() {
                return dbChangeReader.readChanges(useBaseline);
            }
        });
    }
}
