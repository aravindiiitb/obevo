--
-- Copyright 2017 Goldman Sachs.
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
--
--     http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing,
-- software distributed under the License is distributed on an
-- "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
-- KIND, either express or implied.  See the License for the
-- specific language governing permissions and limitations
-- under the License.
--

//// CHANGE name=chng1 dependencies="TABLE_A.chng1"
INSERT INTO TABLE_A (A_ID, A_VAL, B_ID) VALUES (3, '3', null)
GO

//// CHANGE name=chng2
INSERT INTO TABLE_A (A_ID, A_VAL, B_ID) VALUES (4, '4', null)
GO
