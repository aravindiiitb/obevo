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
package com.gs.obevo.db.impl.core.changetypes;

/**
 * Test methods in DbChangeIncrementalCommand.
 */
public class AbstractDbChangeTypeBehaviorTest {
    
/*  TODO put this back
    @Test
    public void testShouldApplyGrantsWhenOnlyWhitespaceBeforeCreateTable() throws Exception {
        final ChangeIncremental artifact = mock(ChangeIncremental.class);
        when(artifact.getConvertedContent()).thenReturn("     \n    \t    \n   create  \n  \t  table foo");
        when(artifact.getApplyGrants()).thenReturn(null);

        final DbChangeIncrementalCommand command = new DbChangeIncrementalCommand(artifact, null, null, null);
        Assert.assertTrue(command.shouldApplyGrants());
    }

    @Test
    public void testShouldApplyGrantsWhenCommentsBeforeCreateTable() throws Exception {
        final ChangeIncremental artifact = mock(ChangeIncremental.class);
        when(artifact.getConvertedContent()).thenReturn("// Here's a comment\n*/
/* and another one *//*
\ncreate table bar");
        when(artifact.getApplyGrants()).thenReturn(null);

        final DbChangeIncrementalCommand command = new DbChangeIncrementalCommand(artifact, null, null, null);
        Assert.assertTrue(command.shouldApplyGrants());
    }

    @Test
    public void testShouldNotApplyGrantsWhenNoCreateTable() throws Exception {
        final ChangeIncremental artifact = mock(ChangeIncremental.class);
        when(artifact.getConvertedContent()).thenReturn("alter table leg");
        when(artifact.getApplyGrants()).thenReturn(null);

        final DbChangeIncrementalCommand command = new DbChangeIncrementalCommand(artifact, null, null, null);
        Assert.assertFalse(command.shouldApplyGrants());
    }


    @Test
    public void testShouldNotApplyGrantsWhenAddingACreatetableColumn() throws Exception {
        final ChangeIncremental artifact = mock(ChangeIncremental.class);
        when(artifact.getConvertedContent()).thenReturn("alter table might_happen add createtable int null");
        when(artifact.getApplyGrants()).thenReturn(null);

        final DbChangeIncrementalCommand command = new DbChangeIncrementalCommand(artifact, null, null, null);
        Assert.assertFalse(command.shouldApplyGrants());
    }

    @Test
    public void testShouldApplyGrantsOverrideToFalse() throws Exception {
        final ChangeIncremental artifact = mock(ChangeIncremental.class);
        when(artifact.getConvertedContent()).thenReturn("     \n    \t    \n   create  \n  \t  table foo");
        when(artifact.getApplyGrants()).thenReturn(false);

        final DbChangeIncrementalCommand command = new DbChangeIncrementalCommand(artifact, null, null, null);
        Assert.assertFalse(command.shouldApplyGrants());
    }

    @Test
    public void testShouldApplyGrantsOverrideToTrue() throws Exception {
        final ChangeIncremental artifact = mock(ChangeIncremental.class);
        when(artifact.getConvertedContent()).thenReturn("alter table leg");
        when(artifact.getApplyGrants()).thenReturn(true);

        final DbChangeIncrementalCommand command = new DbChangeIncrementalCommand(artifact, null, null, null);
        Assert.assertTrue(command.shouldApplyGrants());
    }
*/
}